import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static String udvozletkiiras() {
        return "Üdvözöllek ebben a kis asztrológia programban!";
    }

    public static boolean kilepes() {
        while (true) {
            System.out.println("Szeretnél-e  kilépni a programból? (Igen vagy nem?)");
            Scanner sc = new Scanner(System.in);
            String kilepe_str = sc.next().toLowerCase(Locale.ROOT);
            if (kilepe_str.equals("igen")) {
                return true;
            } else if (kilepe_str.equals("nem")) {
                return false;
            } else {
                System.out.println("Valamit rosszul írtál");
            }
        }
    }

    public static int menuvalaszto() {
        Scanner sc = new Scanner(System.in);
        int menupontok_db = 5;//todo kezzel kell frissiteni
        System.out.println("Válassz az alábbi menüpontok közül és válassz számot:");
        System.out.println("(1)Összes analógia kiírása");
        System.out.println("(2)Adott jegy analógiáinak kiírása");
        System.out.println("(3)Születési adatok megadása");
        System.out.println("(4)Születési adatok olvasása");
        System.out.println("(5)Asztro gyakorló játék");
        while (true) {
            int szam = sc.nextInt();
            try {
                if (szam > 0&& szam<=menupontok_db) {
                    return szam;
                }
            } catch (Exception e) {
                System.out.println("Valamit rosszul irtal,számmal próbálozz a lehetóségek közül");
            }

        }

    }


    public static void fomenu(){
        Scanner sc = new Scanner(System.in);
        udvozletkiiras();
        while (true) {


            switch (menuvalaszto()) {
                case 1:
                    System.out.println(AnalogiaGyakorlo.adatotkiir());
                case 2: {
                    System.out.println("Addja meg hanyadik jegy érdekelné(1-12): ");
                    AnalogiaGyakorlo.jegykiir(sc.nextInt()-1);
                }
                case 3:Beolvasas.emberAdatBeolv();
                case 4: Ember.adatolvas();
                case 5: {
                    int szamlalo =0;

                    System.out.println("Addja meg hány kérdést szeretne kapni: ");


                }
            }


            if (kilepes()) {
                break;
            }
        }
    }

}

