package Main;

/**
 * Created by Siku on 25/12/15.
 */
public class RuutudeSumma {

    public static void main (String[] args) {
        System.out.println (ruutudeSumma (5., -5.));
        // YOUR TESTS HERE
    }

    public static double ruutudeSumma (double a, double b) {
        double summa;
        summa = a*a + b*b;
        return summa;
    }

}