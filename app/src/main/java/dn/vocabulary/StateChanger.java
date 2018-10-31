package dn.vocabulary;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StateChanger {

    private ExamGenerator exam = new ExamGenerator();
    private List<V> vocabs;
    private Iterator<V> iter;

    public void generateNewExam(String examNumber) {
        int examNr = Integer.parseInt(examNumber);
        vocabs = exam.getExam(examNr);
        iter = vocabs.iterator();
    }

    public List<State> getNextVocabulary() {
        V vocab = null;
        if (iter.hasNext()) {
            vocab = iter.next();
        }
        State textView = State.create("textView_shownVocab", TextView.class)
                .with("setText", vocab.shown);
        return list(textView);
    }

    private List<State> list(State... states) {
        return new ArrayList<>(Arrays.asList(states));
    }


}
