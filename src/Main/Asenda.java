package Main;

/**
 * Created by Siku on 25/12/15.
 */

public class Asenda {

    public static void main (String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda (s); // "Tere**TUDENG*******"
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {
        for (int i = 0; i < s.length(); i++) {
            char t2ht = s.charAt(i);
            if (Character.isAlphabetic(t2ht)) {
            }else {
                    s = s.replace(t2ht, '*');
                }
            }
        return s; // TODO!!! Your code here
    }

}
