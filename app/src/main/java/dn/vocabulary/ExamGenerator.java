package dn.vocabulary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamGenerator {

    private List<Vocab> vocabs = new ArrayList<>();

    public List<Vocab> getExam(int number) {
        if (number == 1) {
            vocabs.add(new Vocab("die Mitschülerin", "the classmate"));
            vocabs.add(new Vocab("der Mitschüler", "the classmate"));
            vocabs.add(new Vocab("der, die, das, die", "the"));
            vocabs.add(new Vocab("kommen", "come"));
            vocabs.add(new Vocab("Burg", "castle"));
            vocabs.add(new Vocab("Meer", "sea"));
            vocabs.add(new Vocab("Ist es Dienstag?", "Is it Tuesday?"));
            vocabs.add(new Vocab("Donnerstag", "Thursday"));
            vocabs.add(new Vocab("Samstag", "Saturday"));
            vocabs.add(new Vocab("am Mittwoch", "on Wednesday"));
            vocabs.add(new Vocab("Nein, das ist falsch", "No, that's wrong"));
            vocabs.add(new Vocab("Sieh mal...", "Look"));
            vocabs.add(new Vocab("hier, hierher", "here"));
            vocabs.add(new Vocab("Es sind/es gibt", "There are"));
            vocabs.add(new Vocab("viel.../viele", "many"));
            vocabs.add(new Vocab("Fluss", "river"));
            vocabs.add(new Vocab("Ozean", "ocean"));
        }
        Collections.shuffle(vocabs);
        return vocabs;
    }
}
