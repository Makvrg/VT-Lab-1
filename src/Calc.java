import static java.lang.Math.*;

public class Calc {

    public static float[] generateRandomArray(int length,
                                              int from,
                                              int to) {
        float[] array = new float[length];

        for (int i = 0; i < length; i++) {
            array[i] = (float) (random() * (to - from) + from);
        }
        return array;
    }

    public static double[][] calculateMatrixByFormulas(short[] fixArray,
                                                       float[] randomArray,
                                                       int rows,
                                                       int columns) {
        double[][] array = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (fixArray[i] == 12)
                        ? Formula.formula1(randomArray[j])
                        : (fixArray[i] == 4 || fixArray[i] == 8 || fixArray[i] == 16)
                                ? Formula.formula2(randomArray[j])
                                : Formula.formula3(randomArray[j]);
            }
        }
        return array;
    }
}
