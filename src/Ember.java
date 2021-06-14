import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ember {
    protected String nev;
    protected String hely;
    protected String orszag;
    protected int ev;
    protected int honap;
    protected int nap;
    protected int ora;
    protected int perc;


    public Ember(String nev, String hely) {
        setNev(nev);
        setHely(hely);
    }

    public Ember(String nev, String hely,int ev, int honap, int nap, int ora, int perc) {
        this(nev,hely);
        this.ev=ev;
        this.honap=honap;
        this.nap=nap;
        this.ora=ora;
        this.perc=perc;
    }




    public  void szuletesBeallit(Ember embi) {
        System.out.println(embi);
    }


    public static void adatolvas() {
        System.out.println("Még nincs kész ez a programrész");
    }





    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getHely() {
        return hely;
    }

    public void setHely(String hely) {
        this.hely = hely;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getHonap() {
        return honap;
    }

    public void setHonap(int honap) {
        this.honap = honap;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }

}

