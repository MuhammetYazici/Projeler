package UrunStokTakipSistemi;

import java.util.*;

import static UrunStokTakipSistemi.UrunData.kategoriler;


public  class UrunIslemler {
    UrunData urda = new UrunData();
    List<UrunData> listGida = new ArrayList<>();
    List<UrunData> listGiyim = new ArrayList<>();
    List<UrunData> listElektronik = new ArrayList<>();
    List<UrunData> listTemizlik = new ArrayList<>();
    List<UrunData> listKozmeik = new ArrayList<>();


    public void urunEkle(String ad, int stok, double fiyat, kategorilerEnum tur) {
        if (!urunBul(ad)) {
            UrunData urunData = new UrunData(ad, stok, fiyat, tur);
            urda.urunBilgileri.add(urunData);
            kategoriUrunEkle(urunData);
            System.out.println(ad.toUpperCase() + " Listeye Eklendi.");
        } else
            System.out.println("Bu Ürün Listede Bulunmaktadır." +
                    "Ürün Bilgilerini Değiştirmek İçin Güncelleme Butonlarına Tıklayınız.");

    }

    public void urunSil(String ad) {
        if (urunBul(ad)) {
            for (UrunData ud : urda.urunBilgileri) {
                if (ud.getAd().equalsIgnoreCase(ad)) {
                    urda.urunBilgileri.remove(ud);
                    kategoriUrunSil(ad);
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
            for (UrunData ud : urda.urunBilgileri) {
                if (ud.getAd().equalsIgnoreCase(ad)){
                ud.setStok(yeniStok);
                ud.setFiyat(yeniFiyat);
                kategoriUruNGuncelle(ad,yeniStok,yeniFiyat);
                System.out.println(ad.toUpperCase() + " Ürünü Stok ve Fiyat Bilgileri Güncellendi.");
                break;
                }
            }
        } else {
            System.out.println("Listede " + ad.toUpperCase() + " Adında Bir Ürün Bulunmamaktadır.");
        }
    }

    public void urunListele() {
        System.out.println("********** URUN BİLGİLERİ **********");
        List<UrunData> urunData = new ArrayList<>();

        for (UrunData ud : urda.urunBilgileri) {
            urunData.add(ud);
        }

        for (int i = urunData.size() - 1; i >= 0; i--) {
            System.out.println(urunData.get(i));
        }
    }

    public void urunRapor(String ad) {
        if (urunBul(ad)) {
            for (UrunData ud : urda.urunBilgileri) {
                if (ud.getAd().equalsIgnoreCase(ad)) {
                    System.out.println(ad.toUpperCase() + " Stok Miktarı : " + ud.getStok());
                    System.out.println(ad.toUpperCase() + " Beklenen Kazanç : " + ud.getStok() * ud.getFiyat());
                    break;
                }
            }
        } else
            System.out.println(ad + " adında bir ürün bulunamadı.");
    }

    private void kategoriUrunEkle(UrunData ud) {

        switch (ud.getTur()) {
            case GIDA:
                listGida.add(ud);
                kategoriler.put(kategorilerEnum.GIDA, listGida);
                break;
            case GIYIM:
                listGiyim.add(ud);
                kategoriler.put(kategorilerEnum.GIYIM, listGiyim);
                break;
            case KOZMETIK:
                listKozmeik.add(ud);
                kategoriler.put(kategorilerEnum.KOZMETIK, listKozmeik);
                break;
            case TEMIZLIK:
                listTemizlik.add(ud);
                kategoriler.put(kategorilerEnum.TEMIZLIK, listTemizlik);
                break;
            case ELEKTRONIK:
                listElektronik.add(ud);
                kategoriler.put(kategorilerEnum.ELEKTRONIK, listElektronik);
                break;
        }
    }

    static void kategoriUruNGuncelle(String ad, int yeniStok, double yeniFiyat){
        for (Map.Entry<kategorilerEnum,List<UrunData>> k : kategoriler.entrySet()){
            for (UrunData urun : k.getValue()){
                if (urun.getAd().equalsIgnoreCase(ad)){
                    urun.setStok(yeniStok);
                    urun.setFiyat(yeniFiyat);
                }
            }
        }
    }

    static void kategoriUrunSil(String ad) {
        for (Map.Entry<kategorilerEnum, List<UrunData>> k : kategoriler.entrySet()) {
            k.getValue().removeIf(urun -> urun.getAd().equalsIgnoreCase(ad));
        }
    }

    public static void kategoriListele() {
        for (Map.Entry<kategorilerEnum,List<UrunData>> k: kategoriler.entrySet()){
            System.out.println("-------  "+k.getKey()+"  -------");
            for (UrunData urun : k.getValue()){
                System.out.println(urun);
            }
        }
    }


    boolean urunBul(String ad) {
        boolean deger = false;
        for (UrunData ud : urda.urunBilgileri) {
            if (ud.getAd().equalsIgnoreCase(ad)) {
                deger = true;
                break;
            }
        }

        return deger;
    }
}
