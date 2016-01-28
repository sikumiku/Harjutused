package Main;

import java.util.ArrayList;

/**
 * Created by Siku on 28/1/16.
 * Koostage Java meetod etteantud t‰isarvumaatriksi m veerumiinimumide
 * massiivi leidmiseks (massiivi j-ndaks elemendiks on maatriksi j-nda
 * veeru v‰hima elemendi v‰‰rtus). Arvestage, et m read vıivad olla erineva pikkusega.
 */
public class Veerud {

    public static void main(String[] args) {
        int[] res = veeruMinid(new int[][]{{1, 2, 6}, {4, 5, 3}}); // {1, 2, 3}
        // YOUR TESTS HERE
    }

    public static int[] veeruMinid(int[][] m) {

        int[] min;
        min = m[0];

        int[] veeruMin = new int[n];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i] < min) {
                    min = m[i];
                }
            }

        }
        return veeruMin;
    }
}







        return veeruMin;


        // TODO!!!    YOUR PROGRAM HERE
    }
}
