package hafta04;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci_ornek {
    // Fibonacci dizisini buralak bir listeye aktaralım
    // 0+1+1+2+3+5+8
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;


        ArrayList<Integer> fibo = new ArrayList<>();

        int i=0;

        fibo.add(a);
        fibo.add(b);

        for(i=0;i<20;i++){ //fibonun ilk 22 terimi
            c = a + b;
            fibo.add(c);
            a=b;
            b=c;
        }

        System.out.println(fibo);

        //kullanıcı eleman sayısını belirlesin
        Scanner scan =new Scanner(System.in);
        System.out.println("Fibo dizisi kaç elemanlı olsun=");
        int eleman = scan.nextInt();
        a = 0; b = 1; c = 0;
        fibo.clear();
        fibo.add(a);
        fibo.add(b);

        for(i=0;i<eleman-2;i++){ //
            c = a + b;
            fibo.add(c);
            a=b;
            b=c;
        }

        System.out.println(fibo);

        //fibo dizisinin eleamanlarının darkını bulduralım
        //kullanıcı iki indis değeri versin biz onların farkını bulalım
        System.out.println("Fibo büyük dizi eleamını gir=");
        int bde = scan.nextInt();
        System.out.println("Fibo küçük dizi eleamını gir=");
        int kde = scan.nextInt();
        a = 0; b = 1; c = 0;
        fibo.clear();
        fibo.add(a);
        fibo.add(b);

        for(i=0;i<bde-2;i++){ //
            c = a + b;
            fibo.add(c);
            a=b;
            b=c;
        }

        System.out.println(fibo);
        int fark = fibo.get(fibo.size()-1) - fibo.get(kde);
        System.out.println(fark);

        //10000 sayısı ile 100000 sayısı arasında bulunan fibo elemanlarını bulduralım
        a = 0; b = 1; c = 0;
        fibo.clear();


        while(true){
            c = a + b;
            if(c>10000 && c<100000) fibo.add(c);
            a=b;
            b=c;
            if(c>100000) break;
        }
        System.out.println(fibo);

    }

}
