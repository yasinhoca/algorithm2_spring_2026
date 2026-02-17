package hafta03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class listelere_giris {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        //Listeler de tutulan veri tipi int,float gibi primitive tip olamaz
        //Integer, Float, Character, Boolean şeklinde sınıf(reference) tip olmalıdır.


        // int  primitive
        // Integer reference
        // float primitive -> Float reference
        // char primitive -> Character reference
        // String ??

        liste.add(5);
        liste.add(12);
        liste.add(3);
        System.out.println(liste);

        liste.add(0,13);
        System.out.println(liste);

        liste.add(2,2);
        System.out.println(liste);

        //liste.add(7,0); //taşma hatası eklenecek indis daha oluşmamış
        //System.out.println(liste);

        int a = liste.get(4);
        System.out.println(a);

        liste.remove(3);
        System.out.println(liste);

        System.out.println(liste.size());

        liste.addAll(Arrays.asList(3,4,5,9));
        System.out.println(liste);

        Collections.sort(liste);
        System.out.println(liste);

        Collections.reverse(liste);
        System.out.println(liste);

        liste.clear();
        System.out.println(liste);

        //String liste initialize ile eleman yükleme
        ArrayList<String> isimler =
                new ArrayList<>(Arrays.asList("ali","zeynep","betül","cihan","elif"));
        System.out.println(isimler);

        isimler.add(2,"levent");
        System.out.println(isimler);

        System.out.println(isimler.get(5));
        System.out.println(isimler.get(3).charAt(3));
        //System.out.println(isimler.get(isimler.size())); //overflow taşma hatası
        System.out.println(isimler.get(isimler.size()-1));
        System.out.println(isimler.get(isimler.size()-isimler.size()));
        System.out.println(isimler.get(isimler.get(5).length()));

    }
}
