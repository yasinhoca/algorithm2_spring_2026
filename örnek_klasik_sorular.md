Bütünleme sınavına kod yazarak (ve anlayarak) çalışırsanız zorlanmazsınız. Sorular "ortalama bir öğrenci" için kolaylıkla yapılabilecek nitelikte olacaktır. Sınavda teorik bilgi, yorumlama, kod okuma/tamamlama, kod yazma soruları olacaktır. Aşağıda örnek sorular ve cevapları bulunmaktadır. Gerçek bir benchmark için soruları önce kendiniz cevaplayın sonra benim cavaplarıma bakın. (Örnek sorular sınavda çıkmayacaktır!.....)

Algoritma ve Programlama 2 Dersi Bütünleme Sınavı
1. Aşağıdaki soruları kısaca cevaplayınız. (30 Puan)
    a) Casting nedir?
    b) Kendi adınızı, değişken adı olarak kullanarak, float değişken tanımlayın ve içerisine 3.14 değerini atayınız?
    c) int sayi = (int) 3.99f; kodu çalışır mı? Çalışırsa sayi değişkeninin değeri ne olur?

2. Aşağıdaki kodu inceleyiniz ve soruları cevaplayınız? (40 Puan)

public static boolean ef(int sayi) {
    if (sayi % 2 == 0 && sayi>5) return true; else return false;
    }

a. Method ne yapmaktadır?
b. Dönüş tipi ve giriş tipi nedir?
c. ef() methodu main method içinden ef(8) olarak çağrılırsa ne return edilir?
d. if bloğu ->  if (sayi % 2 == 0 || sayi>5) şeklinde değiştirilirse ne olur açıklayınız? Sırası ile main method içerisinden ef(2), ef(3), ef(5) ve ef(7) sayıları çağrılırsa çıktılar ne olur

3. Kendisine gönderilen string ifadeyi tersten yazarak return eden methodu yazınız? (30 Puan)(class, main method bunları istemiyoruz sadece işlemi yapacak olan method yazılacak. Eğer sınav sorusunda main method lazımsa yalnızca main() {//kodlar} şeklinde yazmanız yeterlidir)

Süre 35 dakikadır. Başarılar.

CEVAPLAR
1. Sorunun cevapları:
a) Casting, bir veri tipini başka bir veri tipine dönüştürme işlemidir.Java’da veri tipleri arasında uyum sağlamak için kullanılır.
b) float yasin = 3.14f;  (Burada dikkat etmeniz gereken adınızda Türkçe karakter varsa, kullanmamanız gerekiyor, örnek olarak isminiz Gülçin ise float gulcin = (float) 3.14; şeklinde yazmalısınız. Float değişkenler de 3.14 sonuna f koyarak da casting yapılabilir.)
c) Çalışır, değer 3 olur. Float’tan int’e dönüşümde ondalık kısım atılır (kesilir). Yuvarlama yapılmaz.

2. Sorunun cevapları:
a) Kendisine gönderilen sayı 5'den büyük ve çift sayı ise true değilse false döndürmektedir.
b) Dönüş tipi boolean, giriş tipi integer'dır
c) True döndürür
d) Burada sayı çift veya beşten büyükse her zaman true döndürür. Şartlardan birinin sağlanması yeterlidir.
Sırası ile:
ef(2) -> true (çift şartı sağlanmış)
ef(3) -> false (çift şartı da 5'ten büyük olma şartı da sağalnmıyor)
ef(5) -> false ()
ef(7) -> true  döndürür.

3. Sorunun cevabı :
public static String tersCevir(String str) {     
    String ters = "";
   
    for (int i = str.length() - 1; i >= 0; i--) {
        ters += str.charAt(i);
    }
   
    return ters;
}


