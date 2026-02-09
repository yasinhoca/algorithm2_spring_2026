package hafta02;

import java.util.Random;

public class dizi_ornek_soru {
    public static void main(String[] args) {
        //0 ile 100 arasında 3'e veya 5'e tam bölünen sayılarla oluşturulmuş
        // 20 elemanlı bir dizi üretiniz.
        int[] dizi = new int[20];
        Random r = new Random();


        int sayac = 0;
        while(sayac<20){
            int s = r.nextInt(100);
            if(s%3==0 || s%5==0){
                dizi[sayac] = s;
                System.out.print(dizi[sayac]+" - ");
                sayac++;
            }
        }



    }
}
