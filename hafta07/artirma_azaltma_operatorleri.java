package hafta07;

public class artirma_azaltma_operatorleri {
    public static void main(String[] args) {
        int a = 5;
        a++;
        System.out.println(a++); //a'yı yazdırır 6, sonra bir ekler
        //terminalde 6 görürüz fakat RAM üzerinde değer 7 dir.
        System.out.println(a); //Ram üzerinde 7

        System.out.println(++a); //önce artırır sonra yazar

        System.out.println(a+=1); //a++

        System.out.println(a--);
        a--;
        System.out.println(a);

    }
}
