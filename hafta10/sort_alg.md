Sıralama algoritmaları, bilgisayar biliminde verileri belirli bir düzene (küçükten büyüğe veya tam tersi) sokmak için kullanılan temel araçlardır. Her birinin çalışma mantığı, verimliliği ve kullanım alanı farklıdır.

İşte en yaygın üç sıralama algoritmasının basitçe açıklaması:

---

## 1. Selection Sort (Seçerek Sıralama)
Bu algoritma, dizideki en küçük elemanı bulup onu en baştaki elemanla yer değiştirme mantığına dayanır.

*   **Nasıl Çalışır?**
    1. Dizi içinde gezerek en küçük elemanı bulur.
    2. Bu elemanı dizinin ilk sırasındaki elemanla takas eder.
    3. Bir sonraki adımda kalan elemanlar içinden en küçüğünü bulur ve ikinci sıraya yerleştirir.
    4. Dizi tamamen sıralanana kadar bu işlem devam eder.
*   **Özellikleri:** Basittir ancak çok büyük veri setlerinde yavaş kalır. Verimliliği genellikle düşüktür ($O(n^2)$ karmaşıklık).



---

## 2. Bubble Sort (Kabarcık Sıralaması)
Adını, büyük sayıların bir su kabarcığı gibi dizinin sonuna doğru "yükselmesinden" alır. En basit ama genellikle en verimsiz algoritmalardan biridir.

*   **Nasıl Çalışır?**
    1. Yan yana duran iki elemanı karşılaştırır.
    2. Eğer soldaki sağdakinden büyükse, bu ikisinin yerini değiştirir.
    3. Bu işlemi dizinin sonuna kadar tekrarlar. Bir tur bittiğinde en büyük eleman en sona ulaşmış olur.
    4. Dizi tamamen sıralanana kadar turlara devam eder.
*   **Özellikleri:** Anlaması çok kolaydır fakat işlem sayısı çok fazla olduğu için ($O(n^2)$ karmaşıklık) büyük listelerde tercih edilmez.



---

## 3. Quick Sort (Hızlı Sıralama)
Modern yazılımlarda en sık kullanılan, "parçala ve fethet" (divide and conquer) prensibiyle çalışan oldukça hızlı bir algoritmadır.

*   **Nasıl Çalışır?**
    1. Diziden bir eleman seçilir (buna **pivot** denir).
    2. Pivottan küçük olan tüm elemanlar sol tarafa, büyük olanlar ise sağ tarafa toplanır.
    3. Pivotun solundaki ve sağındaki küçük listeler için de aynı işlem (pivot seçme ve ayırma) tekrar edilir.
    4. Bu alt listeler tek bir elemana düşene kadar süreç devam eder ve sonunda birleşerek sıralı diziyi oluşturur.
*   **Özellikleri:** Ortalama durumda çok hızlıdır ($O(n \log n)$ karmaşıklık). Bellek kullanımı açısından da verimlidir.



---

### Özet Karşılaştırma

| Algoritma | Mantık | Verimlilik (Ortalama) | En İyi Kullanım Alanı |
| :--- | :--- | :--- | :--- |
| **Selection** | En küçüğü bul, başa koy | Düşük | Çok küçük veri setleri |
| **Bubble** | Komşuları kıyasla, yer değiştir | En Düşük | Eğitim amaçlı, basit mantık |
| **Quick** | Pivot seç, ikiye böl | Yüksek | Büyük ve genel veri setleri |