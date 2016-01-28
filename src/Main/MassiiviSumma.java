package Main;

/**
 * Created by Siku on 25/12/15.
 */
public class MassiiviSumma implements Comparable {

    public static void main (String[] args) {
        System.out.println (absvSumma (new int[]{0}));
        // YOUR TESTS HERE
    }

    public static int absvSumma (int[] m) {
        int totalSum = 0;
        for (int element : m) {
            totalSum += absol(element);
        }
        return totalSum;
    }

    public static int absol (int n) {
        if (n < 0) {
            n = n * (-1);
        }
        return n;
    }

    public void doNothing() {
        if(true){
            int e = 0;
        } else {
            return;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}



