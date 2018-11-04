package dn.vocabulary;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;

public class ExamActivity extends AppCompatActivity {

    private StateChanger stateChanger = new StateChanger();
    private ViewChanger viewChanger = new ViewChanger();
    private int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle extras = getIntent().getExtras();
        String examNumber = extras.getString("examNumber");
        stateChanger.generateNewExam(examNumber);

        List<State> newStates = stateChanger.getNextVocabulary();
        viewChanger.applyNewStates(newStates, this);
    }

    public void checkAnswer(View v) {
        EditText enteredAnswer = findViewById(R.id.editText_unknownVocab);
        String answer = enteredAnswer.getText().toString();

        List<State> newStates = stateChanger.checkAnswer(answer);
        evaluateAnswer(newStates);
        viewChanger.applyNewStates(newStates, this);
    }
    private void evaluateAnswer(List<State> newStates) {
        for (State s : newStates) {
            if (s.id.equals("editText_unknownVocab")) {
                if ((int)s.getProp("setTextColor") == Color.GREEN) {
                    correctAnswers++;
                }
                return;
            }
        }
    }

    public void nextVocabulary(View v) {
        List<State> newStates = stateChanger.getNextVocabulary();
        if (newStates.isEmpty()) {
            Intent startsResults = new Intent(this, ResultsActivity.class);
            startsResults.putExtra("correctAnswers", correctAnswers);
            startsResults.putExtra("allAnswers", stateChanger.getNumberOfQuestions());
            startActivity(startsResults);
        } else {
            viewChanger.applyNewStates(newStates, this);
        }
    }
}
