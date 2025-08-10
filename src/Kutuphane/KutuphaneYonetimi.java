package Kutuphane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KutuphaneYonetimi {
    private final int Id;
    private String kitapAd;
    private String yazar;
    private int adet;
    private static List<KutuphaneYonetimi> kutuphane = new ArrayList<>();

    private static int sayac=1;

    public KutuphaneYonetimi() {
        Id = sayac++;
    }

    public KutuphaneYonetimi(String kitapAd, String yazar, int adet) {
        setKitapAd(kitapAd);
        setYazar(yazar);
        Id = sayac++;
        setAdet(adet);
    }

    public  void kitapEkle(KutuphaneYonetimi k) {
        boolean deger = false;
        for (int i = 0; i < kutuphane.size(); i++) {
            if (kutuphane.get(i).getKitapAd().equals(k.getKitapAd())&&
            kutuphane.get(i).getYazar().equals(k.getYazar())){
                int sayi = kutuphane.get(i).getAdet();
                sayi++;
                kutuphane.get(i).setAdet(sayi);
                deger=true;
                break;
            }
        }
        if (!deger){
            kutuphane.add(k);
        }
        System.out.println("Kitap Eklendi.");
    }

    public  void kitapListele(){
        for (int i = 0; i < kutuphane.size(); i++) {
            System.out.println(kutuphane.get(i));
        }
    }

    public  void kitapAl(KutuphaneYonetimi k){
        for (int i = 0; i < kutuphane.size(); i++) {
            if (kutuphane.get(i).getKitapAd().equals(k.getKitapAd()) &&
                    kutuphane.get(i).getYazar().equals( k.getYazar())){
                if (kutuphane.get(i).getAdet()!=0){
                int sayi =kutuphane.get(i).getAdet();
                sayi--;
                kutuphane.get(i).setAdet(sayi);}
                else {
                    kutuphane.remove(i);
                }

            }
        }
    }

    public  void kitapIadeEt(KutuphaneYonetimi k){
        boolean bulundu = false;

        for (int i = 0; i < kutuphane.size(); i++) {
            if (kutuphane.get(i).getKitapAd().equals(k.getKitapAd()) &&
                    kutuphane.get(i).getYazar().equals(k.getYazar())){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KutuphaneYonetimi that = (KutuphaneYonetimi) o;
        return Objects.equals(kitapAd, that.kitapAd) &&
                Objects.equals(yazar, that.yazar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kitapAd, yazar);
    }


}
