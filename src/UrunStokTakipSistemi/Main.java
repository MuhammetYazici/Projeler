package UrunStokTakipSistemi;

public class Main {
    public static void main(String[] args) {

        UrunIslemler urun1 = new UrunIslemler();
        urun1.urunEkle("patates",200,4, kategorilerEnum.GIDA);
        UrunIslemler urun2 = new UrunIslemler();
        urun2.urunEkle("omo",45,65,kategorilerEnum.TEMIZLIK);
        UrunIslemler urun3 = new UrunIslemler();
        urun3.urunEkle("iphone",30,16000,kategorilerEnum.ELEKTRONIK);
        UrunIslemler urun4 = new UrunIslemler();
        urun4.urunEkle("apple",20,20000,kategorilerEnum.ELEKTRONIK);
        urun4.urunEkle("samsung",10,15000,kategorilerEnum.ELEKTRONIK);

        UrunIslemler.kategoriListele();

    }
}
