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

    public void hesapAc(Musteri m, int Bakiye) {
        if (!musteriListesi.contains(m)) {
            musteriListesi.add(m);
        }
        m.hesapAc(Bakiye);

    }

    public void paraYatir(Musteri m, int hesapNo, double miktar) {
        boolean deger1 = false;
        boolean deger2 = false;
        for (int i = 0; i < musteriListesi.size(); i++) {
            if (musteriListesi.get(i).equals(m)) {
                deger2 = true;
                for (int j = 0; j < m.hesapListesi.size(); j++) {
                    if (m.hesapListesi.get(j).getHesapNo() == hesapNo) {
                        deger1 = true;
                        m.hesapListesi.get(j).paraYatir(miktar);
                        break;
                    }

                }
                if (deger1 == false) {
                    System.out.println("Hesap Numarası Yanlış.");
                }

            }
        }
        if (deger2 == false) {
            System.out.println("Sistemde Böyle bir Musteri Bulunamadı.");
        }
    }

    public void paraCek(Musteri m, int hesapNo, double miktar) {
        boolean deger1 = false;
        boolean deger2 = false;
        for (int i = 0; i < musteriListesi.size(); i++) {
            if (musteriListesi.get(i).equals(m)) {
                deger2 = true;
                for (int j = 0; j < m.hesapListesi.size(); j++) {
                    if (m.hesapListesi.get(j).getHesapNo() == hesapNo) {
                        deger1 = true;
                        m.hesapListesi.get(j).paraCek(miktar);
                        break;
                    }
                }
                if (deger1 == false) {
                    System.out.println("Hesap Numarası Yanlış.");
                }
            }
        }
        if (deger2 == false) {
            System.out.println("Sistemde Böyle bir Musteri Bulunamadı.");
        }

    }


    public void baskaKisiyeTransfer(int gonderenHesap, int alanHesap, double miktar) {
        boolean deger1 = false;
        boolean deger2 = false;
        for (int i = 0; i < musteriListesi.size(); i++) {
            for (int j = 0; j < musteriListesi.get(i).hesapListesi.size(); j++) {
                if (musteriListesi.get(i).hesapListesi.get(j).getHesapNo() == gonderenHesap) {
                    deger2 = true;
                    if (miktar > musteriListesi.get(i).hesapListesi.get(j).getBakiye()) {
                        for (int k = 0; k < musteriListesi.size(); k++) {
                            for (int l = 0; l < musteriListesi.get(k).hesapListesi.size(); l++) {
                                if (musteriListesi.get(k).hesapListesi.get(l).getHesapNo() == alanHesap) {
                                    musteriListesi.get(i).hesapListesi.get(j).paraCek(miktar);
                                    musteriListesi.get(k).hesapListesi.get(l).paraYatir(miktar);
                                    System.out.println(musteriListesi.get(i).hesapListesi.get(j).getHesapNo() + " Hesabınızdan "
                                            + musteriListesi.get(i).getAd() + " Adındaki Kişinin "
                                            + musteriListesi.get(k).hesapListesi.get(l).getHesapNo() +
                                            " Nolu Hesabına Para Transferi Gerçekleştirilmiştir.");
                                    deger1 = true;
                                    break;
                                }
                            }
                        }
                        if (deger1 == false) {
                            System.out.println("Alıcı Hesap Numarası Bulunamadı.");
                        }
                    } else {
                        System.out.println("Bakiyeniz Yetersiz.");
                    }
                }
            }
        }
        if (deger2 == false) {
            System.out.println("Gonderici Hesap Numarası Bulunamadı.");
        }


    }

    public void hesaplarArasiTransfer(int gonderenHesap, int alanHesap, double miktar) {
        boolean deger1 = false;
        boolean deger2 = false;
        for (int i = 0; i < musteriListesi.size(); i++) {
            for (int j = 0; j < musteriListesi.get(i).hesapListesi.size(); j++) {
                if (musteriListesi.get(i).hesapListesi.get(j).getHesapNo() == gonderenHesap) {
                    deger2 = true;
                    if (miktar > musteriListesi.get(i).hesapListesi.get(j).getBakiye()) {
                        for (int k = 0; k < musteriListesi.get(i).hesapListesi.size(); k++) {
                            if (musteriListesi.get(i).hesapListesi.get(k).getHesapNo() == alanHesap) {
                                musteriListesi.get(i).hesapListesi.get(j).paraCek(miktar);
                                musteriListesi.get(i).hesapListesi.get(k).paraYatir(miktar);
                                System.out.println(musteriListesi.get(i).hesapListesi.get(j) + " Nolu Hesabınızdan " +
                                        musteriListesi.get(i).hesapListesi.get(k) + " Nolu Hesabınıza Para Transferi Gerçekleşmiştir.");
                                deger1 = true;
                                break;
                            }
                        }
                        if (deger1 == false) {
                            System.out.println("Alıcı Hesap Numarası Bulunamadı.");
                        }
                    } else
                        System.out.println("Bakiyeniz Yetersiz.");
                }
            }
        }
        if (deger2 == false) {
            System.out.println("Gonderici Hesap Numarası Bulunamadı.");
        }
    }

}
