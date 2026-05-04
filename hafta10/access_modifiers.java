package hafta10;

public class access_modifiers {
    public static void main(String[] args) {
        hasta_bilgi hb = new hasta_bilgi();
        System.out.println(hb.ad);
        hb.ad = "Betül";
        System.out.println(hb.ad);
        System.out.println(hb.tel);
        hb.tel = "05556666666";
        System.out.println(hb.tel);
        //hb.tc_no="444444444";
        //getter ve setter ile okuma değiştirme işlemi yapabiliriz
        System.out.println(hb.getTc_no());
        hb.setTc_no("44444444444");
        System.out.println(hb.getTc_no());
        //no modifier değişken nesne içinden, aynı paketten ulaşılabilir
        System.out.println(hb.hasta_id);
    }
}
