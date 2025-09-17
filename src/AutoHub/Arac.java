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
    private int motorHacmi;
    private int motorGucu;

    private Enum[] diziBoya = null;
    private Enum[] diziDegisen = null;

    String parcalarStr = "1-Kaput\n2-Tavan\n3-Bagaj Kapağı\n4-Sağ Ön Çamurluk\n" +
            "5-Sağ Ön Kapı\n6-Sağ Arka Kapı\n7-Sağ Arka Çamurluk\n" +
            "8-Sol Ön Çamurluk\n9-Sol Ön Kapı\n10-Sol Arka Kapı\n11-Sol Arka Çamurluk";

    static String fitrelerStr = "1-Sehir\n2-Fiyat\n3-Yıl\n4-Yakıt\n" +
            "5-Vites\n6-Araç Durumu\n7-KM\n" +
            "8-Kasa Tipi\n9-Motor Gücü\n10-Motor Hacmi\n11-Çekiş\n12-Renk\n" +
            "13-Garanti\n14-Hasar Kaydı\n15-Takas\n16-Boya Değişen";

    static Scanner oku = new Scanner(System.in);

    public Arac(int ilanNo, String marka, String model, String seri
            , int yil, double fiyat, String durum
            , int km, String yakit, String vites, String kasaTipi
            , String renk, String garanti
            , String hasarKaydi, String takas, int kapiSayisi,String sehir,int motorHacmi,int motorGucu) {

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
        setMotorHacmi(motorHacmi);
        setMotorGucu(motorGucu);
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(int motorGucu) {
        this.motorGucu = motorGucu;
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
        this.diziBoya = new Enum[boyaliParcaSayisi];
        if (boyaliParcaSayisi != 0 && boyaliParcaSayisi > 0){
            System.out.println(parcalarStr);
            for (int i = 0; i < boyaliParcaSayisi; i++) {
                System.out.print("Boyalı Parça Giriniz : ");
                int sayi = oku.nextInt();
                switch (sayi){
                    case 1: diziBoya[i]=Parcalar.KAPUT; continue;
                    case 2: diziBoya[i]=Parcalar.TAVAN; continue;
                    case 3: diziBoya[i]=Parcalar.BAGAJ; continue;
                    case 4: diziBoya[i]=Parcalar.SAGONCAMURLUK; continue;
                    case 5: diziBoya[i]=Parcalar.SAGONKAPI; continue;
                    case 6: diziBoya[i]=Parcalar.SAGARKAKAPI; continue;
                    case 7: diziBoya[i]=Parcalar.SAGARKACAMURLUK; continue;
                    case 8: diziBoya[i]=Parcalar.SOLONCAMURLUK; continue;
                    case 9: diziBoya[i]=Parcalar.SOLONKAPI; continue;
                    case 10:diziBoya[i]=Parcalar.SOLARKAKAPI; continue;
                    case 11:diziBoya[i]=Parcalar.SOLARKACAMURLUK; continue;
                    default:
                        System.out.println("Yanlış Değer Girdiniz!");
                        i--;
                        continue;
                }
            }
        } else if (boyaliParcaSayisi == 0) {
            this.diziBoya[0]=Parcalar.BOYASIZ;
        }else
            System.out.println("Hatalı Değer Girdiniz!");
    }

    public void degisenParcaGiris(int degisenParcaSayisi){
        this.diziDegisen = new Enum[degisenParcaSayisi];
        if (degisenParcaSayisi>0 && degisenParcaSayisi!=0){
            System.out.println(parcalarStr);

            for (int i = 0; i < degisenParcaSayisi; i++) {
                System.out.print("Değişen Parçaları Giriniz : ");
                int sayi = oku.nextInt();
                switch (sayi){
                    case 1: diziDegisen[i]=Parcalar.KAPUT; continue;
                    case 2: diziDegisen[i]=Parcalar.TAVAN; continue;
                    case 3: diziDegisen[i]=Parcalar.BAGAJ; continue;
                    case 4: diziDegisen[i]=Parcalar.SAGONCAMURLUK; continue;
                    case 5: diziDegisen[i]=Parcalar.SAGONKAPI; continue;
                    case 6: diziDegisen[i]=Parcalar.SAGARKAKAPI; continue;
                    case 7: diziDegisen[i]=Parcalar.SAGARKACAMURLUK; continue;
                    case 8: diziDegisen[i]=Parcalar.SOLONCAMURLUK; continue;
                    case 9: diziDegisen[i]=Parcalar.SOLONKAPI; continue;
                    case 10:diziDegisen[i]=Parcalar.SOLARKAKAPI; continue;
                    case 11:diziDegisen[i]=Parcalar.SOLARKACAMURLUK; continue;
                    default:
                        System.out.println("Yanlış Değer Girdiniz!");
                        i--;
                        continue;
                }
            }
        } else if (degisenParcaSayisi == 0) {
            this.diziDegisen[0]=Parcalar.DEGISENSIZ;
        }else
            System.out.println("Hatalı Değer Girdiniz!");
    }

    public void BoyaDegisenBilgisi(){
        if (this.diziBoya != null){
            System.out.println("----- Boya -----");
            for (int i = 0; i < this.diziBoya.length; i++) {
                System.out.println(diziBoya[i]);
            }
        }else
            System.out.println("Araçta Boyalı Parça Bulunmamaktadır.");

        if (this.diziDegisen != null){
            System.out.println("----- Değişen  -----");
            for (int i = 0; i < diziDegisen.length; i++) {
                System.out.println(diziDegisen[i]);
            }
        }else
            System.out.println("Araçta Değişen Parça Bulunmamaktadır.");

    }

    static void filtrele(){
        System.out.print("");
        System.out.println(fitrelerStr);
        do {
            System.out.print("Hangi Alanı Filtrelemek İstiyorsunuz(1/16) : ");
            int sayi=oku.nextInt();
            switch (sayi){
                case 1:
                    oku.nextLine();
                    System.out.print("Şehir Giriniz : ");
                    String sehir = oku.nextLine();
                    setSehir(sehir);
                    break;

                case 2:
                    System.out.print("Minimum Fiyat Giriniz : ");
                    int minFiyat = oku.nextInt();

                    System.out.println("Maximum Fiyat Giriniz : ");
                    int maxFiyat = oku.nextInt();


            }

        }while (true);
    }
}
