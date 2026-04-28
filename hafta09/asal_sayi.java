package hafta09;

import java.util.ArrayList;
import java.util.Random;

public class asal_sayi {

    static boolean asalMi(int a){
        int bolen_sayac=0;
        for(int i=2;i<a;i++){
            if(a%i==0) bolen_sayac++;
        }
        if (bolen_sayac>0) return false; else return true;
    }



    static void main() {
        Random r = new Random();
        ArrayList<Integer> asalListe = new ArrayList<>();
        int sayac =0;
        int deneme = 0;
        while(sayac<20){
            int sayi = r.nextInt(10000);
            deneme++;
            System.out.println(deneme+". deneme üretilen sayı =" + sayi);
            if(asalMi(sayi)){
                asalListe.add(sayi);
                sayac++;
            }
        }

        System.out.println(asalListe);
    }
}
