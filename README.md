# 🚀 Java Console Applications Portfolio & Projects

Bu depo (repository), Java (Core) dili ve Nesne Yönelimli Programlama (OOP) ilkeleri kullanılarak geliştirilmiş 7 farklı konsol tabanlı algoritma, veri yapısı ve sistem simülasyonu projesini içermektedir.

Proje mimarileri; katmanlı tasarım, kalıtım (inheritance), kapsülleme (encapsulation), koleksiyon mimarileri (`ArrayList`, `HashSet`, `HashMap`, `TreeMap`), enum yapıları ve hata yönetimi (try-catch) prensipleri üzerine kurgulanmıştır.

---

## 📌 Proje Modülleri ve İçerikler

### 1. 🏦 Banka Hesap Sistemi (`BankaHesapSistemi`)
* **Açıklama:** Müşteri ve hesap yönetiminin yapıldığı bankacılık otomasyon simülasyonudur.
* **Özellikler:** Müşteri ekleme/silme, vadeli/vadesiz hesap açma, bakiyeye para yatırma/çekme, hesaplar arası ve kişiler arası para transferi işlemleri yürütülmektedir.
* **Öne Çıkan Yapılar:** Kalıtım (`Hesap` -> `VadeliHesap`, `VadesizHesap`), `ArrayList`, faiz ve mevduat hesaplama algoritmaları.

### 2. 🛍️ Günlük Görev / Alışveriş Listesi (`GunlukGorevListesi`)
* **Açıklama:** Dinamik bir alışveriş ve görev takip uygulamasıdır.
* **Özellikler:** Listeye yeni ürün ekleme, mevcut ürünleri numaralandırarak listeleme ve listeden ürün silme adımları gerçekleştirilmektedir.
* **Öne Çıkan Yapılar:** `ArrayList<String>`, `Scanner` ve döngüsel menü kontrolü.

### 3. 🧮 Hesap Makinesi (`HesapMakinesi`)
* **Açıklama:** Temel aritmetik işlemleri ve hata kontrollerini kapsayan hesap makinesi uygulamasıdır.
* **Özellikler:** Toplama, çıkarma, çarpma ve bölme işlemleri dinamik olarak sunulmaktadır.
* **Öne Çıkan Yapılar:** `try-catch` blokları ile harf/hatalı veri girişi engellemesi ve sıfıra bölünme (Divide by Zero) kontrolü.

### 4. 🎓 Öğrenci Not Sistemi (`OgrenciNotSistemi`)
* **Açıklama:** Sınıf mevcuduna göre öğrencilerin vize/final notlarını ve harf ortalamalarını hesaplayan otomasyondur.
* **Özellikler:** Not ortalaması hesaplama, harf notu belirleme (AA, BA, FF vb.) ve başarı/kalma durumu analizi tablo formatında konsola basılmaktadır.
* **Öne Çıkan Yapılar:** İki boyutlu nesne dizileri (`Object[][]`), statik metodlar ve aralık bazlı not doğrulama algoritmaları.

### 5. 📅 Randevu Yönetim Sistemi (`RandevuSistemi`)
* **Açıklama:** Danışmanlar ve müşteriler arasında randevu oluşturma ve takip otomasyonudur.
* **Özellikler:** Danışman bazlı randevu oluşturma, randevu listeleme, güncelleme ve iptal/silme süreçleri yönetilmektedir.
* **Öne Çıkan Yapılar:** `Enum` (`DanismanAdi`), `HashMap<Enum, List>`, `Iterator` kullanımı.

### 6. 🎲 Sayı Tahmin Oyunu (`SayiTahminOyunu`)
* **Açıklama:** Rastgele üretilen sayıların dinamik ipuçlarıyla tahmin edildiği etkileşimli bir oyundur.
* **Özellikler:** 10 deneme hakkı üzerinden yönlendirme (daha büyük/küçük sayı giriniz) ve tur bitiminde yeniden oynama seçeneği sunulmaktadır.
* **Öne Çıkan Yapılar:** `Math.random()`, hak/sayaç mantığı ve istisna yönetimi.

### 7. 📦 Ürün Stok Takip Sistemi (`UrunStokTakipSistemi`)
* **Açıklama:** Envanterdeki ürünlerin kategorize edilmesini, stok ve finansal raporlamasını sağlayan gelişmiş stok sistemidir.
* **Özellikler:** Kategori bazlı (Gıda, Giyim, Elektronik vb.) ürün ekleme, fiyat/stok güncelleme, silme, katmanlı listeleme ve beklenen kazanç raporlama işlemleri sağlanmaktadır.
* **Öne Çıkan Yapılar:** `Enum` (`Kategori`), `Set<UrunData>`, `Map<Kategori, List<UrunData>>`, `TreeMap`, `equals` & `hashCode` konfigürasyonları.

---

## 📂 Depo Hiyerarşisi, Kurulum ve Teknolojiler

```text
# 1. Depoyu yerel makinenize klonlama komutu:
git clone [https://github.com/MuhammetYazici/Projeler.git](https://github.com/MuhammetYazici/Projeler.git)

# 2. Proje Dosya Yapısı (IDE üzerinden ilgili sınıfı çalıştırabilirsiniz):
Projeler/
└── src/
    ├── BankaHesapSistemi/
    │   ├── Banka.java
    │   ├── BankaMain.java
    │   ├── Hesap.java
    │   ├── Musteri.java
    │   ├── VadeliHesap.java
    │   └── VadesizHesap.java
    ├── GunlukGorevListesi/
    │   └── AlısverisListesi.java
    ├── HesapMakinesi/
    │   └── HesapMakinesi.java
    ├── OgrenciNotSistemi/
    │   └── OgrenciNotSistemi.java
    ├── RandevuSistemi/
    │   ├── Danisman.java
    │   ├── DanismanAdi.java
    │   └── Main.java
    ├── SayiTahminOyunu/
    │   └── SayiTahminOyunu.java
    └── UrunStokTakipSistemi/
        ├── Kategori.java
        ├── Main.java
        ├── UrunData.java
        ├── UrunIslemler.java
        └── UrunStokTakipSistemi.java

# 3. Kullanılan Teknolojiler ve Beceriler:
- Programlama Dili: Java (Core)
- OOP Prensipleri: Encapsulation, Inheritance, Polymorphism, Abstraction
- Veri Yapıları & Koleksiyonlar: ArrayList, HashSet, HashMap, TreeMap, Iterator
- Diğer Yapılar: Enum, Exception Handling (try-catch), Dynamic User Input (Scanner)
- Geliştirme Ortamı & Sürüm Kontrolü: JetBrains IntelliJ IDEA, Git, GitHub
