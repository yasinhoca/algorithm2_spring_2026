package hafta06;

import java.util.ArrayList;

class Ogrenciler{ //sınıflar aynı java dosyalarına yazılabilir veya farklı java dosyalarına yazılabilir
    int tc;    //class içinde yazılan değişkenler global değişkendir
    String ad;
    String soyad;
    int ogrenciNo;
    String email;
    boolean cinsiyet;

    void yazdir(int id){
        System.out.println("ID :"+id);
        System.out.println("TC :" + this.tc);
        System.out.println("Ad :" + this.ad);
        System.out.println("Soyad :" + this.soyad);
        System.out.println("Öğrenci numarası :" + this.ogrenciNo);
    }

}

public class classlara_giris {
    public static void main(String[] args) {
        Ogrenciler ogrenci = new Ogrenciler();
        ogrenci.tc = 22222220;
        ogrenci.ad = "Samet";
        ogrenci.soyad = "Gündoğar";
        ogrenci.ogrenciNo = 10;
        ogrenci.email = "s@s.com";
        ogrenci.cinsiyet = true;
        System.out.println(ogrenci.ad +" " + ogrenci.soyad);
        ogrenci.yazdir(1);

        Ogrenciler ogrenci2 = new Ogrenciler();
        System.out.println(ogrenci2.ad); //şu an ogrenci2 ad değişkenine değer atanmadığı için null değeri döndürür
        ogrenci2.ad = "Berat";
        System.out.println(ogrenci2.ad);

        //1000 tane öğrenci için 1000 değişken mi tanımlanmalı?
        //ArrayList<Ogrenciler> ogrencilerListesi = new ArrayList<>();
        //ogrencilerListesi.get(0).ad;
    }
}
