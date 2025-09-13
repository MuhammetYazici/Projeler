package AutoHub;

public class TeknikOzellikler extends Arac{
    private String segment;
    private double sehirIciYakit;
    private double SehirDisiYakit;
    private double ortalamaYakit;
    private int depoHacmi;
    private int HP;
    private int tork;
    private String sanziman;
    private double hizlanma;
    private int azamiSurat;
    private int motorHacmi;
    private int uzunluk;
    private int genislik;
    private int yukseklik;
    private int netAgirlik;
    private int bagajHacmi;
    private String lastikOlculeri;

    public TeknikOzellikler(int ilanNo, String marka, String model, String seri
            , int yil, double fiyat, String durum, int km, String yakit
            , String vites, String kasaTipi, String renk, String garanti
            , String hasarKaydi, String takas, int kapiSayisi,String segment
            , double sehirIciYakit, double sehirDisiYakit
            , double ortalamaYakit, int depoHacmi, int HP, int tork
            , String sanziman, double hizlanma, int azamiSurat
            , int motorHacmi, int uzunluk, int genislik, int yukseklik
            , int netAgirlik, int bagajHacmi, String lastikOlculeri) {

        super(ilanNo, marka, model, seri, yil, fiyat, durum, km, yakit, vites, kasaTipi, renk, garanti, hasarKaydi, takas, kapiSayisi);
        setSegment(segment);
        setSehirIciYakit(sehirIciYakit);
        setSehirDisiYakit(sehirDisiYakit);
        setOrtalamaYakit(ortalamaYakit);
        setDepoHacmi(depoHacmi);
        setHP(HP);
        setTork(tork);
        setSanziman(sanziman);
        setHizlanma(hizlanma);
        setAzamiSurat(azamiSurat);
        setMotorHacmi(motorHacmi);
        setUzunluk(uzunluk);
        setGenislik(genislik);
        setYukseklik(yukseklik);
        setNetAgirlik(netAgirlik);
        setBagajHacmi(bagajHacmi);
        setLastikOlculeri(lastikOlculeri);
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public double getSehirIciYakit() {
        return sehirIciYakit;
    }

    public void setSehirIciYakit(double sehirIciYakit) {
        this.sehirIciYakit = sehirIciYakit;
    }

    public double getSehirDisiYakit() {
        return SehirDisiYakit;
    }

    public void setSehirDisiYakit(double sehirDisiYakit) {
        SehirDisiYakit = sehirDisiYakit;
    }

    public double getOrtalamaYakit() {
        return ortalamaYakit;
    }

    public void setOrtalamaYakit(double ortalamaYakit) {
        this.ortalamaYakit = ortalamaYakit;
    }

    public int getDepoHacmi() {
        return depoHacmi;
    }

    public void setDepoHacmi(int depoHacmi) {
        this.depoHacmi = depoHacmi;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getTork() {
        return tork;
    }

    public void setTork(int tork) {
        this.tork = tork;
    }

    public String getSanziman() {
        return sanziman;
    }

    public void setSanziman(String sanziman) {
        this.sanziman = sanziman;
    }

    public double getHizlanma() {
        return hizlanma;
    }

    public void setHizlanma(double hizlanma) {
        this.hizlanma = hizlanma;
    }

    public int getAzamiSurat() {
        return azamiSurat;
    }

    public void setAzamiSurat(int azamiSurat) {
        this.azamiSurat = azamiSurat;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getNetAgirlik() {
        return netAgirlik;
    }

    public void setNetAgirlik(int netAgirlik) {
        this.netAgirlik = netAgirlik;
    }

    public int getBagajHacmi() {
        return bagajHacmi;
    }

    public void setBagajHacmi(int bagajHacmi) {
        this.bagajHacmi = bagajHacmi;
    }

    public String getLastikOlculeri() {
        return lastikOlculeri;
    }

    public void setLastikOlculeri(String lastikOlculeri) {
        this.lastikOlculeri = lastikOlculeri;
    }
}
