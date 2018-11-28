package dn.vocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startExamUnit1b(View view) {
        startExam("Unit1b");
    }

    public void startExamUnit1c(View view) {
        startExam("Unit1c");
    }

    public void startExamUnit1cSentences(View view) {
        startExam("Unit1cSentences");
    }

    public void startExamGerman1(View view) {
        startExam("deutsch1");
    }

    public void startExamGerman2(View view) {
        startExam("deutsch2");
    }

    private void startExam(String number) {
        Switch randomSwitch = findViewById(R.id.switch_random);
        boolean randomize = randomSwitch.isChecked();
        Intent startsExam = new Intent(this, ExamActivity.class);
        startsExam.putExtra("examNumber", number);
        startsExam.putExtra("randomize", randomize);
        startActivity(startsExam);
    }

}
