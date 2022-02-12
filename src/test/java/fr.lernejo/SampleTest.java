package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {
    private final Sample sample = new Sample();

    @Test
    public void testOPADD1() {
        System.out.println("testOPADD1");
        int result = sample.op(Sample.Operation.ADD, 3,7);
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void testOPMULT1() {
        System.out.println("testOPMULT1");
        int result = sample.op(Sample.Operation.MULT, 3,7);
        Assertions.assertThat(result).isEqualTo(21);
    }

    @Test
    public void testFact1() {
        System.out.println("testFact1");
        Assertions.assertThat(sample.fact(1)).isEqualTo(1);
        Assertions.assertThat(sample.fact(2)).isEqualTo(2);
        Assertions.assertThat(sample.fact(3)).isEqualTo(6);
        Assertions.assertThat(sample.fact(4)).isEqualTo(24);
    }
}
