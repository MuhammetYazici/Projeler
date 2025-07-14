package SayiTahminOyunu;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int randomSayi;
        int tahmin;
        int sayac = 10;
        boolean deger = true;
        String sart = "";
        int deneme = 1;

        do {
            randomSayi = (int) (Math.random() * 101);
            sayac = 10;
            deneme = 1;
            deger = true;

            System.out.println("Bir sayı tuttum tahmin et bakalım");
            while (deger == true) {

                System.out.println("deneme hakkınız = " + sayac);
                System.out.print("Tahmininiz: ");
                try {
                    tahmin = oku.nextInt();
                    if (randomSayi > tahmin) {
                        System.out.println("Daha büyük bir sayı tahmin ediniz");
                    } else if (randomSayi < tahmin) {
                        System.out.println("daha küçük bir sayı tahmin ediniz");
                    } else {
                        System.out.println("Tebrikler " + deneme + " denemede buldunuz");
                        deger = false;
                    }
                    sayac--;
                    deneme++;

                } catch (Exception e) {
                    System.out.println("Sayı değeri giriniz.");
                    oku.nextLine();
                    continue;
                }
                if (sayac == 0) {
                    System.out.println("üzgünüm 10 deneme hakkınız doldu.");
                    break;
                }

            }
            oku.nextLine();
            System.out.print("Oyuna devam etmek ister misiniz(evet/hayır): ");
            sart = oku.nextLine();
        } while (sart.equalsIgnoreCase("evet"));

        System.out.println("Oyun bitti hoşçakal");
    }
}
