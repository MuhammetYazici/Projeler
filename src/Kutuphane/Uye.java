package Kutuphane;

import java.util.HashSet;
import java.util.Set;

public class Uye extends Kisi {
    private Set<KutuphaneYonetimi> uyeKitapListesi = new HashSet<>();
    private KutuphaneYonetimi kutuphaneYonetimi=new KutuphaneYonetimi();

    public Uye(String name, String id) {
        super(name, id);
    }

    public void kitapAl(KutuphaneYonetimi kitap) {

        if (uyeKitapListesi.contains(kitap)) {
            System.out.println("bu kitaptan elinizde var.");

        } else {
            if (uyeKitapListesi.size() < 3) {
                uyeKitapListesi.add(kitap);
                kutuphaneYonetimi.kitapAl(kitap);
                System.out.println("kitap Eklendi.");

            } else {
                System.out.println("Listeniz dolu, yeni kitap alamazsınız.");

            }
        }
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


}
