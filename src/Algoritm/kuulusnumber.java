import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by tarvi.tihhanov on 05/02/2016.
 */
class KuulusNumber {
    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        ArrayList<Integer> tulemus = new ArrayList();
        ArrayList <Integer> moodid = new ArrayList();


        for (int i = 0; i < naide.length; i++) {
            if (naide[i] != 3) {
                tulemus.add(naide[i]);
            }
        }
        System.out.println(tulemus);

        int mood = 0;
        for (int i : tulemus) {

            int sagedus = Collections.frequency(tulemus, i);
            System.out.println(sagedus);


            if (sagedus == mood) {
                moodid.add(i);
            }

            if (sagedus > mood) {
                moodid.clear();
                moodid.add(i);
                mood = sagedus;
            }
        }
        System.out.println(moodid);
    }
}

