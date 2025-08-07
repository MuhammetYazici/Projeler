package KutuphaneSistemi;

public class KutuphaneIslemleri {
    public static void main(String[] args) {
        Kutuphane k1 = new Kutuphane("a","b",10);
        Kutuphane k2 = new Kutuphane("c","d",7);
        Uye uye1 = new Uye("v","g",8,"uye1");
        Kutuphane k3 = new Kutuphane("düşün","asdf",1);

        Yonetici.kitapEkle(k1);
        Yonetici.kitapEkle(k2);
        Yonetici.kitapEkle(k3);
        Yonetici.kitapEkle(uye1);

        uye1.kitapAl(uye1);
        uye1.kitapAl(k3);
        uye1.kitapAl(k1);
        uye1.kitapAl(k2);

        Kutuphane.kitapListele();
    }
}
