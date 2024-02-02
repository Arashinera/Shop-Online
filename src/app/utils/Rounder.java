package app.utils;

import java.text.DecimalFormat;

public class Rounder {

    //створення утіліти, яка округлює числа до сотих :
    public static String roundValue(double value) {
        return new DecimalFormat("0.00").format(value);
    }
}
