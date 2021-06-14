
import java.util.*;
import java.util.List;

public class AnalogiaGyakorlo {


    public static String adatotkiir() {

        List<List<String>> adatok = Beolvasas.beolvas();

        String szoveg = null;

        for (List<String> strings : adatok) {
            for (String string : strings) {
               szoveg+=string+"\n";
            }
        }

        return szoveg;
    }

    public static void jegykiir(int jegy){
        List<List<String>> adatok = Beolvasas.beolvas();


        for (int i = 0; i < adatok.get(jegy).size(); i++) {
            System.out.println(i + " - " + adatok.get(jegy).get(i));
        }
    }



    public static ArrayList<String> kerdes(){
        List<List<String>> adatok = Beolvasas.beolvas();
        ArrayList<String> visszater = new ArrayList<>(2);
        HashMap<Integer, String> jegynev = new HashMap<>();

        jegynev.put(1, "kos");jegynev.put(2, "bika");
        jegynev.put(3, "ikrek");jegynev.put(4, "rák");jegynev.put(5, "oroszlán");jegynev.put(6, "szűz");jegynev.put(7, "mérleg");
        jegynev.put(8, "skorpió");jegynev.put(9, "nyilas");jegynev.put(10, "bak");jegynev.put(11, "vízöntő");jegynev.put(12, "halak");

        Random rand = new Random();
        int rand_jegy = rand.nextInt(12);   //random jegy
        int rand_analogia = rand.nextInt(adatok.get(rand_jegy).size());//random jegyhez random analogia

        System.out.println(rand_jegy);

        visszater.add(jegynev.get(rand_jegy+1));//jegynev-1-valasz
        visszater.add(("Kérdés: "+ adatok.get(rand_jegy).get(rand_analogia)));//analogia-2-kerdes

        return visszater;//kiirja a kitalalando analogiat

    }


}

