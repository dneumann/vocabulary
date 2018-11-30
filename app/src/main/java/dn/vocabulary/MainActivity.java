package dn.vocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startExamUnit1(View view) {
        startExam("Unit1", view);
    }

    public void startExamUnit1a(View view) {
        startExam("Unit1a", view);
    }

    public void startExamUnit1b(View view) {
        startExam("Unit1b", view);
    }

    public void startExamUnit1c(View view) {
        startExam("Unit1c", view);
    }

    public void startExamUnit1cSentences1(View view) {
        startExam("Unit1cSentences1", view);
    }

    public void startExamUnit1cSentences2(View view) {
        startExam("Unit1cSentences2", view);
    }

    public void startExamGerman1(View view) {
        startExam("deutsch1", view);
    }

    public void startExamGerman2(View view) {
        startExam("deutsch2", view);
    }

    private void startExam(String number, View view) {
        Switch randomSwitch = findViewById(R.id.switch_random);
        boolean randomize = randomSwitch.isChecked();
        Switch writingSwitch = findViewById(R.id.switch_writing);
        boolean withWriting = writingSwitch.isChecked();
        String examDescription = ((TextView)view).getText().toString();

        Intent startsExam = new Intent(this, ExamActivity.class);
        startsExam.putExtra("examNumber", number);
        startsExam.putExtra("randomize", randomize);
        startsExam.putExtra("withWriting", withWriting);
        startsExam.putExtra("examDescription", examDescription);
        startActivity(startsExam);
    }

}
