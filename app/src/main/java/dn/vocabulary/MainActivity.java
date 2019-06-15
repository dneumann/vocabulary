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

    public void startUnit3(View view) {
        startExam("Unit3", view);
    }

    public void startUnit3a1(View view) {
        startExam("Unit3a1", view);
    }

    public void startUnit3a2(View view) {
        startExam("Unit3a2", view);
    }

    public void startUnit3b(View view) {
        startExam("Unit3b", view);
    }

    public void startUnit3c(View view) {
        startExam("Unit3c", view);
    }

    public void startUnit3d(View view) {
        startExam("Unit3d", view);
    }

    public void startUnit4(View view) {
        startExam("Unit4", view);
    }

    public void startUnit4a(View view) {
        startExam("Unit4a", view);
    }

    public void startUnit4b(View view) {
        startExam("Unit4b", view);
    }

    public void startUnit4c(View view) {
        startExam("Unit4c", view);
    }

    public void startUnit4d(View view) {
        startExam("Unit4d", view);
    }

    public void startUnit4e(View view) {
        startExam("Unit4e", view);
    }

    public void startUnit4past(View view) {
        startExam("Unit4past", view);
    }

    public void startDeutsch(View view) {
        startExam("DE", view);
    }

    private void startExam(String number, View view) {
        Switch randomSwitch = findViewById(R.id.switch_random);
        boolean randomize = randomSwitch.isChecked();
        startExam(number, randomize, view);
    }

    private void startExam(String number, boolean randomize, View view) {
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
