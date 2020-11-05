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
        int[] array = {22, 100, 55, 38, 88, 7, -1, 1000, 0};
        System.out.println(Arrays.toString(array));
        insertionSortImperative(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) {  // НОЛЕВОЙ элемент отсортирован, мы начинаем с первого
            int newElement = input[i]; // временная переменная, которая хранит значение ОТ i
            int location = i - 1; // цикл начался не с нОля.
            while (location >= 0 && input[location] > newElement) {
                input[location + 1] = input[location];
                // поставили дубликат книги слева
                location = location - 1;
            }
            input[location + 1] = newElement;
        }
    }
}
