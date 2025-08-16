import static java.lang.Math.*;

public class Calc {

    public static float[] getX() {

        float[] newX = new float[18];

        for (byte i = 0; i < 18; i++) {
            newX[i] = (float) (random() * 14 - 10);
        }
        return newX;
    }


    public static double[][] getD(short[] w, float[] x) {

        double[][] newD = new double[7][18];

        for (byte i = 0; i < 7; i++) {
            for (byte j = 0; j < 18; j++) {
                newD[i][j] = (w[i] == 12) ? Formula.F1(x[j])
                                : (w[i] == 4 || w[i] == 8 || w[i] == 16) ? Formula.F2(x[j])
                                    : Formula.F3(x[j]);
            }
        }
        return newD;
    }

}
