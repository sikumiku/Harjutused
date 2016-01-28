package Main;

/**
 * Created by Siku on 25/12/15.
 * Koostage Java meetod, mis genereerib parameetrina etteantud n j�rgi niisuguse n korda n t�isarvumaatriksi,
 * mille iga elemendi v��rtuseks on selle elemendi reaindeksi ja veeruindeksi korrutis (indeksid algavad nullist).

 */
public class Korrutustabel {

    public static void main (String[] args) {
        int[][] res = korraTabel(9);
    }

    public static int[][] korraTabel (int n) {
        int[][] result = new int[n][n];

        for (int reanr = 0; reanr < n-1; reanr++) {
            for (int veerunr  = 0; veerunr < n-1; veerunr++) {
                int v22rtus = (veerunr+reanr)*(veerunr+reanr);
                result[veerunr][reanr] = v22rtus;
            }
        }
        return result;
    }

}
