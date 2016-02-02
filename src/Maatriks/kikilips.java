/**
 * Created by tarvi.tihhanov on 02/02/2016.
 */
public class kikilips {

        public static void main(String[] args) {
            // Lihtsalt abiline meetod, et maatriksit välja printida
            int[][] laud = new int[30][20];
            printMaatriks(laud);
        }

        private static void printMaatriks ( int[][] laud){
            for (int i = -laud.length; i <= laud.length; i++) {
                for (int j = -laud[0].length; j <= laud[0].length; j++) {
                    if (i * i <= j * j) System.out.print(0);
                    else System.out.print(".");
                }
                System.out.println();
            }
        }
    }
