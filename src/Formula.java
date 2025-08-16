import static java.lang.Math.*;

public class Formula {

    public static double F1(float x) {

        return log( abs( pow( ( pow(E, x) / ( log(abs(x)) - 0.25 ) ), 2 ) ) );

    }


    public static double F2(float x) {

        return cos( (1.0/3.0) / (1 - pow(x, 2*x)) );

    }


    public static double F3(float x) {

        return pow( pow( atan( 1 / pow(E, abs(x)) ), ( (1.0/3.0) + pow( atan( (x-3) / 14 ), pow(((x+0.5)/3/4), 2) * (pow(x/2, 2) - 1) ) ) / sin( pow(x, x/(1-x)) ) ), 3 );

    }

}
