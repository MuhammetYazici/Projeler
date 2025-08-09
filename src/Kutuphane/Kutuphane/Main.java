package Kutuphane.Kutuphane;

public class Main {
    public static void main(String[] args) {

            // Kütüphane yöneticisi kitap ekliyor
            KutuphaneYonetimi k1 = new KutuphaneYonetimi("Suç ve Ceza", "Dostoyevski", 2);
            KutuphaneYonetimi k2 = new KutuphaneYonetimi("Sefiller", "Victor Hugo", 1);
            KutuphaneYonetimi k3 = new KutuphaneYonetimi("Kürk Mantolu Madonna", "Sabahattin Ali", 3);

            KutuphaneYonetimi kutuphane = new KutuphaneYonetimi();
            kutuphane.kitapEkle(k1);
            kutuphane.kitapEkle(k2);
            kutuphane.kitapEkle(k3);

            System.out.println("\n📚 Kütüphane Listesi:");
            kutuphane.kitapListele();

            // Üye oluştur
            Uye uye1 = new Uye("Ali", "001");

            // Kitap alma denemeleri
            System.out.println("\n--- Ali kitap alıyor ---");
            uye1.kitapAl(k1); // Alır
            uye1.kitapAl(k2); // Alır
            uye1.kitapAl(k3); // Alır
            uye1.kitapAl(k1); // Tekrar almaya çalışır
            uye1.kitapAl(new KutuphaneYonetimi("Deneme", "Yazar X", 1)); // 4. kitap denemesi

            System.out.println("\n📖 Ali'nin Kitap Listesi:");
            uye1.kitapListele();

            System.out.println("\n📚 Kütüphane Listesi (kitaplar azaldı):");
            kutuphane.kitapListele();

            // Kitap iade etme
            System.out.println("\n--- Ali kitap iade ediyor ---");
            uye1.kitapIade(k1);

            System.out.println("\n📖 Ali'nin Kitap Listesi (iade sonrası):");
            uye1.kitapListele();

            System.out.println("\n📚 Kütüphane Listesi (iade sonrası):");
            kutuphane.kitapListele();
    }
}
