package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        String devamMi ="";
        String menu = "1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Çıkış";
        Scanner oku = new Scanner(System.in);
        System.out.println("Hesap Makinesine Hoş Geldiniz");

        do {

            int toplam = 0;
            double toplam1 = 0;
            try {
                System.out.println(menu);
                System.out.print("Yapmak istediğiniz işlemi seçiniz(1-5) : ");
                int secim = oku.nextInt();

                if (secim < 5) {
                    System.out.print("1.sayıyı giriniz : ");
                    int sayi1 = oku.nextInt();

                    System.out.print("2.sayıyı giriniz : ");
                    int sayi2 = oku.nextInt();

                    switch (secim) {
                        case 1:
                            toplam = sayi1 + sayi2;
                            if (sayi1 > sayi2) {
                                System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);
                                break;
                            } else {
                                System.out.print(sayi2 + " + " + sayi1 + " = " + toplam);
                                break;
                            }
                        case 2:
                            toplam=sayi1-sayi2;
                            System.out.println(sayi1 + " - " + sayi2 + " = " + toplam);
                            break;
                        case 3:
                            toplam = sayi1 * sayi2;
                            if (sayi1 > sayi2) {
                                System.out.println(sayi1 + " * " + sayi2 + " = " + toplam);
                                break;
                            } else {
                                System.out.println(sayi2 + " * " + sayi1 + " = " + toplam);
                                break;
                            }
                        case 4:
                            if (sayi2 != 0) {
                                toplam1 = (double) sayi1 / sayi2;
                                System.out.println(sayi1 + " / " + sayi2 + " = " + toplam1);
                                break;
                            } else {
                                System.out.println("Sıfıra Bölünemez.");
                                break;
                            }
                    }
                } else if (secim == 5) {
                    System.out.println("Çıkış Yapılıyor.");
                    break;
                }else {
                    System.out.println("Hatalı giriş yaptınız tekrar deneyiniz.");
                }
            }catch (Exception e){
                System.out.println("Harf girişi geçersiz lütfen sayı giriniz.");
            }
            oku.nextLine();
            System.out.println();
            System.out.print("Yeni bir işlem yapmak ister misiniz?(evet/hayır) : ");
            devamMi = oku.nextLine();
        } while (devamMi.equalsIgnoreCase("evet"));

        System.out.println("Hoşçakalın");
    }
}
