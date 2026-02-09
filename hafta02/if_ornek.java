package hafta02;

import java.util.Scanner;

public class if_ornek {
    public static void main(String[] args) {
        //kullanıcıdan alınan 3 sayidan en büyüğünü bulmak
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("1. sayıyı giriniz:");
        a = scan.nextInt();

        System.out.println("2. sayıyı giriniz:");
        b = scan.nextInt();
        System.out.println("3. sayıyı giriniz:");
        c = scan.nextInt();

        if(a>=b && a>=c) System.out.println("En büyük sayı a =" + a);
        else if(b>=a && b>=c) System.out.println("En büyük sayı b =" +b );
        else System.out.println("En büyük sayı c =" + c);



    }
}
