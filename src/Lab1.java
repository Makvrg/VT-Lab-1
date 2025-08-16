public class Lab1 {

    public static void main(String[] args) {

        short[] w = {16, 14, 12, 10, 8, 6, 4};

        float[] x = new float[18];
        x = Calc.getX();

        double[][] d = new double[7][18];
        d = Calc.getD(w, x);

        Printer.printMatrix(d);

    }

}
