package KutuphaneSistemi;

public class Yonetici extends Kutuphane {
    private String yoneticiName;


    public Yonetici(String kitapAd, String yazar, int adet, String yoneticiName) {
        super(kitapAd, yazar, adet);
        setYoneticiName(yoneticiName);
    }

    public static void kitapEkle(Kutuphane k) {
        setList(k);
    }


    public String getYoneticiName() {
        return yoneticiName;
    }

    public void setYoneticiName(String yoneticiName) {
        this.yoneticiName = yoneticiName;
    }
}
