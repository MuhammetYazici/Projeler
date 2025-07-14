package OgrenciNotSistemi;

import java.util.Scanner;

public class OgrenciNotSistemi {
    public static void main(String[] args) {

        System.out.println("Not Sistemine Hoş Geldiniz");
        Scanner oku = new Scanner(System.in);

        try {
            System.out.print("Sınıf mevcudu kaç : ");
            int sinifMevcudu = oku.nextInt();


            Object[][] bilgiler = new Object[sinifMevcudu][7];


            for (int i = 0; i < bilgiler.length; i++) {
                oku.nextLine();
                System.out.print("Öğrencinin adınını soyadını Giriniz : ");
                String adsoyad = oku.nextLine();

                System.out.print("Vize notunu giriniz : ");
                int vize = oku.nextInt();

                System.out.print("Final notunu giriniz : ");
                int finalN = oku.nextInt();

                if (vize < 0 || vize > 100 || finalN < 0 || finalN > 100) {
                    System.out.println("Notlar 0 ile 100 arasında olmalı. Lütfen tekrar giriniz.");
                    i--; // aynı öğrenciyi tekrar al
                    continue;
                }


                for (int j = 0; j < bilgiler[i].length; j++) {
                    switch (j) {
                        case 0:
                            bilgiler[i][j] = i + 1;
                            break;
                        case 1:
                            bilgiler[i][j] = adsoyad;
                            break;
                        case 2:
                            bilgiler[i][j] = vize;
                            break;
                        case 3:
                            bilgiler[i][j] = finalN;
                            break;
                        case 4:
                            bilgiler[i][j] = NotOrtlama(vize, finalN);
                            break;
                        case 5:
                            bilgiler[i][j] = HarfNotu(NotOrtlama(vize, finalN));
                            break;
                        case 6:
                            bilgiler[i][j] = durum(HarfNotu(NotOrtlama(vize, finalN)));
                    }
                }
            }

            System.out.println("| ListeNo | Ad Soyad | Vize | Final | Ortalama | HarfNotu | Durum |");

            for (int i = 0; i < bilgiler.length; i++) {
                for (int j = 0; j < bilgiler[i].length; j++) {
                    System.out.print("|     " + bilgiler[i][j] + "\t");
                }
                System.out.print("\t|");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Uygun değer giriniz!(sayı istenen yere metin ya da metin istenen yere sayı girmeyiniz.)" +
                    "girdiğiniz notlar 100 ün üstünde olmasın");
        }

    }

    public static double NotOrtlama(int sayi1, int sayi2) {

        return (double) (sayi1 + sayi2) / 2;
    }

    ;

    public static String HarfNotu(double notOrt) {
        String harf = "";
        if (90 <= notOrt && notOrt <= 100) {
            harf = "AA";
        } else if (80 <= notOrt && notOrt <= 89) {
            harf = "BA";
        } else if (70 <= notOrt && notOrt <= 79) {
            harf = "BB";
        } else if (60 <= notOrt && notOrt <= 69) {
            harf = "CB";
        } else if (50 <= notOrt && notOrt <= 59) {
            harf = "CC";
        } else if (40 <= notOrt && notOrt <= 49) {
            harf = "DC";
        } else if (30 <= notOrt && notOrt <= 39) {
            harf = "DD";
        } else {
            harf = "FF";
        }

        return harf;
    }

    ;

    public static String durum(String harf) {
        String harf1 = "";
        switch (harf) {
            case "AA":
            case "BA":
            case "BB":
            case "CB":
            case "CC":
                harf1 = "GEÇTİ";
                break;
            case "DC":
            case "DD":
            case "FF":
                harf1 = "KALDI";
                break;
        }
        return harf1;

    }
}
