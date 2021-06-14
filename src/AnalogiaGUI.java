import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;


public class AnalogiaGUI extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, button;
    JLabel label2, label3, pontkiir;
    //JCheckBox dollarSign, commaSeparator;
    String tipp = "-";
    String valasz = "-";
    int pontszam=0;double osszpont=0;
    JPanel thePanel = new JPanel(); // ebbe lesz minden beleteve
    ArrayList<String> valaszkerdes = null;


    public AnalogiaGUI() {

        this.setSize(800, 800);
        this.setLocationRelativeTo(null);//roviditett forma h a kepernyo kozepen jelenjen meg a progi
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Aszrtológiagyakorló");// az mga a boxra vonatkozik

        thePanel.setBackground(Color.black);
        ListenforButton lforButton = new ListenforButton();


        ImageIcon img1 = new ImageIcon("kos.png");
        ImageIcon img2 = new ImageIcon("bika.png");
        ImageIcon img3 = new ImageIcon("ikrek.png");
        ImageIcon img4 = new ImageIcon("rák.png");
        ImageIcon img5 = new ImageIcon("oroszlán.png");
        ImageIcon img6 = new ImageIcon("szűz.png");
        ImageIcon img7 = new ImageIcon("mérleg.png");
        ImageIcon img8 = new ImageIcon("skorpió.png");
        ImageIcon img9 = new ImageIcon("nyilas.png");
        ImageIcon img10 = new ImageIcon("bak.png");
        ImageIcon img11 = new ImageIcon("vízöntő.png");
        ImageIcon img12 = new ImageIcon("halak.png");


        button = new JButton();
        button.setIcon(new ImageIcon("kezdogomb.png"));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.addActionListener(lforButton);
        button.setBackground(Color.black);
        thePanel.add(button);




        b1 = new JButton(); b1.setBackground(Color.black);
        b1.setIcon(img1);
        b1.addActionListener(lforButton);
        thePanel.add(b1);
        b2 = new JButton();b2.setBackground(Color.black);
        b2.setIcon(img2);
        b2.addActionListener(lforButton);
        thePanel.add(b2);
        b3 = new JButton();b3.setBackground(Color.black);
        b3.setIcon(img3);
        b3.addActionListener(lforButton);
        thePanel.add(b3);
        b4 = new JButton();b4.setBackground(Color.black);
        b4.setIcon(img4);
        b4.addActionListener(lforButton);
        thePanel.add(b4);
        b5 = new JButton();b5.setBackground(Color.black);
        b5.setIcon(img5);
        b5.addActionListener(lforButton);
        thePanel.add(b5);
        b6 = new JButton();b6.setBackground(Color.black);
        b6.setIcon(img6);
        b6.addActionListener(lforButton);
        thePanel.add(b6);
        b7 = new JButton();b7.setBackground(Color.black);
        b7.setIcon(img7);
        b7.addActionListener(lforButton);
        thePanel.add(b7);
        b8 = new JButton();b8.setBackground(Color.black);
        b8.setIcon(img8);
        b8.addActionListener(lforButton);
        thePanel.add(b8);
        b9 = new JButton();b9.setBackground(Color.black);
        b9.setIcon(img9);
        b9.addActionListener(lforButton);
        thePanel.add(b9);
        b10 = new JButton();b10.setBackground(Color.black);
        b10.setIcon(img10);
        b10.addActionListener(lforButton);
        thePanel.add(b10);
        b11 = new JButton();b11.setBackground(Color.black);
        b11.setIcon(img11);
        b11.addActionListener(lforButton);
        thePanel.add(b11);
        b12 = new JButton();b12.setBackground(Color.black);
        b12.setIcon(img12);
        b12.addActionListener(lforButton);
        thePanel.add(b12);

        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        b9.setVisible(false);
        b10.setVisible(false);
        b11.setVisible(false);
        b12.setVisible(false);

/*
        //ezek fogjak eldonteni hegy melyen formaban jelenjen meg az eredmeny
        dollarSign = new JCheckBox("Forint");
        commaSeparator = new JCheckBox("Commas");

        thePanel.add(dollarSign);
        thePanel.add(commaSeparator, true);
        // ahol true van az lesz a default érték(választani lehet a 2 kozott)
*/


/*
        label1 = new JLabel("Jelenleg ez van kivalaszva\n");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Georgia",Font.CENTER_BASELINE,40));
        thePanel.add(label1); label1.setVisible(false);
*/

        label2 = new JLabel("");
        label2.setSize(50, 50);
        label2.setFont(new Font("Consolas",Font.PLAIN,40));
        label2.setForeground(Color.lightGray); label2.setVisible(false);

        //label2.setVerticalTextPosition(JLabel.SOUTH_EAST);
        thePanel.add(label2);

        label3 = new JLabel("Feladat kérése");
        label3.setSize(20, 20);label3.setVisible(false);
        label3.setFont(new Font("Consolas",Font.PLAIN,40));
        //label3.setVerticalTextPosition(JLabel.SOUTH_WEST);
        label3.setForeground(Color.pink);
        thePanel.add(label3);

        pontkiir = new JLabel("Pontszám");
        pontkiir.setSize(20, 20);pontkiir.setVisible(false);
        pontkiir.setFont(new Font("Consolas",Font.PLAIN,40));
        pontkiir.setForeground(Color.green);
        thePanel.add(pontkiir);

        this.add(thePanel);
        setVisible(true);


    }

    public class ListenforButton implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                 label2.setVisible(true); label3.setVisible(true);//label1.setVisible(true);
                button.setVisible(false);pontkiir.setVisible(true);
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(true);
                b6.setVisible(true);
                b7.setVisible(true);
                b8.setVisible(true);
                b9.setVisible(true);
                b10.setVisible(true);
                b11.setVisible(true);
                b12.setVisible(true);
            }

            //0.nincs analogia,nincs kerdes,nincs eredmeny
            // 1. kér egy kérdést -- nincs ana, van kerdes, nincs eredmeny
            // 2. tippel analogiat-- van ana,van kerdes,nincs eredmény
            // 3. ellenorzi az 1. 2. azonosságát-- van ana, van kerd, van eredm


            if (e.getSource() == b1) {
                tipp = "kos";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b2) {
                tipp = "bika";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b3) {
                tipp = "ikrek";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b4) {
                tipp = "rák";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b5) {
                tipp = "oroszán";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b6) {
                tipp = "szűz";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b7) {
                tipp = "mérleg";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b8) {
                tipp = "skorpió";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b9) {
                tipp = "nyilas";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b10) {
                tipp = "bak";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b11) {
                tipp = "vízöntő";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);
            } else if (e.getSource() == b12) {
                tipp = "halak";
                pontszam+=eredmenyhirdet(valasz, tipp, label2);


            }

            // valaszkerdes = 2 elemu str az 1.eleme a valsz,  2. eleme a kerdes

            pontkiir.setText(pontszam+"pont "+Math.round((pontszam/osszpont)*100)+"%");
            osszpont++;
            valaszkerdes = AnalogiaGyakorlo.kerdes();
            label3.setText(valaszkerdes.get(1));//kiirja a kerdest
            valasz = valaszkerdes.get(0);//a kovetkezo kerdesre csak akkor jon uj valasz ha a kiertekeles lefutott


        }
    }


    public static int eredmenyhirdet(String valasz, String tipp, JLabel label2) {

        if (valasz.equals(tipp)) {
            label2.setForeground(Color.green);
            label2.setText(">>>HELYES VÁLASZ<<<   ");
            return 1;
        } else {
            //label2.setFont("");
            label2.setForeground(Color.red);
            label2.setText("<<<ROSSZ VÁLASZ>>>" +
                    "A helyes: " + valasz+"    ");
            return 0;
        }

    }

    public class Gomb extends JButton {
        boolean lathatosag = false;
        Color szin = Color.black;
        ImageIcon kep;
        /*
        b1 = new JButton(); b1.setBackground(Color.black);
        b1.setIcon(img1);
        b1.addActionListener(lforButton);
        */

        public Gomb(boolean lathatosag, Color szin, ImageIcon kep) {
            this.lathatosag = lathatosag;
            this.szin = szin;
            this.kep = kep;
        }


    }

    }


