package BankaHesapSistemi;

public class Hesap {
    private Musteri musteri = new Musteri();
    private final int hesapNo;
    private double bakiye;

    private static int sayac=1000;

    public Hesap(double bakiye) {
        this.hesapNo = sayac++;
        setBakiye(bakiye);
    }

    public void paraYatir(double miktar){
        setBakiye(getBakiye()+miktar);
        System.out.println("Para Hesabınıza Yatırıldı.");
        System.out.println("Bakiyeniz : " + getBakiye());
    }

    public void paraCek(double miktar) {
        if (miktar > getBakiye()) {
            setBakiye(getBakiye() - miktar);
            System.out.println("Hesabınızdan " + miktar + " TL Para Çekildi.");
            System.out.println("Bakiyeniz : " + getBakiye());
        }else
            System.out.println("Bakiyeniz Yetersiz.");
    }

    public void bakiyeGoster(){
        System.out.println("Bakiyeniz : " + getBakiye());
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "hesapNo =" + hesapNo +
                ", bakiye =" + bakiye +" ,"
                ;
    }
}
