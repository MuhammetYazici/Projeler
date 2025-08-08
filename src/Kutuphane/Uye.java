package Kutuphane;

import java.util.HashSet;
import java.util.Set;

public class Uye extends Kisi {
    private Set<KutuphaneYonetimi> uyeKitapListesi = new HashSet<>();
    private KutuphaneYonetimi kutuphaneYonetimi=new KutuphaneYonetimi();

    public Uye(String name, String id) {
        super(name, id);
    }

    public void kitapAl(KutuphaneYonetimi k) {

    }

    public void kitapIade(KutuphaneYonetimi k) {
        this.kutuphaneYonetimi.kitapIadeEt(k);
        uyeKitapListesi.remove(k);
    }

    public void kitapListele() {
        this.kutuphaneYonetimi.kitapListele();
    }

    public Set<KutuphaneYonetimi> getUyeKiatapListesi() {
        return uyeKitapListesi;
    }

    public void uyeKitapEkle(KutuphaneYonetimi kitap) {
        
    }
}
