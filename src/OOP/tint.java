/**
 * Created by tarvi.tihhanov on 05/02/2016.

public class tint {
}

 int tint;
 int kulutatudTint;
 int tintiAlles;
 public Pastakas(int tindiKogus) {
 tint = tindiKogus;
 System.out.println(tint);
 }
 public void kirjuta(String s) {
 int count = 0;
 for (int i = 0; i < s.length(); i++) {
 char c = s.charAt(i);
 if (!Character.isSpaceChar(c)) {
 count++;
 }
 }
 kulutatudTint = count;
 System.out.println(kulutatudTint);
 }

 public void prindiPaljuTintiAlles() {
 tintiAlles = tint - kulutatudTint;
 System.out.println(tintiAlles);
 }
 }

 public static void main(String[] args) {

 int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
 ArrayList <Integer> tulemus = new ArrayList();
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

 EvelinJ Feb 04 21:49
 selle moodi leidmise osa leidsin googeldades, ise ma ei oleks seda vist välja mõelnud

 KerstiM Feb 04 22:04
 Kas keegi oskab Kirjaniku OOPiga aidata. Eksamil tegin sama ülesannet ja tuli välja. Nüüd enam ei tule:( Oskab keegi öelda mis viga on? Esiteks on indeks outofbounds ja teiseks ta ketrab kaks ringi. Ma ütlen, on väga väga paha, et me oma eksamikoodi ei näe! Ma ei jõudnud selle peale mõeldagi, et seda kuhugi kopida eksami ajal...package OOP;
 public class Pastakas {
 String EsimeneTekst = "Elu oleks palju lihtsam, kui meil oleks selle lahtekood.";
 String TeineTekst = "Oiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!";
 int kasTintiOn;

 public Pastakas(int tindiKogus) {
 kasTintiOn = tindiKogus;
 }

 public void kirjuta(String s) {
 int essatekst=0;
 for (int i = 0; i < EsimeneTekst.length(); i++) {
 if (Character.isLetter(EsimeneTekst.charAt(i))) {
 essatekst ++;
 }
 }

 if (essatekst <= kasTintiOn) {
 System.out.println(EsimeneTekst);
 }else{
 //System.out.println(EsimeneTekst.substring(0, kasTintiOn));
 }

 int tessatekst = 0;
 for (int i = 0; i < TeineTekst.length(); i++) {
 if (Character.isLetter(TeineTekst.charAt(i))) {
 tessatekst ++;
 }
 }
 System.out.println(tessatekst);
 kasTintiOn = kasTintiOn - essatekst;
 System.out.println(kasTintiOn);

 if (tessatekst < kasTintiOn) {
 System.out.println(TeineTekst);
 } else {

 System.out.println(TeineTekst.substring(0, kasTintiOn));
 }
 }

 public void prindiPaljuTintiAlles() {
 System.out.println(kasTintiOn);
 }
 }




 public String []otsiEsimeseTaheJargi(String t2ht){

 char esimeneT2ht = t2ht.charAt(0);

 int count = 0;

 ArrayList<String> koopia = new ArrayList<>();

 for (int i = 0; i < sonad.size(); i++) {
 if (sonad.get(i).charAt(0) == esimeneT2ht) {
 koopia.add(sonad.get(i));
 count++;
 }
 }

 String[]tulemus = new String[count];
 for (int i = 0; i < koopia.size() ; i++) {
 tulemus[i] = koopia.get(i);
 }
 return tulemus;
 }
*/