import static java.lang.Math.*;

public class Calc {

    public static float[] generateRandomArray(int length,
                                              int from,
                                              int to) {
        float[] newX = new float[length];

        for (int i = 0; i < length; i++) {
            newX[i] = (float) (random() * (to - from) + from);
        }
        return newX;
    }

    public static double[][] calculateArrayByFormulas(short[] w,
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
