package BankaHesapSistemi;

public class VadeliHesap extends Hesap {
    private double vadeSuresi;
    private final double faizOrani = 0.43;


    public VadeliHesap(double bakiye, double vadeSuresi) {
        super(bakiye);
        setVadeSuresi(vadeSuresi);
    }


    public double vadeliMevduat() {
        return getBakiye() * getFaizOrani() * (getVadeSuresi() / 36600);
    }


    public double getVadeSuresi() {
        return vadeSuresi;
    }

    public void setVadeSuresi(double vadeSuresi) {
        this.vadeSuresi = vadeSuresi;
    }

    public double getFaizOrani() {
        return faizOrani;
    }

    @Override
    public String toString() {
        return super.toString() + "Hesap Türü = Vadeli Hesap"
                +", Mevduat = "+ vadeliMevduat() + '}';
    }
}