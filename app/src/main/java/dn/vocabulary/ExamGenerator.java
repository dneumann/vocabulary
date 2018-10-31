package dn.vocabulary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamGenerator {

    private List<V> vocabs = new ArrayList<>();

    public List<V> getExam(int number) {
        if (number == 1) {
            vocabs.add(new V("Fluss", "river"));
            vocabs.add(new V("Ozean", "ocean"));
            vocabs.add(new V("Meer", "sea"));
        }
        Collections.shuffle(vocabs);
        return vocabs;
    }
}
