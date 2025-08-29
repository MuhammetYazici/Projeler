package UrunStokTakipSistemi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UrunStokTakipSistemi {

    public static void main(String[] args) {

        TreeMap<String, TreeMap<String, Integer>> urunBilgisi = new TreeMap<>();
        Scanner oku = new Scanner(System.in);
        String urunAdi = "";
        int urunID = 1;
        int urunFiyat;
        int urunStok;
        boolean deger = true;

        System.out.println("Ürün Stok Takip Sistemi");
        String menu =
                "1-Ürün Ekleme\n" +
                        "2-Ürün Stok Güncelleme\n" +
                        "3-Ürün Listeleme\n" +
                        "4-Ürün Silme\n" +
                        "5-Toplam Stok Miktarı\n" +
                        "6-Fiyat Hesaplama\n" +
                        "7-Fiyat Güncelleme\n" +
                        "8-Çıkış";


        do {

            try {
                System.out.println(menu);

                System.out.print("Yapmak istediğiniz işlem nedir(1-8) : ");
                int secim = oku.nextInt();

                switch (secim) {
                    case 1:
                        TreeMap<String, Integer> urun = new TreeMap<>();
                        oku.nextLine();
                        System.out.print("Ürün adı giriniz : ");
                        urunAdi = oku.nextLine();

                        System.out.print("Fiyat giriniz : ");
                        urunFiyat = oku.nextInt();

                        System.out.print("Stok giriniz : ");
                        urunStok = oku.nextInt();

                        urun.put("ID", urunID);
                        urun.put("Fiyat", urunFiyat);
                        urun.put("Stok", urunStok);

                        urunBilgisi.put(urunAdi, urun);
                        System.out.println(urunBilgisi);
                        urunID++;
                        break;

                    case 2:
                        oku.nextLine();
                        System.out.print("Ürün adı giriniz : ");
                        urunAdi = oku.nextLine();

                        System.out.print("Stok giriniz : ");
                        urunStok = oku.nextInt();

                        if (urunBilgisi.containsKey(urunAdi)) {
                            urunBilgisi.get(urunAdi).put("Stok", urunStok);
                            System.out.println("Stok Güncellendi");
                        } else {
                            System.out.println("Bu adla bir ürün bulunamadı.");
                        }
                        break;


                    case 3:
                        if (urunBilgisi.isEmpty()) {
                            System.out.println("Liste Boş");
                        } else {
                            for (Map.Entry<String, TreeMap<String, Integer>> kv : urunBilgisi.entrySet()) {
                                for (Map.Entry<String, Integer> kvb : kv.getValue().entrySet()) {
                                    System.out.println(kv.getKey()+" "+kvb.getKey() + ":" + kvb.getValue());
                                }
                            }
                        }
                        break;
                    case 4:
                        oku.nextLine();
                        System.out.print("Ürün adı giriniz : ");
                        urunAdi = oku.nextLine();
                        if (urunBilgisi.containsKey(urunAdi)) {
                            urunBilgisi.remove(urunAdi);
                            System.out.println(urunAdi + " Silindi");
                        } else {
                            System.out.println("Bu adla bir ürün bulunamadı.");
                        }
                        break;

                    case 5:
                        int top = 0;
                        for (Map.Entry<String, TreeMap<String, Integer>> kv : urunBilgisi.entrySet()) {
                            top += urunBilgisi.get(kv.getKey()).get("Stok");
                        }
                        System.out.println("Toplam Stok = " + top);
                        break;

                    case 6:
                        int adet;
                        top = 0;
                        oku.nextLine();
                        System.out.print("Almak istediğiniz ürünün adını giriniz : ");
                        urunAdi = oku.nextLine();

                        System.out.print("Kaç adet almak istiyorsunuz : ");
                        adet = oku.nextInt();
                        if (urunBilgisi.containsKey(urunAdi)) {
                            top = urunBilgisi.get(urunAdi).get("Fiyat") * adet;
                            System.out.println("Toplam Fiyat = " + top);
                        }else  {System.out.println("Bu adla bir ürün bulunamadı.");}
                        break;

                    case 7:
                        oku.nextLine();
                        System.out.print("Ürün adı giriniz : ");
                        urunAdi = oku.nextLine();

                        System.out.print("Yeni Fiyat giriniz : ");
                        urunFiyat = oku.nextInt();

                        if (urunBilgisi.containsKey(urunAdi)) {
                            urunBilgisi.get(urunAdi).put("Fiyat", urunFiyat);
                            System.out.println("Fiyat güncellendi");
                        }else {System.out.println("Bu adla bir ürün bulunamadı.");}
                        break;
                    case 8:
                        System.out.println("Çıkış Yapılıyor.");
                        deger = false;
                }
            } catch (Exception e) {
                System.out.println("Yanlış değer girdiniz tekrar deneyiniz.");
                oku.nextLine();
            }
        } while (deger == true);


    }
}
