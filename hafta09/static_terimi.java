package hafta09;

import java.util.Map;

class Hesapla{
    static int topla(int a, int b){
        return a+b;
    }
}

public class static_terimi {
    static void main() {
        Hesapla h = new Hesapla();
        System.out.println(h.topla(5,8));
        Hesapla h2 = new Hesapla();
        System.out.println(h2.topla(7,9));

        Hesapla.topla(7,8); //static olduğu için nesne tanımlamadan çağırabiliriz

        Math.pow(2,4); //math sınıfı içindeki methodlar da static olduğu için direkt sınıf üzerinden çağrılabilir

    }
}
