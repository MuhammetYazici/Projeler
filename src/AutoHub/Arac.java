package AutoHub;

import java.util.Scanner;

public class Arac {
    private int ilanNo;
    private String marka;
    private String model;
    private String seri;
    private int yil;
    private double fiyat;
    private String durum;
    private int km;
    private String yakit;
    private String vites;
    private String kasaTipi;
    private String renk;
    private String garanti;
    private String hasarKaydi;
    private String takas;
    private int kapiSayisi;
    private String sehir;

    String parcalarStr = "1-Kaput\n2-Tavan\n3-Bagaj Kapağı\n4-Sağ Ön Çamurluk\n" +
            "5-Sağ Ön Kapı\n6-Sağ Arka Kapı\n7-Sağ Arka Çamurluk\n" +
            "8-Sol Ön Çamurluk\n9-Sol Ön Kapı\n10-Sol Arka Kapı\n11-Sol Arka Çamurluk";

    Scanner oku = new Scanner(System.in);

    public Arac(int ilanNo, String marka, String model, String seri
            , int yil, double fiyat, String durum
            , int km, String yakit, String vites, String kasaTipi
            , String renk, String garanti
            , String hasarKaydi, String takas, int kapiSayisi,String sehir) {

        setIlanNo(ilanNo);
        setMarka(marka);
        setModel(model);
        setSeri(seri);
        setYil(yil);
        setFiyat(fiyat);
        setDurum(durum);
        setKm(km);
        setYakit(yakit);
        setVites(vites);
        setKasaTipi(kasaTipi);
        setRenk(renk);
        setGaranti(garanti);
        setHasarKaydi(hasarKaydi);
        setTakas(takas);
        setKapiSayisi(kapiSayisi);
        setSehir(sehir);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public int getIlanNo() {
        return ilanNo;
    }

    public void setIlanNo(int ilanNo) {
        this.ilanNo = ilanNo;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getGaranti() {
        return garanti;
    }

    public void setGaranti(String garanti) {
        this.garanti = garanti;
    }

    public String getHasarKaydi() {
        return hasarKaydi;
    }

    public void setHasarKaydi(String hasarKaydi) {
        this.hasarKaydi = hasarKaydi;
    }

    public String getTakas() {
        return takas;
    }

    public void setTakas(String takas) {
        this.takas = takas;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public void boyaBilgisiGiris(int boyaliParcaSayisi){
        Enum[] dizi = new Enum[boyaliParcaSayisi];
        if (boyaliParcaSayisi != 0 && boyaliParcaSayisi > 0){
            System.out.println(parcalarStr);
            for (int i = 0; i < boyaliParcaSayisi; i++) {
                System.out.print("Boyalı Parça Giriniz : ");
                int sayi = oku.nextInt();
                switch (sayi){
                    case 1: dizi[i]=Parcalar.KAPUT; break;
                    case 2: dizi[i]=Parcalar.TAVAN; break;
                    case 3: dizi[i]=Parcalar.BAGAJ; break;
                    case 4: dizi[i]=Parcalar.SAGONCAMURLUK; break;
                    case 5: dizi[i]=Parcalar.SAGONKAPI; break;
                    case 6: dizi[i]=Parcalar.SAGARKAKAPI; break;
                    case 7: dizi[i]=Parcalar.SAGARKACAMURLUK; break;
                    case 8: dizi[i]=Parcalar.SOLONCAMURLUK; break;
                    case 9: dizi[i]=Parcalar.SOLONKAPI; break;
                    case 10:dizi[i]=Parcalar.SOLARKAKAPI; break;
                    case 11:dizi[i]=Parcalar.SOLARKACAMURLUK; break;
                    default:
                        System.out.println("Yanlış Değer Girdiniz!");
                        i--;
                        break;
                }
            }
        } else if (boyaliParcaSayisi == 0) {
            System.out.println("Araçta Boyalı Parça Bulunmamaktadır.");
        }else
            System.out.println("Hatalı Değer Girdiniz!");


        for (int i = 0; i < dizi.length; i++) {
            String kelime = dizi[i].name();
            System.out.println(kelime);
        }

    }

    public void filtrele(){

    }
}
