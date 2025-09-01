package UrunStokTakipSistemi;

import java.util.*;

public class UrunData {
    private  int id;
    private String ad;
    private int stok;
    private int fiyat;
    private kategoriler tur;
    Set<UrunData> urunBilgileri = new HashSet<>();


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

    public void setId(int id) {
        if (sayac>id){
            this.id=sayac--;
        } else if (sayac<=id) {
            System.out.println("HATALI");
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
                "* id=" + id +
                ", ad='" + ad + '\'' +
                ", stok=" + stok +
                ", fiyat=" + fiyat +
                ", tur='" + tur + '\'' +' '+
                '*';
    }
}
