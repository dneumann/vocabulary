package dn.vocabulary;

import org.junit.Test;

import java.util.List;

public class ExamGeneratorTest {

    @Test
    public void test() {
        ExamGenerator gen = new ExamGenerator();

        List<Vocab> results = gen.getExam();

        String out = "";
        for (Vocab res : results) {
            out += res.shown + ": " + res.unknown + "\n";
        }

        throw new RuntimeException(out);
    }
}