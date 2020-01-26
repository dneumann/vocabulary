package dn.vocabulary;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class OldStuffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_stuff);
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

    public void startExamUnit1Sentences1(View view) {
        startExam("Unit1Sentences1", view);
    }

    public void startExamUnit1Sentences2(View view) {
        startExam("Unit1Sentences2", view);
    }

    public void startExamUnit1Sentences3(View view) {
        startExam("Unit1Sentences3", view);
    }

    public void startExamUnit1Sentences4(View view) {
        startExam("Unit1Sentences4", view);
    }

    public void startExamGerman1(View view) {
        startExam("deutsch1", view);
    }

    public void startExamGerman2(View view) {
        startExam("deutsch2", view);
    }

    public void startUnit1chaos(View view) {
        startExam("Unit1chaos", view);
    }
    public void startNorik1(View view) {
        startExam("Norik1", view);
    }

    public void startNorik2(View view) {
        startExam("Norik2", view);
    }

    public void startUnit2(View view) {
        startExam("Unit2", view);
    }

    public void startUnit2sentences(View view) {
        startExam("Unit2sentences", view);
    }

    public void startUnit2a(View view) {
        startExam("Unit2a", view);
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
