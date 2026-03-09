package hafta06;

public class harici_sinifi_cagiralim {
    public static void main(String[] args) {
        Cokgen cokgen = new Cokgen();
        System.out.println(cokgen.ucgenCevre(3,4,5));
        System.out.println(cokgen.ucgenAlan(3,4));
        System.out.println(cokgen.kareCevre(5));
        System.out.println(cokgen.kareAlan(5));
        System.out.println(cokgen.ucgenAlan()); //varsayılan 4 ve 5 değerine göre hesaplandı


        cokgen.tabanYukseklikAta(10,12);
        System.out.println(cokgen.ucgenAlan());

        System.out.println(cokgen.cokgenIcAciHesaplama(3));
        System.out.println(cokgen.cokgenIcAciHesaplama(4));
        System.out.println(cokgen.cokgenIcAciHesaplama(5));
        System.out.println(cokgen.cokgenIcAciHesaplama(6));
    }
}
