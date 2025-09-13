package UrunStokTakipSistemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kategori secilenKategoriler = null;
        UrunData urunData = new UrunData();
        UrunIslemler urunIslemler = new UrunIslemler();
        Scanner oku = new Scanner(System.in);
        String urunadi = "";
        int stok;
        double fiyat;
        int sayi;
        int secim;


        String menu = "1-Ürün Ekle\n" +
                "2-Ürün Bilgileri Güncelleme\n" +
                "3-Ürün Silme\n" +
                "4-Ürün Listeleme\n" +
                "5-Ürün Raporu\n" +
                "6-Çıkış";

        String kategoriListesi = "1-GIDA\n" +
                "2-GİYİM\n" +
                "3-KOZMETİK\n" +
                "4-TEMİZLİK\n" +
                "5-ELEKTRONİK";

        do {
            System.out.println(menu);
            System.out.print("Yapmak İstedğiniz İşlemi Seçiniz : ");
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    oku.nextLine();
                    System.out.print("Ürün Adı Giriniz : ");
                    urunadi = oku.nextLine();

                    System.out.print("Stok Miktarı Giriniz : ");
                    stok = oku.nextInt();

                    System.out.print("Fiyat Giriniz : ");
                    fiyat = oku.nextDouble();

                    System.out.println(kategoriListesi);
                    System.out.print("Kategori Seçiniz  : ");
                    sayi = oku.nextInt();

                    switch (sayi) {
                        case 1:
                            secilenKategoriler = Kategori.GIDA;
                            break;
                        case 2:
                            secilenKategoriler = Kategori.GIYIM;
                            break;
                        case 3:
                            secilenKategoriler = Kategori.KOZMETIK;
                            break;
                        case 4:
                            secilenKategoriler = Kategori.TEMIZLIK;
                            break;
                        case 5:
                            secilenKategoriler = Kategori.ELEKTRONIK;
                            break;
                        default:
                            System.out.println("Geçersiz Seçim Yaptınız!");
                    }
                    urunIslemler.urunEkle(urunadi, stok, fiyat, secilenKategoriler);
                    break;

                case 2:
                    oku.nextLine();
                    System.out.print("Ürün Adı Giriniz : ");
                    urunadi = oku.nextLine();

                    System.out.print("Yeni Stok Miktarı Giriniz : ");
                    stok = oku.nextInt();

                    System.out.print("Yeni Fiyat Giriniz : ");
                    fiyat = oku.nextDouble();

                    urunIslemler.urunGuncelle(urunadi,stok,fiyat);
                    break;

                case 3:
                    oku.nextLine();
                    System.out.print("Ürün Adı Giriniz : ");
                    urunadi = oku.nextLine();
                    urunIslemler.urunSil(urunadi);
                    break;

                case 4:
                    oku.nextLine();
                    UrunIslemler.kategoriListele();
                    break;

                case 5:
                    oku.nextLine();
                    System.out.print("Ürün Adı Giriniz : ");
                    urunadi = oku.nextLine();
                    urunIslemler.urunRapor(urunadi);
                    break;

                case 6 :
                    System.out.println("Çıkış Yapılıyor.");
                    break;

                default:
                    System.out.println("Geçersiz Giriş Yaptınız! ");
            }


        } while (secim != 6 && secim >0 && secim<7);

    }
}
