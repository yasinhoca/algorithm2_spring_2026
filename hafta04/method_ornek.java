package hafta04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class method_ornek {
    //listeyi istenen aralıkta, istenen sayıda rastgele sayılarla dolduran method
    static Random r = new Random();

    static ArrayList randomListe(int a, int u, int s){
        ArrayList<Integer> liste = new ArrayList<>();

        for(int i=0;i<s;i++) {
            int rast = r.nextInt(u-a)+a;
            liste.add(rast);
        }

        return liste;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Randam alt limiti gir : ");
        int a = scan.nextInt();
        System.out.println("Randam ust limiti gir : ");
        int u = scan.nextInt();
        System.out.println("Kaç adet sayı olsun : ");
        int s = scan.nextInt();

        ArrayList<Integer> liste = randomListe(a,u,s);
        System.out.println(liste);


    }
}
