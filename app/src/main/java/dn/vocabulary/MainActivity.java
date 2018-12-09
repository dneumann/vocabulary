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

    public void startUnit1chaos(View view) {
        startExam("Unit1chaos", view);
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

    public void startNorik1(View view) {
        startExam("Norik1", view);
    }

    public void startNorik2(View view) {
        startExam("Norik2", view);
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

    public void oldStuff(View view) {
        Intent startsOldStuff = new Intent(this, OldStuffActivity.class);
        startActivity(startsOldStuff);
    }

}
