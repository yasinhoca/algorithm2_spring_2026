package hafta05;

import java.util.Random;

public class cok_boyutlu_diziler {
    public static void main(String[] args) {
        int[][] matris = new int[3][3];

        Random r = new Random();

        int i,j;

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matris[i][j] = r.nextInt(10);
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
