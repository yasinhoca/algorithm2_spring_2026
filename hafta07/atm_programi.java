package hafta07;

import java.util.Scanner;

public class atm_programi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Miktarı giriniz:");
            int miktar = scan.nextInt();


            if(miktar%50==0 && miktar<=10000){
                if(miktar>=200){
                    int k = miktar - (miktar%200);
                    System.out.println(k/200 + " adet 200lük banknot");
                    miktar = miktar - k;
                }
                if(miktar>=100){
                    int k = miktar - (miktar%100);
                    System.out.println(k/100 + " adet 100lük banknot");
                    miktar = miktar - k;
                }
                if(miktar==50){
                    int k = miktar - (miktar%50);
                    System.out.println(k/50 + " adet 50lük banknot");
                    miktar = miktar - k;
                }
                break;
            } else {
                System.out.println("Lütfen 50'nin katlar ve 10000 tl altında giriniz!");
            }
        }
    }
}
