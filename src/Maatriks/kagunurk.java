import java.util.Arrays;

/**
 * Created by tarvi.tihhanov on 02/02/2016.
 */
public class kagunurk {

        public static void main(String[] args) {
            int[][] kaguNurk = new int[9][9];
            for (int i = 0; i < kaguNurk.length; i++) {
                for (int j = 0; j < kaguNurk.length; j++) {
                    if ( i>j ){
                        kaguNurk[i][j]= kaguNurk.length-i;
                    } else {
                        kaguNurk[i][j]= kaguNurk.length-j;
                    }
                }
            }
            printMaatriks(kaguNurk);
        }

        // Lihtsalt abiline meetod, et maatriksit välja printida
        private static void printMaatriks(int[][] laud) {
            for (int i = 0; i < laud.length; i++) {
                System.out.println(Arrays.toString(laud[i]));
            }
            System.out.println("");
        }
    }

