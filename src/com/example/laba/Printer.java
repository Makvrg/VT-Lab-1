package com.example.laba;

public class Printer {

    public static void printMatrix(double[][] d) {
        for (double[] row : d) {
            for (double v : row) {
                System.out.printf("%-11.3f", v);
            }
            System.out.println();
        }
    }
}
