package RandevuSistemi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Danisman {

    static Map<Enum,List> randevular = new HashMap<>();

    private int randevuID;
    private String musteriAd;
    private String tarih;
    private String saat;
    private Enum danismanAdi;

    private static int sayac=1;

    public Danisman() {

    }

    public Danisman(String musteriAd, String tarih, String saat, Enum danismanAdi) {
        setRandevuID(sayac);
        setMusteriAd(musteriAd);
        setTarih(tarih);
        setSaat(saat);
        setDanismanAdi(danismanAdi);
        sayac++;
    }

    public int getRandevuID() {
        return randevuID;
    }

    public void setRandevuID(int randevuID) {
        this.randevuID = randevuID;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public Enum getDanismanAdi() {
        return danismanAdi;
    }

    public void setDanismanAdi(Enum danismanAdi) {
        this.danismanAdi = danismanAdi;
    }
}
