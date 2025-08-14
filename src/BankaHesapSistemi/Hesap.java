package BankaHesapSistemi;

public class Hesap {
    private Musteri musteri = new Musteri();
    private final int hesapNo;
    private double bakiye;

    private static int sayac=1000;

    public Hesap(int hesapNo) {
        this.hesapNo=getHesapNo();
    }

    public Hesap(int hesapNo, double bakiye) {
        this.hesapNo = sayac++;
        setBakiye(bakiye);
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
}
