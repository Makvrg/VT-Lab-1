package com.example.laba;

import static java.lang.Math.*;

public class Formula {

    public static double formula1(float x) {
        double numerator = pow(E, x);
        double denominator = log(abs(x)) - 0.25;

        return log(abs(pow(numerator / denominator, 2)));
    }

    public static double formula2(float x) {
        return cos((1.0 / 3.0) / (1 - pow(x, 2 * x)));
    }

    public static double formula3(float x) {
        double innerAtan = atan(1 / pow(E, abs(x)));

        double exponentAtan = atan((x - 3) / 14.0);
        double atanPow = pow((x + 0.5) / 12.0, 2) * (pow(x / 2.0, 2) - 1);

        double divisor = sin(pow(x, x / (1 - x)));

        double exponent = (1.0 / 3.0) + pow(exponentAtan, atanPow) / divisor;

        return pow(pow(innerAtan, exponent), 3);
    }
}
