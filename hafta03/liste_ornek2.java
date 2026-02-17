package hafta03;

import java.util.ArrayList;
import java.util.Random;

public class liste_ornek2 {
    public static void main(String[] args) {
        //0 ve 100 arasında random sayılardan ve 3'e bölünen sayılardan oluşan
        // 50 elemanlı bir liste üretiniz



        int sayac = 0;
        int rast=0;
        Random r = new Random();
        ArrayList<Integer> liste = new ArrayList<>();

        while(sayac<50){
            rast = r.nextInt(100);
            System.out.println(rast);
            if(rast%3==0) {
                System.out.println("burda listeye eklendi " + rast);
                liste.add(rast);
                sayac++;
            }
        }

        System.out.println(liste);






    }
}
