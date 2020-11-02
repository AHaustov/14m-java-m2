package day01;

public class CrudArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 3, 1, 9, 7};
        printArr(arr1);

        double[] arr2 = new double[]{3.14, 5.34, 10.4, 15.8, 19.6};
        printArr(arr2);
    }

    public static void printArr() {
        System.out.println("Вы вызвали пустой метод");
    }
    public static void printArr(String[] str) {

    }
    public static void printArr(String[] input, int size) {

    }
    public static void printArr(double[] arr) {
        System.out.println("Вывод на экран double массива");
        for (double element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static void printArr(int[] arr) {
        System.out.println("Вывод на экран int массива");
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
