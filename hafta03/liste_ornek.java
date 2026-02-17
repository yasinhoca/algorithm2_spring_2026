package hafta03;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class liste_ornek {
    public static void main(String[] args) {
        //0 ile 10000 arasında rastgele 20 sayıdan oluşan bir liste üretiniz.
        //Bu listenin en küçük ve en büyük sayısını bulunuz
        //Bu listede bulunan en büyük ve en küçük sayının farkını bulunuz
        //Bu listede bulunan çift ve tek sayıları iki ayrı listeye ayırınız


        ArrayList<Integer> liste = new ArrayList<>();
        Random r = new Random();
        ArrayList<Integer> tekler = new ArrayList<>();
        ArrayList<Integer> ciftler = new ArrayList<>();


        for(int i = 0;i<20;i++) liste.add(r.nextInt(10000));

        System.out.println(liste);

        Collections.sort(liste);
        System.out.println(liste);
        System.out.println("En küçük = "+liste.get(0));
        System.out.println("En büyük = "+liste.get(liste.size()-1));

        System.out.println("Fark = " + ((liste.get(liste.size()-1))-liste.get(0)));


        for(int i=0;i<liste.size();i++){
            if(liste.get(i)%2==0) ciftler.add(liste.get(i)); else tekler.add(liste.get(i));
        }

        System.out.println(ciftler);
        System.out.println(tekler);


    }
}
