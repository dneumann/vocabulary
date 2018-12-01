package dn.vocabulary;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamActivity extends AppCompatActivity {

    private StateChanger stateChanger = new StateChanger();
    private ViewChanger viewChanger = new ViewChanger();
    private int correctAnswers = 0;
    private boolean withWriting = true;
    private String examDescription;
    private MediaPlayer sound;
    private List<Integer> happySoundEffects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        happySoundEffects.add(R.raw.item_collected);
        happySoundEffects.add(R.raw.yeahh);
        happySoundEffects.add(R.raw.yess);
        Bundle extras = getIntent().getExtras();
        String examNumber = extras.getString("examNumber");
        boolean randomize = extras.getBoolean("randomize");
        withWriting = extras.getBoolean("withWriting");
        examDescription = extras.getString("examDescription");
        stateChanger.generateNewExam(examNumber, randomize, withWriting);

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
                    startHappySound();
                    correctAnswers++;
                }
                return;
            }
        }
    }

    private void startHappySound() {
        Collections.shuffle(happySoundEffects);
        if (sound != null) {
            sound.release();
        }
        sound = MediaPlayer.create(this, happySoundEffects.get(0));
        sound.start();
    }


    public void nextVocabulary(View v) {
        List<State> newStates = stateChanger.getNextVocabulary();
        if (newStates.isEmpty() && !withWriting) {
            Intent startsMain = new Intent(this, MainActivity.class);
            startActivity(startsMain);
        } else if (newStates.isEmpty()) {
            Intent startsResults = new Intent(this, ResultsActivity.class);
            startsResults.putExtra("correctAnswers", correctAnswers);
            startsResults.putExtra("allAnswers", stateChanger.getNumberOfQuestions());
            startsResults.putExtra("examDescription", examDescription);
            startActivity(startsResults);
        } else {
            viewChanger.applyNewStates(newStates, this);
        }
    }
}
