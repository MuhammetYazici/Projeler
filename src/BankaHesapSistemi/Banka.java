package BankaHesapSistemi;

public class Banka {
    private Musteri musteri = new Musteri();

    public void MusterileriGoster(){
        for (int i = 0; i < musteri.musteriListesi.size(); i++) {
            System.out.println(musteri.musteriListesi.get(i));
        }
    }

    public void MusteriEkle(Musteri musteri) {
        musteri.musteriListesi.add(musteri);
    }
}
