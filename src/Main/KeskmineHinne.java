package Main;

/**
 * Created by Siku on 28/1/16.
 * Sportlase esinemist hindab n>2 kohtunikku. Hinnete hulgast eemaldatakse kõige madalam ja
 * kõige kõrgem ning leitakse ülejäänud n-2 hinde aritmeetiline keskmine.
 Kirjutada Java-meetod hinde arvutamiseks.
 Parameetriks olevat massiivi muuta ei tohi.
 */
public class KeskmineHinne {

    public static void main (String[] args) {
        System.out.println (result (new double[]{0., 1., 2., 3., 4.}));

    }

    public static double result (double[] marks) {

        double min, max;

        min=max=marks[0];
        for(int x=0; x<marks.length; x++) {
            if(marks[x]<min) {
                min=marks[x];
            }
            else if(marks[x]>max) {
                max=marks[x];
            }
        }



        double total = 0;
        for (double element : marks) {
            total += element;

        }

        double total2;

        total2 = total - min - max;

        double result;

        result = total2 / marks.length;

        return result;
    }
}
