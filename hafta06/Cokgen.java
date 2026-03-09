package hafta06;

public class Cokgen {
    int yukseklik = 5;
    int taban = 4;
    int ucgenCevre(int a,int b,int c){
        return a+b+c;
    }

    float ucgenAlan(int yukseklik,int taban){
        return (float) yukseklik*taban/2;
    }

    float ucgenAlan(){ //aynı isimli farklı giriş parametreli istediğimiz kadar method tanımlayabiliriz
        //Bu olaya "method overloading"  methodlarda aşırı yükleme denir
        return (float) this.yukseklik*this.taban/2; //burada sınıf içi taban ve yukseklik kullanılır
    }

    int kareCevre(int a) {
        return 4*a;
    }

    int kareAlan(int a){
        return a*a;
    }

    void tabanYukseklikAta(int taban, int yukseklik){
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    int cokgenIcAciHesaplama(int kenarSayisi){
        if(kenarSayisi<3){
            return 0;
        } else if (kenarSayisi==3) {
            return 180;
        } else if (kenarSayisi==4) {
            return 360;
        } else {
            return (kenarSayisi*180)-360;
        }


    }

}
