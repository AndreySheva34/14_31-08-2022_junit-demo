package org.itstep;


public class App {
    public static void main(String[] args) {
        //Mathematics m = new Mathematics();

        // overload
        // сигнатура методу - ім'я методу + параметри
        int resulti = Mathematics.add(1, 2);
        System.out.println("resulti = " + resulti);
        float resultf = Mathematics.add(1.9f, 2);
        System.out.println("resultf = " + resultf);

        System.out.println( DeterminationBMI.bmi(65f,1.75f) );
    }
}
