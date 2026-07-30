package RandevuSistemi;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("***** Randevu Yönetim Sistemi *****");
        String menu = "1- Randevu Ekle\n2- Randevuları Listele\n3- Randevuları İptal Et\n4- RandevuGüncelle\n5- Çıkış";
        Scanner oku = new Scanner(System.in);
        Enum DA = null;
        ArrayList<Danisman> listDanisman = new ArrayList<>();

        do {
            System.out.println(menu);
            System.out.println();
            System.out.print("Yapmak İstediğiniz İşlemi Giriniz (1-5) : ");
            int secim = oku.nextInt();
            oku.nextLine();
            switch (secim) {
                case 1:
                    System.out.print("Adınız Soyadınız : ");
                    String ad = oku.nextLine();
                    System.out.print("Tarih (Gün.Ay.Yıl) : ");
                    String tarih = oku.nextLine();
                    System.out.print("Saat (17.00) : ");
                    String saat = oku.nextLine();
                    System.out.print("Danışman Adını Giriniz : ");
                    String danismanAdi = oku.nextLine();


                    switch (danismanAdi.toLowerCase()) {
                        case "faruk yazıcı":
                            DA = DanismanAdi.FarukYazici;
                            Danisman danisman = new Danisman(ad, tarih, saat, DA);
                            listDanisman.add(danisman);
                            if (listDanisman.contains(DA)) {
                                Danisman.randevular.put(DA, listDanisman);
                            }
                            break;
                        case "havva pervan":
                            DA = DanismanAdi.HavvaPervan;
                            danisman = new Danisman(ad, tarih, saat, DA);
                            listDanisman.add(danisman);
                            if (listDanisman.contains(DA)) {
                                Danisman.randevular.put(DA, listDanisman);
                            }
                            break;
                        case "onur kayıkçı":
                            DA = DanismanAdi.OnurKayikci;
                            danisman = new Danisman(ad, tarih, saat, DA);
                            listDanisman.add(danisman);
                            if (listDanisman.contains(DA)) {
                                Danisman.randevular.put(DA, listDanisman);
                            }
                            break;
                        case "görkem şengün":
                            DA = DanismanAdi.GorkemSengun;
                            danisman = new Danisman(ad, tarih, saat, DA);
                            listDanisman.add(danisman);
                            if (listDanisman.contains(DA)) {
                                Danisman.randevular.put(DA, listDanisman);
                            }
                            break;
                        default:
                            System.out.println("Böyle Bir Danışman Bulunmamaktadır.");
                            break;
                    }

                    break;
                case 2:
                    for (Map.Entry<Enum, List> randevuliste : Danisman.randevular.entrySet()) {
                        System.out.println(randevuliste.getKey() + " : " + randevuliste.getValue());
                    }
                    break;
                case 3:
                    System.out.print("Danışan Adı Giriniz: ");
                    String danAdi = oku.nextLine();
                    System.out.print("ID Numrarası: ");
                    int id = oku.nextInt();
                    oku.nextLine();
                    boolean deger1 = false;
                    boolean deger2 = false;
                    for (Enum e : Danisman.randevular.keySet()) {
                        if (e.equals(danAdi)) {
                            deger2 = true;
                            Iterator gosterge = Danisman.randevular.values().iterator();
                            while (gosterge.hasNext()) {
                                gosterge.next();
                                if (gosterge.equals(id)) {
                                    Danisman.randevular.remove(id);
                                    System.out.println("Müşteri Silindi.");
                                    deger1 = true;
                                }
                            }
                            if (!deger1) {
                                System.out.println("Müşteri ID sini Yanlış Girdiniz.");
                            }
                        }
                    }
                    if (!deger2) {
                        System.out.println("Danışman Bulunamadı.");
                    }
                    break;
                case 4:
                    System.out.print("Danışman Adı Giriniz: ");
                    danAdi = oku.nextLine();
                    System.out.print("Müşteri ID Giriniz: ");
                    id = oku.nextInt();
                    oku.nextLine();
                    System.out.print("Yeni Tarih Giriniz: ");
                    String yeniTarih = oku.nextLine();
                    System.out.print("Yeni Saat Giriniz: ");
                    String yeniSaat = oku.nextLine();

                    switch (danAdi.toLowerCase()) {
                        case "faruk yazıcı":
                            DA = DanismanAdi.FarukYazici;
                            break;
                        case "havva pervan":
                            DA = DanismanAdi.HavvaPervan;
                            break;
                        case "onur kayıkçı":
                            DA = DanismanAdi.OnurKayikci;
                            break;
                        case "görkem şengün":
                            DA = DanismanAdi.GorkemSengun;
                            break;
                    }



            }

        } while (true);
    }
}
