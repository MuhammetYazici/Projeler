package UrunStokTakipSistemi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UrunData {
    private  int id;
    private String ad;
    private int stok;
    private int fiyat;
    private kategoriler tur;
    private List<UrunData> urunBilgileri = new ArrayList<>();
    private Map<kategoriler,UrunData> kategoriListesi = new HashMap<>();

    private static int sayac=1;

    public UrunData() {
    }

    public UrunData(String ad, int stok, int fiyat, kategoriler tur) {
        this.id = sayac++;
        setAd(ad);
        setStok(stok);
        setFiyat(fiyat);
        setTur(tur);
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

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public kategoriler getTur() {
        return tur;
    }

    public void setTur(kategoriler tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "UrunData{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", stok=" + stok +
                ", fiyat=" + fiyat +
                ", tur='" + tur + '\'' +
                ", urunBilgileri=" + urunBilgileri +
                ", kategoriListesi=" + kategoriListesi +
                '}';
    }
}
