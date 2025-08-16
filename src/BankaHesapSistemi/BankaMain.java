package BankaHesapSistemi;

public class BankaMain {
    public static void main(String[] args) {
        Musteri m = new Musteri("Muhammet","YAZICI");

        m.hesapAc(1000);
        m.hesapAc(2000);
        m.hesaplariGoster();

        Musteri m2 = new Musteri("Sefa","Berk");
        m2.hesapAc(20000);
        m2.hesapAc(15000);
        m2.hesapAc(6000);
        m2.hesaplariGoster();

        Hesap hesap1 = new Hesap(100000);
        hesap1.paraCek(10000);
        hesap1.paraYatir(40000);
        hesap1.bakiyeGoster();

        Banka banka1 = new Banka();
        banka1.MusteriEkle(m);
        banka1.MusteriEkle(m2);
        banka1.MusterileriGoster();
        banka1.musteriSil(m2);
        banka1.MusterileriGoster();
    }
}
