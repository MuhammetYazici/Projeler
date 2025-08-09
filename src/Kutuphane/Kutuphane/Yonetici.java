package Kutuphane.Kutuphane;

public class Yonetici extends Kisi{
    KutuphaneYonetimi kutuphaneYonetimi = new KutuphaneYonetimi();
    public Yonetici(String name, String id) {
        super(name, id);
    }

    public void kitapEkle(KutuphaneYonetimi k){
        kutuphaneYonetimi.kitapEkle(k);
    }
}
