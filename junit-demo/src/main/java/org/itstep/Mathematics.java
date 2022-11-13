package org.itstep;

public class Mathematics {

    static int add(int a, int b) {
        System.out.println("Invoke method add with two INTEGER parameters");
        if (a == b) {
            return a + b;
        } else {
            return a;
        }
    }

    static int add(int a, int b, int c) {
        System.out.println("Invoke method add with three INTEGER parameters");
        return a + b + c;
    }

    static float add(float a, float b) {
        System.out.println("Invoke method add with FLOAT parameters");
        return a + b;
    }

    static int add(float a, int b) {
        System.out.println("Invoke method add with FLOAT and INTEGER parameters");
        return (int) a + b;
    }

    static int div(int a, int b) {
        return a / b;
    }

}
