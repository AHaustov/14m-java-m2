package lesson09;

import java.time.LocalDateTime;

public class Lesson09 {
    public static void main(String[] args) {
/*       int[] arr = new int[5];
        int element = arr[5];*/
        //testArr();
        //int a = 5/0;
        // ArithmeticException
        //tryArithmetic();
        tryParse();
        // NumberFormatException
    }

    private static void tryParse() {

        try {
            String s1 = "2020";
            String s2 = "2020год";
            int output1 = Integer.parseInt(s1);
            int output2 = Integer.parseInt(s2);
            System.out.println("Пробуем");
            int[] array = new int[5];
            int element = array[5];
        } catch (NumberFormatException ex1) {
            System.out.println("Ловим " + ex1.toString());
        } catch (ArithmeticException ex2) {
            System.out.println("Ловим не переловим");
        } finally {
            System.out.println("Всё равно работаем");
        }
        System.out.println("Следующая часть программы "
                + LocalDateTime.now()
        );
    }

    private static void tryArithmetic() {
        try {
            int a = 5 / 0;
            System.out.println("Часть метода с ошибкой");
            String s = "34";
        } catch (ArithmeticException ex) {
            System.out.println("ошибка деления на ноль " + ex.toString());
        } finally {
            System.out.println("Шеф всё пропало, немедленно посмотри");
        }
        System.out.println("Выполнение последней строки");
    }

    private static void testArr() {
        int[] array = new int[5];
        try {
            int element = array[5];
            // маловероятно, что получится
            System.out.println("напечатай мне что-нибудь");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Поймали" + exception.toString());
        }
        System.out.println("Программа отработана");
    }
}
