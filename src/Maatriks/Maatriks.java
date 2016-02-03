import java.util.ArrayList;

/**
 * Prindi konsooli 9x9 maatriks sudoku numbritega.
 */
public class Maatriks {
    public static void main(String[] args) {
        int[][] numbrid = new int[9][9];
        int[][] numbridVeerus = new int[9][9];
        ArrayList numbridReas = new ArrayList();
        for (int i = 0; i < 9; i++) {
            System.out.println("");
            for (int j = 0; j < 9; j++) {
                while (numbridReas.contains(numbrid[i][j]) || numbrid[i][j] == 0 || getVeerg(numbridVeerus, j).contains(numbrid[i][j])) {
                    numbrid[i][j] = ((int) (1 + (Math.random() * 9)));
                }
                numbridReas.add(numbrid[i][j]);
                numbridVeerus[j][i] = (numbrid[i][j]);
                System.out.print(numbrid[i][j]);
            }
            numbridReas.clear();
        }

        System.out.println("");

      /*  for (int i = 0; i <numbridVeerus.length; i++) {
            System.out.println("");
            for (int j = 0; j <numbridVeerus.length ; j++) {
                System.out.print(numbridVeerus[i][j]);
            }
        }
        */
    }

    public static ArrayList getVeerg(int[][] numbridVeerus, int row) {
        //tahtsin teha vastupidise array ja pärida selle rida, mis on numbrite array veeruks, aga nii ikka ei saa,
        //sudoku peab olema juba enne valmis mõeldud, mitte juhusulikult nr genereeritud :(
        ArrayList numbridVeerus2 = new ArrayList();
        for (int i = 0; i < numbridVeerus.length; i++) {
            if (i == row) {
                for (int j = 0; j < 9; j++) {
                    numbridVeerus2.add(numbridVeerus[i][j]);
                }
            }
        } return numbridVeerus2;
    }
}