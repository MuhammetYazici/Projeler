package BankaHesapSistemi;

import java.util.ArrayList;

public class Banka {
    private ArrayList<Musteri> musteriListesi = new ArrayList<>();

    public void MusterileriGoster() {
        System.out.println("****** MÜŞTERİ LİSTESİ ******");
        for (int i = 0; i < musteriListesi.size(); i++) {
            System.out.println(musteriListesi.get(i));
        }
    }

    public void MusteriEkle(Musteri musteri) {
        musteriListesi.add(musteri);
        System.out.println("Müşteri Ekleme İşlemi Başarılı");
    }

    public void musteriSil(Musteri musteri) {
        musteriListesi.remove(musteri);
        System.out.println("Müşteri Silme İşlemi Başarılı");
    }

    public void hesapAc(Musteri m, Hesap h) {


    }

    public void paraYatir(Musteri m, int hesapNo, double miktar) {
        for (int i = 0; i < musteriListesi.size(); i++) {
            if (musteriListesi.get(i).equals(m)) {
                for (int j = 0; j < m.hesapListesi.size(); j++) {
                    if (m.hesapListesi.get(j).getHesapNo() == hesapNo) {
                        m.hesapListesi.get(j).paraYatir(miktar);
                        break;
                    } else {
                        System.out.println("Hesap Numarası Yanlış.");
                        break;
                    }
                }
            } else {
                System.out.println("Sistemde Böyle bir Musteri Bulunamadı.");
                break;
            }
        }
    }

    public void paraCek(Musteri m, int hesapNo, double miktar) {
        for (int i = 0; i < musteriListesi.size(); i++) {
            if (musteriListesi.get(i).equals(m)) {
                for (int j = 0; j < m.hesapListesi.size(); j++) {
                    if (m.hesapListesi.get(j).getHesapNo() == hesapNo) {
                        m.hesapListesi.get(j).paraCek(miktar);
                        break;
                    } else {
                        System.out.println("Hesap Numarası Yanlış.");
                        break;
                    }
                }
            } else {
                System.out.println("Sistemde Böyle bir Musteri Bulunamadı.");
                break;
            }
        }
    }

    public void baskaKisiyeTransfer(int gonderenHesap, int alanHesap, double miktar) {
        for (int i = 0; i < musteriListesi.size(); i++) {
            for (int j = 0; j < musteriListesi.get(i).hesapListesi.size(); j++) {
                if (musteriListesi.get(i).hesapListesi.get(j).getHesapNo() == gonderenHesap) {
                    musteriListesi.get(i).hesapListesi.get(j).paraCek(miktar);
                    for (int k = 0; k < musteriListesi.size(); k++) {
                        for (int l = 0; l < musteriListesi.get(l).hesapListesi.size(); l++) {
                            if (musteriListesi.get(k).hesapListesi.get(l).getHesapNo() == alanHesap) {
                                musteriListesi.get(k).hesapListesi.get(l).paraYatir(miktar);
                                break;
                            } else {
                                System.out.println("Gönderilecek Hesap Numarası Yanlış.");
                                musteriListesi.get(i).hesapListesi.get(j).paraYatir(miktar);
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Gönderici Hesap Numarası Yanlış.");
                    break;
                }
            }
        }
        System.out.println(gonderenHesap + " Hesabınından " + alanHesap + " Hesabına " + miktar + "TL Para Transferi Gerçekleştirildi");
    }

    public void hesaplarArasiTransfer(int gonderenHesap, int alanHesap, double miktar) {
        for (int i = 0; i < musteriListesi.size(); i++) {
            for (int j = 0; j < musteriListesi.get(i).hesapListesi.size(); j++) {
                if (musteriListesi.get(i).hesapListesi.get(j).getHesapNo() == gonderenHesap) {
                    musteriListesi.get(i).hesapListesi.get(j).paraCek(miktar);
                    for (int k = 0; k < musteriListesi.get(i).hesapListesi.size(); k++) {
                        if (musteriListesi.get(i).hesapListesi.get(k).getHesapNo() == alanHesap) {
                            musteriListesi.get(i).hesapListesi.get(k).paraYatir(miktar);
                            break;
                        } else {
                            System.out.println("Gönderilecek Hesap Numarası Yanlış.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Gönderici Hesap Numarası Yanlış.");
                    musteriListesi.get(i).hesapListesi.get(j).paraYatir(miktar);
                    break;
                }
            }
        }
        System.out.println(gonderenHesap + " Hesabınından " + alanHesap + " Hesabına " + miktar + "TL Para Transferi Gerçekleştirildi");
    }
}
