package hafta08;

public class recursive_ornek {
    //İki sayı aralığındaki sayıları recursive olarak toplayalım
    static int ikiSayiAraligiTopla(int basla,int bitis){
        if(basla<bitis){
            return bitis+ikiSayiAraligiTopla(basla,bitis-1);
        } else {
            System.out.println("Girilen sayılar hatalı!");
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(ikiSayiAraligiTopla(100,1));
    }
}
