package UrunStokTakipSistemi;

import java.util.*;

public class UrunData {
    private int id;
    private String ad;
    private int stok;
    private double fiyat;
    private kategorilerEnum tur;
    static Set<UrunData> urunBilgileri = new HashSet<>();
    static Map<kategorilerEnum, List<UrunData>> kategoriler = new HashMap<>();


    private static int sayac = 1;

    public UrunData() {
    }

    public UrunData(String ad, int stok, double fiyat, kategorilerEnum tur) {
        setId();
        setAd(ad);
        setStok(stok);
        setFiyat(fiyat);
        setTur(tur);
    }

    private void setId() {
        this.id=sayac++;
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

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public kategorilerEnum getTur() {
        return tur;
    }

    public void setTur(kategorilerEnum tur) {
        this.tur = tur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UrunData)) return false;
        UrunData urun = (UrunData) o;
        return id == urun.id && ad.equalsIgnoreCase(urun.ad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ad.toLowerCase());
    }


    @Override
    public String toString() {
        return
                "[ id=" + id +
                        ", ad='" + ad + '\'' +
                        ", stok=" + stok +
                        ", fiyat=" + fiyat +
                        ", tur='" + tur + "' ]";
    }
}
