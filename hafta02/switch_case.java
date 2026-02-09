package hafta02;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        //haftanın günleri örneği
        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanın gününün indisini giriniz:");
        int indis = scan.nextInt();



        switch (indis){
            case 0:
                System.out.println("Pazartesi");
                break;
            case 1:
                System.out.println("Salı");
                break;
            case 2:
                System.out.println("Çarşamba");
                break;
            case 3:
                System.out.println("Perşembe");
                break;
            case 4:
                System.out.println("Cuma");
                break;
            case 5:
                System.out.println("Cumartesi");
                break;
            case 6:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz gün indisi");
                break;
        }

    }
}
