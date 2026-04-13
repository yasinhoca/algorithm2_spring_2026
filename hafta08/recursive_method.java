package hafta08;

public class recursive_method {
    //Recursive fonksiyonlar-methodlar
    //Özyinelemeli methodlar

    static int faktoriyel(int sayi){
        if(sayi==0 || sayi==1){
            return 1;
        }else return sayi*faktoriyel(sayi-1);
    }

    public static void main(String[] args) {
        System.out.println(faktoriyel(5));
        System.out.println(faktoriyel(8));
    }
}
