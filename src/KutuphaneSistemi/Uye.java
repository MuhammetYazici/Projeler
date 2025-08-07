package KutuphaneSistemi;

import java.util.HashSet;
import java.util.Set;

public class Uye extends Kutuphane {
    private String uyeAdSoyad;
    private Set<Kutuphane> uyeKitapListesi = new HashSet<>();


    public Uye(String kitapAd, String yazar, int adet, String uyeAdSoyad) {
        super(kitapAd, yazar, adet);
        setUyeAdSoyad(uyeAdSoyad);
    }


    public void kitapAl(Kutuphane kutuphane) {
        super.kitapAl(kutuphane);
        setUyeKiatapListesi(kutuphane);
    }

    @Override
    public void kitapIadeEt(Kutuphane k) {
        super.kitapIadeEt(k);
        uyeKitapListesi.remove(k);
    }

    public String getUyeAdSoyad() {
        return uyeAdSoyad;
    }

    public void setUyeAdSoyad(String uyeAdSoyad) {
        this.uyeAdSoyad = uyeAdSoyad;
    }

    public Set<Kutuphane> getUyeKiatapListesi() {
        return uyeKitapListesi;
    }

    public void setUyeKiatapListesi(Kutuphane uyeKitapListesi) {
        if (this.uyeKitapListesi.size() < 3) {
            this.uyeKitapListesi.add(uyeKitapListesi);
            System.out.println("Kitap verildi.");
        } else {
            System.out.println("3 kitap aldınız daha fazla alamazsınız.");
        }
    }
}
