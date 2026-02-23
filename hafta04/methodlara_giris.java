package hafta04;

import java.util.ArrayList;

public class methodlara_giris {
    // methodlar = fonksiyonlar
    //static nesne üretmeden method çağırmayı sağlar
    static void yaz(){ //method değer döndürmeyecekse void yazılır, yaz() bu kısımda dışardan değer almıyor
        System.out.println("Ben method içinden yazdırıldım");
    }


    static void kup(int a){ // bu method değer alır ama döndürmez
        //System.out.println(Math.pow(a,3));
        System.out.println(a*a*a);
    }

    static int kuvvet(int s, int us){
        int sonuc=1;
        for(int i=0;i<us;i++) {
            sonuc*=s;
        }
        return sonuc;
    }

    static float pi() {
        return 3.14f;
    }



    public static void main(String[] args) {
        for(int i=0;i<100;i++) yaz();

        kup(5);

        System.out.println(kuvvet(2,5));

        System.out.println(pi());
        System.out.println(Math.PI);

    }
}
