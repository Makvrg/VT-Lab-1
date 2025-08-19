package com.example.laba;

public class Lab1 {

    private static final int LENGTH_OF_RANDOM_ARRAY = 18;

    private static final int ROWS_OF_MATRIX = 7;
    private static final int COLUMNS_OF_MATRIX = 18;

    private static final int FROM_RANDOM_INTERVAL = -10;
    private static final int TO_RANDOM_INTERVAL = 4;

    public static void main(String[] args) {
        short[] fixArray = {16, 14, 12, 10, 8, 6, 4};

        float[] randomArray = Calc.generateRandomArray(LENGTH_OF_RANDOM_ARRAY,
                                                       FROM_RANDOM_INTERVAL,
                                                       TO_RANDOM_INTERVAL);

        double[][] matrix = Calc.calculateMatrixByFormulas(fixArray,
                                                           randomArray,
                                                           ROWS_OF_MATRIX,
                                                           COLUMNS_OF_MATRIX);
        Printer.printMatrix(matrix);
    }
}
