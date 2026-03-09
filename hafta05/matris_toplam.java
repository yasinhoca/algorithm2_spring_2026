package hafta05;

import java.util.Random;

public class matris_toplam {

    static int[][] matrisUret(int boyut){
        int[][] m = new int[boyut][boyut];
        int i,j;
        Random r = new Random();

        for(i=0;i<boyut;i++){
            for(j=0;j<boyut;j++){
                m[i][j] = r.nextInt(5);
            }
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

    static int[][] matrisTopla(int[][] m1, int[][] m2, int boyut){
        int[][] mt = new int[boyut][boyut];
        int i,j;
        for(i=0;i<boyut;i++){
            for(j=0;j<boyut;j++){
                mt[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return mt;
    }



    public static void main(String[] args) {
        int[][] m1 = matrisUret(5);
        System.out.println("---m1---");
        matrisYaz(m1,5);

        int[][] m2 = matrisUret(5);
        System.out.println("---m2---");
        matrisYaz(m2,5);

        int[][] mt = matrisTopla(m1,m2,5);
        System.out.println("---mToplam---");
        matrisYaz(mt,5);



    }
}
