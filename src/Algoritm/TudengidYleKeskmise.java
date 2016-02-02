import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle keskmise?
 */
public class TudengidYleKeskmise {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleKeskmise(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleKeskmise(int[] ints) {

            int summa = 0;

            for (int hinne : ints) {
                summa += hinne > 60 ? 60 : hinne;
            }

            double keskmine = summa * 1.0 / ints.length;
            int count = 0;

            for (int hinne : ints) {
                if (hinne > keskmine) {
                    count++;
                }

            }
        System.out.println("Niipalju tudengeid sai üles keskmise:");
            return count;
        }

    }
