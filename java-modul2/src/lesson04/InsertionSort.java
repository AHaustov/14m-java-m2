package lesson04;

import java.util.Arrays;

public class InsertionSort {
    // int[] arr = { 5, 17, 4, 30, 6};
    // 17
    // {5 , 17 , 4, 30, 6}
    //4
    // [4,5,17,30, 6]
    // 30
    // [4,5,17,30, 6]
    // 6
    // [4,5, 6, 17,30]

    public static void main(String[] args) {
        System.out.println("Сортировка массивов с помощью 'Сортировка вставками'");
        int[] array = {22, 100, 55, 38, 88, 7};
        System.out.println(Arrays.toString(array));
        insertionSortImperative(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSortImperative(int[] arr) {
        for (int i = 1; i < arr.length; i++) {  // НОЛЕВОЙ элемент отсортирован, мы начинаем с первого
            int bookToProof = arr[i]; // временная переменная, которая хранит значение ОТ i
            int indexOF = i - 1; // цикл начался не с нОля.
            while (indexOF >= 0 && arr[indexOF] > bookToProof) {
                arr[indexOF + 1] = arr[indexOF];
                // поставили дубликат книги слева
                indexOF = indexOF - 1;
            }
            arr[indexOF + 1] = bookToProof;
        }
    }
}
