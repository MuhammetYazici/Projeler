package BankaHesapSistemi;

import java.util.ArrayList;

public class Musteri {
    private final int id;
    private String ad;
    private String soyad;
    ArrayList<Musteri> musteriListesi = new ArrayList<>();

    private static int sayac = 1;

    public Musteri() {
        this.id =getId();
    }

    public Musteri(int id, String ad, String soyad) {
        this.id = sayac++;
        setAd(ad);
        setSoyad(soyad);
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

    

}
