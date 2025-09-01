package UrunStokTakipSistemi;

public class Main {
    public static void main(String[] args) {
        UrunIslemler urun1 = new UrunIslemler();
        urun1.urunEkle("domates",100,2,kategoriler.GIDA);
        urun1.urunEkle("domates",90,3,kategoriler.GIDA);
        urun1.urunSil("domates");
        urun1.urunSil("patates");
        urun1.urunEkle("domates",90,3,kategoriler.GIDA);
        urun1.urunGuncelle("domates",60,1);
        urun1.urunGuncelle("patates",55,4);
        urun1.urunListele();
    }
}
