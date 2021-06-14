public class Nap {
    public String jegy;
    public int haz;

    public Nap(String jegy,int haz) {
        this.jegy=jegy;
        if(haz>0&&haz<=12) {
            this.haz = haz;
        }else System.out.println("Nincs jól megadva a ház");
    }

    public void kiirat(String jegy, int haz){
        System.out.println(jegy);
        System.out.println(haz);
    }

}