package Main;

/**
 * Created by Siku on 25/12/15.
 */
public class KontrolliArvu {

    public static void main (String[] args) {
        System.out.println (pos2k (0));
        // YOUR TESTS HERE
    }

    public static boolean pos2k (int n) {
        return n>=10 && n<=99;
    }
}
