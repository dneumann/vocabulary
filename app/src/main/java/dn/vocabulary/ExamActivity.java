package dn.vocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class ExamActivity extends AppCompatActivity {

    private StateChanger stateChanger = new StateChanger();
    private ViewChanger viewChanger = new ViewChanger();

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

    public void nextVocabulary(View v) {
        List<State> newStates = stateChanger.getNextVocabulary();
        viewChanger.applyNewStates(newStates, this);
    }
}
