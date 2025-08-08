package Kutuphane;

public class Yonetici extends Kisi{
    public Yonetici(String name, String id) {
        super(name, id);
    }

    public void kitapEkle(KutuphaneYonetimi k){
        KutuphaneYonetimi.kitapEkle(k);
    }
}
