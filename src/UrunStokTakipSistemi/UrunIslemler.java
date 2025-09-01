package UrunStokTakipSistemi;

import java.util.Scanner;
import java.util.Set;

public class UrunIslemler extends UrunData {
    Scanner oku = new Scanner(System.in);


    public void urunEkle(String ad, int stok, int fiyat, kategoriler tur) {
        if (!urunBul(ad)) {
            UrunData urunData = new UrunData(ad, stok, fiyat, tur);
            urunBilgileri.add(urunData);
            System.out.println(ad.toUpperCase() + " Listeye Eklendi.");
        } else
            System.out.println("Bu Ürün Listede Bulunmaktadır." +
                    "Ürün Bilgilerini Değiştirmek İçin Güncelleme Butonlarına Tıklayınız.");

    }

    public void urunSil(String ad) {
        if (urunBul(ad)) {
            for (UrunData ud : urunBilgileri) {
                if (ud.getAd().equalsIgnoreCase(ad)) {
                    urunBilgileri.remove(ud);
                    ud.setId(getId()-1);
                    System.out.println(ad.toUpperCase() + " Listeden Silindi.");
                    break;
                }
            }
        } else {
            System.out.println("Listede " + ad.toUpperCase() + " Adında Bir Ürün Bulunmamaktadır.");
        }
    }

    public void urunGuncelle(String ad, int yeniStok, int yeniFiyat) {
        if (urunBul(ad)) {
            for (UrunData ud : urunBilgileri) {
                ud.setStok(yeniStok);
                ud.setFiyat(yeniFiyat);
                System.out.println(ad.toUpperCase()+" Ürünü Stok ve Fiyat Bilgileri Güncellendi.");
                break;
            }
        }else {
            System.out.println("Listede " + ad.toUpperCase() + " Adında Bir Ürün Bulunmamaktadır.");
        }
    }

    public void urunListele() {
        System.out.println("********** URUN BİLGİLERİ **********");
        for (UrunData ud : urunBilgileri){
            System.out.println(ud);
        }
    }

    public void urunRapor() {

    }

    public boolean urunBul(String ad) {
        boolean deger = false;
        for (UrunData ud : urunBilgileri) {
            if (ud.getAd().equalsIgnoreCase(ad)) {
                deger = true;
                break;
            }
        }

        return deger;
    }
}
