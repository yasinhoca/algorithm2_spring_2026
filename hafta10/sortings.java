package hafta10;

import java.util.Arrays;

public class sortings {

    public static void selectionSort(int[] arr) {
         int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // En küçük elemanın indeksini bul
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap = Bulunan en küçük elemanı mevcut elemanla takas et
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Eğer soldaki sağdakinden büyükse yer değiştir
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Diziyi böl ve pivotun indeksini al
            int pi = partition(arr, low, high);

            // Pivotun solunu ve sağını ayrı ayrı sırala
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot olarak son elemanı seçtik
        int i = (low - 1); // Küçük elemanların yerleşeceği indeks

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Elemanları takas et
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Pivotu doğru konuma (i+1) yerleştir
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] dizi = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Orijinal Dizi: " + Arrays.toString(dizi));

        // Hangi algoritmayı test etmek istiyorsan onu çağır:
        //bubbleSort(dizi);
        //selectionSort(dizi);
        quickSort(dizi, 0, dizi.length - 1);

        System.out.println("Sıralanmış Dizi: " + Arrays.toString(dizi));
    }


}
