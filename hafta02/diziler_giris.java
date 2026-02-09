package hafta02;

import java.util.Random;

public class diziler_giris {
    public static void main(String[] args) {
        //diziler(arrays) primitive veri kümeleridir. Listeler ise sınıf tipi gelişmiş türlerdir.
        int[] dizi = new int[10];
        Random r = new Random();



        for(int i =0;i<10;i++){
            dizi[i] = r.nextInt(100);
            System.out.print(dizi[i]+" - ");
        }

        System.out.println();
        System.out.println(dizi[0]);
        System.out.println(dizi[9]);
        System.out.println(dizi[5]);

        String[] meyveler = {"elma","armut","çilek","ananas","portakal","2"};
        System.out.println(meyveler.length); //dizinin uzunluğu/ eleman sayısı
        System.out.println(meyveler[3]);
        System.out.println(meyveler[0].charAt(3));
        //System.out.println(meyveler[2].charAt(5)); //taşma hatası
        System.out.println(meyveler[Integer.parseInt(meyveler[5])]);

    }
}
