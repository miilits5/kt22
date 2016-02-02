/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class SikkSakk {
    public static void main(String[] args) {
        int[][] sakk = new int[100][10];
        printSakk(sakk);
    }

    private static void printSakk(int[][] sakk) {
        for (int i = 0; i < sakk.length; i++) {
            for (int j = 0; j < sakk[j].length; j++) {
                if (i < j) System.out.print(" ");
                if (i == j || 10-i == j-8 || i ==j+18 || 20-i == j-16 || i == j+36 || 30-i == j-24 || i == j+54 || 40-i == j-32 || i == j+72|| 50-i == j-40 || i == j+90) System.out.print("x");
                if (j < i) System.out.print(" ");
            }
                System.out.println();
            }
        }
    }