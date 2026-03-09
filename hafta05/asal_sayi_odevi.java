package hafta05;

import java.util.ArrayList;
import java.util.Random;

public class asal_sayi_odevi {

    static boolean asalMi(int s){
        int bolenSayac = 0;
        for(int i=2;i<s/2;i++)
        {
            if(s%i==0) bolenSayac++;
        }
        if(bolenSayac==0) return true; else return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> asalSayilar = new ArrayList<>();
        Random r = new Random();
        int sayac=0;
        while(sayac<20){
            int s = r.nextInt(10000);
            //System.out.println(s);
            if(asalMi(s)) {
                asalSayilar.add(s);
                sayac++;
            }
        }

        System.out.println(asalSayilar);
    }

}
