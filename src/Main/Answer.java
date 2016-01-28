package Main;

/**
 * Created by Siku on 24/12/15.
 */
public class Answer {

    public static void main(String[] args) {
        System.out.println(keskmisestParemaid(new double[]{0.}));
        // YOUR TESTS HERE
    }

    public static int keskmisestParemaid(double[] d) {
        double total = 0;
        for (double element : d) {
            total += element;

        }
        double average = total / d.length;
        int counter = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] > average) {
                counter++;
            }
        }
        return counter;
    }
}
