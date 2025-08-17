import static java.lang.Math.*;

public class Calc {

    public static float[] calculateRandomArrayX(int length) {
        float[] newX = new float[length];

        for (int i = 0; i < length; i++) {
            newX[i] = (float) (random() * 14 - 10);
        }
        return newX;
    }

    public static double[][] calculateArrayD(short[] w,
                                             float[] x,
                                             int rows,
                                             int columns) {
        double[][] newD = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newD[i][j] = (w[i] == 12)
                        ? Formula.formula1(x[j])
                        : (w[i] == 4 || w[i] == 8 || w[i] == 16)
                                ? Formula.formula2(x[j])
                                : Formula.formula3(x[j]);
            }
        }
        return newD;
    }
}
