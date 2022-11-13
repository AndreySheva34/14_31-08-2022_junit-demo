package org.itstep;

public class DeterminationBMI {

    static String bmi(float mass, float growth){
        String classification = "";

        float result = mass/(growth * growth);
        result = (float) Math.ceil(result*10)/10f;

        if (result < 18.5){
            classification = "Недостатня маса";
        } else if (result > 18.5 && result < 24.9) {
            classification = "Норма";
        } else if (result > 25 && result < 29.9) {
            classification = "Передожиріння";
        } else if (result > 30 && result < 34.9) {
            classification = "Ожиріння I ступеня";
        } else if (result > 35 && result < 39.9) {
            classification = "Ожиріння II ступеня";
        } else {
            classification = "Ожиріння III ступеня";
        }

        return classification;
    }
}
