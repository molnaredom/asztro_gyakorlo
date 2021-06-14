
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class Beolvasas {


    public static void emberAdatBeolv() {
        Scanner sc = new Scanner(System.in);
        boolean joe = true;
        while (joe) {
            try {
                System.out.println("""
                        Írd be az adataid az alábbi formában:
                        [Vnév] [Knév] [Esetleges második név] (újsor/enter)
                        [Születési város] [év] [hónap] [nap] [óra] [perc]""");



                Ember embi =new Ember(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

                FileWriter fileWriter = new FileWriter("adatok.txt",true);
                PrintWriter printWriter = new PrintWriter(fileWriter);

                printWriter.printf("%s\n%s\n%d/%d/%d  %d:%d\n\n\n",embi.nev,embi.hely,embi.ev,embi.honap,embi.nap, embi.ora, embi.perc);
                printWriter.close();
                joe = false;


            } catch (Exception ignored) {
                System.out.println("Valószínűleg helytelen formában adtad meg az adataid próbáld újra:");
            }
        }
    }

        public static List<List<String>> beolvas () {


            List<List<String>> jegyek2D = new ArrayList<List<String>>();
            for (int i = 0; i < 12; i++) {
                try {
                    File myObj = new File((i + 1) + ".txt");
                    Scanner myReader = new Scanner(myObj);

                    String data = myReader.nextLine(); //beolvas egy sor stringet ez egy 100 szavas str
                    String[] arrOfStr = data.split(","); //elszeparalja commankent ,lesz 100 db str
                    List<String> row = new ArrayList<>(); //letrehoz aegy tombot amiben a szavak elsznek tarolva
                    for (String szavak : arrOfStr) { //az ujonnan elszeparalt szvaokon egyeseval vegigmegy

                        //Scanner s =new Scanner(szavak); //az adott szot kiolvassa
                        if (szavak.charAt(0) == ' ') {
                            szavak = szavak.substring(1);
                        }

                        row.add(szavak); //es beleteszi a tombbe

                    }
                    jegyek2D.add(row);


                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("nincs ilyen file tes");
                }



            }


            return jegyek2D;


        }

    }
