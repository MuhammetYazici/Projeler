package GunlukGorevListesi;

import java.util.ArrayList;
import java.util.Scanner;

public class AlısverisListesi {
    public static void main(String[] args) {
        System.out.println("****** Alışveriş Listeniz ******");
        String menu = "1-Ürün Ekleme\n2-Listeyi Gör\n3-Ürün Sil\n4-Çıkış Yap";
        ArrayList<String> liste = new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        int cevap;
        do {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi giriniz : ");
            cevap = oku.nextInt();
            oku.nextLine();
            switch (cevap) {
                case 1:
                    System.out.print("Ürün adı giriniz : ");
                    String urun = oku.nextLine();
                    liste.add(urun);
                    System.out.println(urun + " eklendi");
                    break;
                case 2:
                    System.out.println("*** Ürün Listesi ***");
                    for (int i = 0; i < liste.size(); i++) {
                        System.out.println(i + 1 + "." + liste.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Silmek istediğiniz ürünü giriniz : ");
                    urun = oku.nextLine();
                    boolean deger = liste.remove(urun);
                    if (deger) {
                        System.out.println(urun + " silindi");
                    }else
                        System.out.println(urun+" listede bulunamadı.");
                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor");
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz tekrar deneyiniz.");
            }
        } while (cevap != 4);
    }
}
