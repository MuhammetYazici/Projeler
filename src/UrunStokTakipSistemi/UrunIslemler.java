package UrunStokTakipSistemi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UrunIslemler extends UrunData {
    Scanner oku = new Scanner(System.in);


    public void urunEkle(String ad, int stok, double fiyat, kategorilerEnum tur) {
        if (!urunBul(ad)) {
            UrunData urunData = new UrunData(ad, stok, fiyat, tur);
            urunBilgileri.add(urunData);
            System.out.println(ad.toUpperCase() + " Listeye Eklendi.");
        } else
            System.out.println("Bu Ürün Listede Bulunmaktadır." +
                    "Ürün Bilgilerini Değiştirmek İçin Güncelleme Butonlarına Tıklayınız.");

        kategoriUrunEkle();
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

    public void urunGuncelle(String ad, int yeniStok, double yeniFiyat) {
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
        List<UrunData> urunData = new ArrayList<>();

        for (UrunData ud : urunBilgileri){
            urunData.add(ud);
        }

        for (int i = urunData.size()-1; i >= 0; i--) {
            System.out.println(urunData.get(i));
        }
    }

    public void urunRapor() {
        int toplamStok = 0;
        double toplamFiyat=0;

        for (UrunData ud : urunBilgileri){
            toplamStok = toplamStok += ud.getStok();
            toplamFiyat = toplamFiyat += ud.getFiyat();
        }

        System.out.println("Toplam Fiyat = " + toplamFiyat);
        System.out.println("Toplam Stok = " + toplamStok);
    }

    void kategoriUrunEkle(){
        List<UrunData> listGida = new ArrayList<>();
        List<UrunData> listGiyim = new ArrayList<>();
        List<UrunData> listElektronik = new ArrayList<>();
        List<UrunData> listTemizlik = new ArrayList<>();
        List<UrunData> listKozmeik = new ArrayList<>();

        for (UrunData ud : urunBilgileri){
            switch (ud.getTur()){
                case GIDA :
                    listGida.add(ud);
                    kategoriler.put(kategorilerEnum.GIDA,listGida); break;
                case GIYIM :
                    listGiyim.add(ud);
                    kategoriler.put(kategorilerEnum.GIDA,listGiyim); break;
                case KOZMETIK:
                    listKozmeik.add(ud);
                    kategoriler.put(kategorilerEnum.KOZMETIK,listKozmeik);break;
                case TEMIZLIK:
                    listTemizlik.add(ud);
                    kategoriler.put(kategorilerEnum.TEMIZLIK,listTemizlik);break;
                case ELEKTRONIK:
                    listElektronik.add(ud);
                    kategoriler.put(kategorilerEnum.ELEKTRONIK,listElektronik);break;
            }
        }
    }


     boolean urunBul(String ad) {
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
