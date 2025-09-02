package UrunStokTakipSistemi;

public class Main {
    public static void main(String[] args) {
        UrunIslemler urun1 = new UrunIslemler();
        urun1.urunEkle("domates",100,2, kategorilerEnum.GIDA);
        urun1.urunEkle("patates",200,4, kategorilerEnum.GIDA);
        urun1.urunListele();

        urun1.urunRapor();

    }
}
