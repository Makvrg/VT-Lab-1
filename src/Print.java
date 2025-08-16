public class Print {

    public static void print_matrix(double[][] d) {

        for (byte i = 0; i < 7; i++) {
            for (byte j = 0; j < 18; j++) {
                System.out.printf("%-11.3f", d[i][j]);
            }
            System.out.println();
        }

    }

}
