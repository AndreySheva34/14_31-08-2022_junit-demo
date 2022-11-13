package org.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsTest {

    @Test
    @DisplayName("check add 2 and 2")
    void add() {
        int expected = 4;
        int actual = Mathematics.add(2,2);
        Assertions.assertEquals(expected, actual, "2 + 2 != 4");
    }

    @Test
    void checkStringsFromStringPoolAreSame() {
        String string = "hello";
        Assertions.assertSame("hello", string);
    }

    @Test
    void checkStringsAreNotSame() {
        String string = new String("hello");
        Assertions.assertNotSame("hello", string);
    }

    @Test
    void checkStringsAreEquals() {
        Assertions.assertEquals("hello", new String("hello"));
        Assertions.assertEquals("hello", new String("hello"));
    }

    @Test
    void add1() {
        int expected = 5;
        int actual = Mathematics.add(3,2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sqrt() {
        double expected = 3.0f;
        double actual = Math.sqrt(9.0);
        Assertions.assertEquals(expected, actual);
    }
}
