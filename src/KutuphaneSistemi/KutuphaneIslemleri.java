package KutuphaneSistemi;

public class KutuphaneIslemleri {
    public static void main(String[] args) {
        Yonetici k1 = new Yonetici("a","b",6,"muhammet");
        Yonetici.kitapEkle(k1);
        Yonetici k2 = new Yonetici("b","c",8,"Muahmmet");
        Yonetici.kitapEkle(k2);
        Yonetici k3 = new Yonetici("d","h",10,"Muhammet");
        Yonetici.kitapEkle(k3);

        Kutuphane.kitapListele();
    }
}
