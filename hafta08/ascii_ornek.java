package hafta08;

import java.util.Random;
import java.util.Scanner;

public class ascii_ornek {




    static String asciiUret(int uzunluk){
        String uretilen="";
        Random r = new Random();
        for(int i=0;i<uzunluk;i++){
            int s = r.nextInt(26)+65;
            uretilen += (char) s;
        }
        return uretilen;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi büyük harflerle Türkçe karakter kullanmadan giriniz");
        String isim = scan.next();
        int uzunluk = isim.length();
        int sayac=0;
        while(true){
            String u = asciiUret(uzunluk);
            sayac++;
            System.out.println(sayac + ". deneme = " + u);
            if(u.equals(isim)){
                System.out.println("Girilen isim bulundu!");
                break;
            }
        }
    }

}
