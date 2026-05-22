import java.util.LinkedList;
import java.util.Arrays;

public class TugasQuickSort {
    public static LinkedList<Integer> quickSort(LinkedList<Integer> list) {
        //Base case: jika list kosong atau hanya punya 1 elemen, list sudah terurut
        if (list.size() <= 1) {
            return list;
        }

        //Ambil elemen pertama sebagai pivot dan hapus dari list aslinya
        int pivot = list.removeFirst();

        LinkedList<Integer> lebihKecil = new LinkedList<>();
        LinkedList<Integer> lebihBesar = new LinkedList<>();

        //Partisi sisa elemen ke dalam dua list
        while (!list.isEmpty()) {
            int current = list.removeFirst();
            if (current <= pivot) {
                lebihKecil.add(current);
            } else {
                lebihBesar.add(current);
            }
        }

        //rekursi untuk menyortir bagian kiri dan kanan
        lebihKecil = quickSort(lebihKecil);
        lebihBesar = quickSort(lebihBesar);

        //gabungkan hasil (merge)
        LinkedList<Integer> hasilSorted = new LinkedList<>();
        hasilSorted.addAll(lebihKecil);
        hasilSorted.add(pivot);
        hasilSorted.addAll(lebihBesar);

        return hasilSorted;
    }

    public static void main(String[] args) {
        //inisialisasi LinkedList dengan data tidak terurut
        LinkedList<Integer> dataUnsorted = new LinkedList<>(Arrays.asList(42, 17, 88, 5, 33, 33,91, 24, 60)); //minimal 8 data

        System.out.println("Data SEBELUM diurutkan:");
        System.out.println(dataUnsorted);

        //Proses Quick Sort
        LinkedList<Integer> dataSorted = quickSort(dataUnsorted);

        System.out.println("\nData SESUDAH diurutkan menggunakan Quick Sort: ");
        System.out.println(dataSorted);
    }
}    

