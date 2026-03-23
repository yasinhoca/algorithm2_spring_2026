package hafta07;

import java.util.Random;

public class ascii_kullanim {
    public static void main(String[] args) {
        System.out.println((char) 65);
        System.out.println((int) 'A');

        //Büyük küçük ve sayısal kodlardan oluşan 32 karakterli random bir hash kodu üretelim
        Random r = new Random();
        String hash = "";

        for(int i = 0 ; i<32;i++){
            int tur = r.nextInt(3);
            if(tur==0){
                int c = r.nextInt(26)+65;
                hash+=(char) c;
            } else if(tur==1){
                int c = r.nextInt(26)+97;
                hash+=(char) c;
            } else{
                int c = r.nextInt(10);
                hash+= Integer.toString(c);
            }
        }

        System.out.println(hash);


    }
}
