package KutuphaneSistemi;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private final int Id;
    private String kitapAd;
    private String yazar;
    private int adet;
    private static List<Kutuphane> kutuphane = new ArrayList<>();

    private static int sayac=1;


    public Kutuphane(String kitapAd, String yazar, int adet) {
        setKitapAd(kitapAd);
        setYazar(yazar);
        Id = sayac++;
        setAdet(adet);
    }

    public static void kitapListele(){
        for (int i = 0; i < kutuphane.size(); i++) {
            System.out.println(kutuphane.get(i));
        }
    }

    public void kitapAl(Kutuphane k){
        for (int i = 0; i < kutuphane.size(); i++) {
            if (kutuphane.get(i).getKitapAd().equals(k.getKitapAd()) &&
                    kutuphane.get(i).getYazar().equals( k.getYazar())){
                int sayi =kutuphane.get(i).getAdet();
                sayi--;
                kutuphane.get(i).setAdet(sayi);
                if (kutuphane.get(i).getAdet()==0){
                    kutuphane.remove(i);
                }else continue;

            }
        }
    }

    public void kitapIadeEt(Kutuphane k){
        boolean bulundu = false;

        for (int i = 0; i < kutuphane.size(); i++) {
            if (kutuphane.get(i).getKitapAd().equals(k.getKitapAd()) &&
                    kutuphane.get(i).getKitapAd().equals(k.getKitapAd())){
                int sayi = kutuphane.get(i).getAdet();
                sayi++;
                kutuphane.get(i).setAdet(sayi);
                bulundu=true;
                break;
            }
        }
        if (!bulundu){
            kutuphane.add(k);
            k.setAdet(1);
        }
        System.out.println("Kitap iadesi alındı.");
    }

    public int getAdet() {
        return adet;
    }

    public List<Kutuphane> getList(){
        return this.kutuphane;
    }

    public static void setList(Kutuphane k){
        kutuphane.add(k);
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public String getKitapAd() {
        return kitapAd;
    }

    public void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }

    public int getId() {
        return Id;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }


    @Override
    public String toString() {
        return "Kutuphane{" +
                "Id=" + Id +
                ", kitapAd='" + kitapAd + '\'' +
                ", yazar='" + yazar + '\'' +
                ", Adet='" + adet + '\'' +
                '}';
    }
}
