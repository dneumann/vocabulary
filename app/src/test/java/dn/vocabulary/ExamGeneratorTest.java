package dn.vocabulary;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ExamGeneratorTest {

    @Test
    public void test() {
        ExamGenerator gen = new ExamGenerator();

        List<V> results = gen.getExam();

        String out = "";
        for (V res : results) {
            out += res.shown + ": " + res.unknown + "\n";
        }

        throw new RuntimeException(out);
    }
}