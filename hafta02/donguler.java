package hafta02;

public class donguler {

    public static void main(String[] args) {
        int i;
        for(i=0;i<100;i++){
            System.out.println(i+". döngü adımı");
        }



        for(int j=0;j<200;j+=3) System.out.print(j + " - ");

        System.out.println("\n");
        for(i=200;i>0;i--) System.out.print(i + " - ");

        System.out.println("\n");
        for(i=500;i>50;i-=13) System.out.print(i + " - ");

        int sayac = 0;
        while (sayac<20){
            System.out.println(sayac);
            sayac++;
        }

        sayac = 0;
        while (1<2){
            System.out.println("döngü");
            sayac++;
            if(sayac==30) break;
        }

        //while(true) System.out.println("ben de sonsuz döngüyüm");

        sayac = 0;
        do {
            sayac++;
        } while(sayac<20);

    }

}
