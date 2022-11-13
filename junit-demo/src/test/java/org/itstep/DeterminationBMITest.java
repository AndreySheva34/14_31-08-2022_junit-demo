package org.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeterminationBMITest {

    @Test
    void bmi1() {
        String expected = "Недостатня маса";
        String actual = DeterminationBMI.bmi(50f,1.75f);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void bmi2() {
        String expected = "Норма";
        String actual = DeterminationBMI.bmi(60f,1.75f);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void bmi3() {
        String expected = "Передожиріння";
        String actual = DeterminationBMI.bmi(77f,1.75f);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void bmi4() {
        String expected = "Ожиріння I ступеня";
        String actual = DeterminationBMI.bmi(93f,1.75f);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void bmi5() {
        String expected = "Ожиріння II ступеня";
        String actual = DeterminationBMI.bmi(110f,1.75f);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void bmi6() {
        String expected = "Ожиріння III ступеня";
        String actual = DeterminationBMI.bmi(130f,1.75f);
        Assertions.assertEquals(expected,actual);
    }
}