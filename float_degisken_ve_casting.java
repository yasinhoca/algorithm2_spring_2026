package hafta01;

public class float_degisken_ve_casting {
    public static void main(String[] args) {
        float s;
        //s = 3.14; //şeklinde tanımlayamayız
        //derleyici . işaretinin string olup olmadığını bilemez
        /*
        Dolayısı ile casting yapılmalıdır
        (float) yada sayısal ifadenin sonuna f yazılır
         */

        s = (float) 3.14;
        s = 1.618f;

        System.out.println(s);

        int a;

        //Tür dönüşümü
        a = (int) s;
        System.out.println(a);

        //Başka bir dönüşüm yöntemi
        String sayi = "34";
        a = Integer.parseInt(sayi);
        System.out.println(a);

        //sayi = "65";
        //a = (int) sayi; //uyumsuz tipler

        // ctrl + alt + l      => indent kod düzenleme kısayol tuşu

        char c = 'k';
        System.out.println(c);

        boolean durum = true;
        System.out.println(durum);

    }
}
