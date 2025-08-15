package BankaHesapSistemi;

import java.util.ArrayList;

public class Musteri {
    private final int id;
    private String ad;
    private String soyad;
    private ArrayList<Hesap> hesapListesi = new ArrayList<>();

    private static int sayac = 1;

    public Musteri() {
        this.id =getId();
    }

    public Musteri(int id, String ad, String soyad) {
        this.id = sayac++;
        setAd(ad);
        setSoyad(soyad);
    }

    public void hesapAc(double bakiye){
        Hesap hesap = new Hesap(bakiye);
        hesapListesi.add(hesap);
        System.out.println("Hesabınız Açıldı.");
        System.out.println("Bakiyeniz : "+ bakiye);
    }

    public void hesaplariGoster(){
        System.out.println("****** Hesaplarınız ******");
        for (int i = 0; i < hesapListesi.size(); i++) {
            System.out.println(hesapListesi.get(i));
        }
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", hesapListesi=" + hesapListesi +
                '}';
    }

}
