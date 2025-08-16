package BankaHesapSistemi;

public class VadesizHesap extends Hesap{
    public VadesizHesap(double bakiye) {
        super(bakiye);
    }

    @Override
    public String toString() {
        return super.toString()+"Hesap Türü = Vadesiz Hesap}";
    }
}