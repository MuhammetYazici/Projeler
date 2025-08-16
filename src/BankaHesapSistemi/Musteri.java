package BankaHesapSistemi;

import java.util.ArrayList;
import java.util.Scanner;

public class Musteri {
    private final int id;
    private String ad;
    private String soyad;
    private ArrayList<Hesap> hesapListesi = new ArrayList<>();
    private Scanner oku = new Scanner(System.in);


    private static int sayac = 1;

    public Musteri() {
        this.id = getId();
    }

    public Musteri(String ad, String soyad) {
        this.id = sayac++;
        setAd(ad);
        setSoyad(soyad);
    }

    public void hesapAc(double bakiye) {
        System.out.print("1-Vadeli Hesap\n2-Vadesiz Hesap\nHangi Hesap Türünü Açmak İstiyorsunuz(1/2) :  ");
        int sayi = oku.nextInt();
        if (sayi == 1) {
            System.out.print("Vade Süresi Giriniz(Gün) : ");
            double vade = oku.nextInt();
            VadeliHesap vadeliHesap = new VadeliHesap(bakiye,vade);
            hesapListesi.add(vadeliHesap);
            System.out.println("Vadeli Hesabınız Açıldı.");
            System.out.println("Bakiyeniz : " + bakiye);
            System.out.println("Mevduatınız : "+vadeliHesap.vadeliMevduat());
        } else if (sayi == 2) {
            VadesizHesap vadesizHesap = new VadesizHesap(bakiye);
            hesapListesi.add(vadesizHesap);
            System.out.println("Vadesiz Hesabınız Açıldı.");
            System.out.println("Bakiyeniz : " + bakiye);
        }else
            System.out.println("Yanlış Değer Girdiniz Tekrar Deneyiniz.");
    }

    public void hesaplariGoster() {
        System.out.println("****** HESAPLAR ******");
        System.out.println(this.toString());
        for (int i = 0; i < hesapListesi.size(); i++) {
            System.out.println(hesapListesi.get(i));
        }
        System.out.println("**********************");
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                "}";
    }

}
