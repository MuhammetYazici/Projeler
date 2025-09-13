package AutoHub;

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

    public Arac(int ilanNo, String marka, String model, String seri
            , int yil, double fiyat, String durum
            , int km, String yakit, String vites, String kasaTipi
            , String renk, String garanti
            , String hasarKaydi, String takas, int kapiSayisi) {

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

    public void filtrele(){

    }
}
