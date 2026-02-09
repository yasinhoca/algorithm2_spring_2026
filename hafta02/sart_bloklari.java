package hafta02;

import java.util.Scanner;

public class sart_bloklari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Lütfen sıfır ile yüz arasında bir sayı giriniz:");
            int sayi = scan.nextInt();
            if (sayi <= 100 && sayi >= 0) {
                System.out.println("Girilen sayi geçerli!");
                break;
            } else if (sayi > 100) {
                System.out.println("Girilen sayi yüzden küçük olmalı");
            } else if (sayi < 0) {
                System.out.println("Girilen sayi sıfırdan büyük olmalı");
            }
        }

    }
}
