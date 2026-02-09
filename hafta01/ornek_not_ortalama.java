package hafta01;

import java.util.Scanner;

public class ornek_not_ortalama {
    public static void main(String[] args) {
        int vize, odev, fin;   //final reserved word olduğu için değişken olarak kullanılamaz
        Scanner scan = new Scanner(System.in);


        System.out.println("Vize notunu giriniz :");
        vize = scan.nextInt();
        System.out.println("Ödev notunu giriniz :");
        odev = scan.nextInt();
        System.out.println("Final notunu giriniz :");
        fin = scan.nextInt();

        float ort;

        ort = (float) ((vize*0.375) + (float)(odev*0.125)+ (float)(fin*0.5));
        System.out.println("Ortalama = " + ort);

        if(ort>=90 && ort<=100) {
            System.out.println("AA");
        } else if(ort>=85 && ort<90){
            System.out.println("BA");
        } else if(ort>=75 && ort<85){
            System.out.println("BB");
        } else if(ort>=70 && ort<75){
            System.out.println("CB");
        } else if(ort>=60 && ort<70){
            System.out.println("CC");
        } else if(ort>=55 && ort<60){
            System.out.println("DC");
        } else if(ort>=0 && ort<55){
            System.out.println("FF");
        }


    }
}
