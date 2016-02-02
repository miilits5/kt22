import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tarvi.tihhanov on 02/02/2016.
 */
public class Kassa {
    ArrayList<String> korv = new ArrayList<String>();
    private String nimi;
    public Kassa(String kassapidaja) {
        nimi = kassapidaja;
    }

    public void lisaToode(String piim) {
        korv.add(piim);
    }

    public void eemaldaToode(String piim) {
        korv.remove(piim);
    }

    public ArrayList<String> votaTooted() {
        return korv;
    }

    public int votaToodeteArv() {
        return korv.size();
    }

    public String votaKassapidajaNimi() {
        return nimi;
    }

    public void kliendilPoleRaha() {
        System.out.println("Klient avastab, et tal pole raha kaasas ning ta peab korvi tühjaks tõstma");
        korv.clear();
        korv.size();
    }
}
