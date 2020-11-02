package day01;

public class Sum {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 20;
        int[] arr = {1, 2, 3, 4, 5};
        int result = sum(a, b);
        int result2 = sum(a, b, c);
        double d1 = 1.9;
        double d2 = 3.14;
        // один инт
        // один дабл
        // два инта
        // два дабла
        // один инт и один дабл.
        // один дабл и один инт
        // два дабла , 10 интов и 100 стрингов
        // три-пять параметра
        // три-пять методов перегружены
        // печать массивов с примитивами
// Сигнатура это название метода + принимаемые аргументы (и их порядок)

        int test = sum(d1, a);
        int test2 = sum(b, d2);
    }

    public static void sum() {

    }

    public static int sum(double d, int n) {
        return 10;
    }

    public static int sum(int n, double d) {
        return 10;
    }

    public static void sum(String s1, String s2, String s3) {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int... args) {
        int sum = 0;
        for (int element : args) {
            sum += element;
        }
        return sum;
    }
}
