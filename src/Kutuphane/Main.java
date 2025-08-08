package Kutuphane;

public class Main {
    public static void main(String[] args) {
        Yonetici admin = new Yonetici("Ahmet", "Y001");
        Uye uye1 = new Uye("Ayşe", "U001");

        KutuphaneYonetimi kitap1 = new KutuphaneYonetimi("Simyacı", "Paulo Coelho", 2);
        KutuphaneYonetimi kitap2 = new KutuphaneYonetimi("Suç ve Ceza", "Dostoyevski", 3);

        admin.kitapEkle(kitap1);
        admin.kitapEkle(kitap2);

        uye1.kitapAl(kitap1);
        uye1.kitapAl(kitap2);

        uye1.kitapListele();
    }
}
