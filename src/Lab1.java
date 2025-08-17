public class Lab1 {

    private static final int LENGTH_OF_ARRAY_X = 18;
    private static final int ROWS_OF_ARRAY_D = 7;
    private static final int COLUMNS_OF_ARRAY_D = 18;

    public static void main(String[] args) {
        short[] w = {16, 14, 12, 10, 8, 6, 4};

        float[] x = Calc.calculateRandomArrayX(LENGTH_OF_ARRAY_X);

        double[][] d = Calc.calculateArrayD(w, x, ROWS_OF_ARRAY_D, COLUMNS_OF_ARRAY_D);

        Printer.printMatrix(d);
    }
}
