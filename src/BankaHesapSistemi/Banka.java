package BankaHesapSistemi;

import java.util.ArrayList;

public class Banka {
    private Musteri musteri = new Musteri();
    private ArrayList<Musteri> musteriListesi = new ArrayList<>();

    public void MusterileriGoster(){
        System.out.println("****** MÜŞTERİ LİSTESİ ******");
        for (int i = 0; i < musteriListesi.size(); i++) {
            System.out.println(musteriListesi.get(i));
        }
    }

    public void MusteriEkle(Musteri musteri) {
        musteriListesi.add(musteri);
        System.out.println("Müşteri Ekleme İşlemi Başarılı");
    }

    public void musteriSil(Musteri musteri)
    {
        musteriListesi.remove(musteri);
        System.out.println("Müşteri Silme İşlemi Başarılı");
    }
}
