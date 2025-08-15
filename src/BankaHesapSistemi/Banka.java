package BankaHesapSistemi;

import java.util.ArrayList;

public class Banka {
    private Musteri musteri = new Musteri();
    private ArrayList<Musteri> musteriListesi = new ArrayList<>();

    public void MusterileriGoster(){
        for (int i = 0; i < musteriListesi.size(); i++) {
            System.out.println(musteriListesi.get(i));
        }
    }

    public void MusteriEkle(Musteri musteri) {
        musteriListesi.add(musteri);
    }

    public void musteriSil(Musteri musteri)
    {
        musteriListesi.remove(musteri);
    }
}
