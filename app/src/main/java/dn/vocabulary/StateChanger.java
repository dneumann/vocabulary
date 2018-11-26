package dn.vocabulary;

import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StateChanger {

    private ExamGenerator examGenerator = new ExamGenerator();
    private List<Vocab> vocabs = new ArrayList<>();
    private Iterator<Vocab> iter;
    private Vocab currentVocab;
    private int index = 0;

    public void generateNewExam(String examNumber, boolean randomize) {
        vocabs = examGenerator.getExam(examNumber, randomize);
        iter = vocabs.iterator();
    }

    public int getNumberOfQuestions() {
        return vocabs.size();
    }

    public List<State> checkAnswer(String answer) {
        State correctVocab = State.create("textView_correctVocab", TextView.class)
                .with("setText", currentVocab.unknown);

        int color = 0;
        if (currentVocab.unknown.equals(answer.trim())) {
            color = Color.GREEN;
        } else {
            color = Color.RED;
        }
        State answerColor = State.create("editText_unknownVocab", EditText.class)
                .with("setTextColor", color);

        State buttonDisableCheck = State.create("button_checkAnswer", Button.class)
                .with("setEnabled", false);
        State buttonEnableNext = State.create("button_next", Button.class)
                .with("setEnabled", true);

        return list(correctVocab, answerColor, buttonDisableCheck, buttonEnableNext);
    }

    public List<State> getNextVocabulary() {
        if (!iter.hasNext()) {
            return new ArrayList<>();
        }

        currentVocab = iter.next();
        index++;
        State textView = State.create("textView_shownVocab", TextView.class)
                .with("setText", currentVocab.shown);
        State textView_status = State.create("textView_questionStatus", TextView.class)
                .with("setText", "Question number " + index + " of " + vocabs.size());
        State emptyAnswer = State.create("editText_unknownVocab", EditText.class)
                .with("setText", "")
                .with("setTextColor", Color.BLACK);
        State emptyCorrect = State.create("textView_correctVocab", TextView.class)
                .with("setText", "");

        State buttonCheck = State.create("button_checkAnswer", Button.class)
                .with("setEnabled", true);
        State buttonNext = State.create("button_next", Button.class)
                .with("setEnabled", false);

        return list(textView, textView_status, emptyAnswer, emptyCorrect, buttonCheck, buttonNext);
    }

    public List<State> showResults(int correctAnswers, int allAnswers) {
        State textView = State.create("textView_correctAnswers", TextView.class)
                .with("setText", correctAnswers + " of " + allAnswers);

        String grade = cumputeGrade((float) correctAnswers / (float) allAnswers * 100);
        State gradeState = State.create("textView_grade", TextView.class)
                .with("setText", grade);
        return list(textView, gradeState);
    }

    private String cumputeGrade(float percent) {
        if (percent == 100)
            return "1+";
        else if (percent >= 95 && percent < 100)
            return "1";
        else if (percent >= 90 && percent < 95)
            return "1-";
        else if (percent >= 85 && percent < 90)
            return "2+";
        else if (percent >= 80 && percent < 85)
            return "2";
        else if (percent >= 75 && percent < 80)
            return "2-";
        else if (percent >= 70 && percent < 75)
            return "3+";
        else if (percent >= 65 && percent < 70)
            return "3";
        else if (percent >= 60 && percent < 65)
            return "3-";
        else if (percent >= 55 && percent < 60)
            return "4+";
        else if (percent >= 50 && percent < 55)
            return "4";
        else if (percent >= 20 && percent < 50)
            return "5";
        else
            return "6";
    }


    private List<State> list(State... states) {
        return new ArrayList<>(Arrays.asList(states));
    }


}
