package de.andron13;

public class MyMath {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int... args) {
        int sum = 0;
        for (int element : args) {
            sum += element;
        }
        return sum;
    }
}
