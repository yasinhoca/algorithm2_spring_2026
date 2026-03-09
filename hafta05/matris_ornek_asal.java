package hafta05;

import java.util.Random;

public class matris_ornek_asal {
    //kullanıcının istediği boyutlarda
    // içi asal sayılarla doldurulmuş bir matris oluşturalım

    static boolean asalMi(int s){
        int bolenSayac = 0;
        if(s==0 || s==1) return false;
        else {
            for (int i = 2; i < s; i++) {
                if (s % i == 0) bolenSayac++;
            }
            if (bolenSayac == 0) return true;
            else return false;
        }
    }

    static int[][] asalMatrisUret(int boyut){
        int satir,sutun;
        int[][] m = new int[boyut][boyut];
        Random r =new Random();
        satir=0;
        while(satir<boyut){
            sutun = 0;
            while(sutun<boyut){
                int s = r.nextInt(9000)+1000;
                if(asalMi(s)) {
                    m[satir][sutun] = s;
                    sutun++;
                }
            }
            satir++;
        }

        return m;
    }


    static void matrisYaz(int[][] m,int boyut){
        int i,j;

        for(i=0;i<boyut;i++){
            for(j=0;j<boyut;j++){
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int[][] m = asalMatrisUret(5);
        matrisYaz(m,5);
    }
}
