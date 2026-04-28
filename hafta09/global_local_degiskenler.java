package hafta09;

public class global_local_degiskenler {
    static int a = 5; //global
    int ben_methodum(int a){
        return a + this.a;
    }

    void ben_methodum2(int a,int b){
        b = this.a;
        int toplam = a + this.a + b;
        System.out.println(toplam);
    }

    void ben_methodum3(){
        int a,b;
        a = b = 13;
        int toplam = ben_methodum(2)*a*b;
        System.out.println(toplam);
    }
    void main() {
       int a = 8; //local
        //System.out.println(a);
        //System.out.println(this.a);
        //ben_methodum(a);
        //ben_methodum2(10,15);
        ben_methodum3();
    }
}
