package lesson02;

import java.util.Arrays;

public class Exercise19 {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(evenOdd(1, 0, 1, 0, 0, 1, 1)));
        //System.out.println(Arrays.toString(evenOdd(3, 3, 2)));// → [2, 3, 3]
        // System.out.println(Arrays.toString(evenOdd(2, 2, 2)));// → [2, 2, 2]
        //System.out.println(Arrays.toString(zeroFront(1, 0, 0, 1)));// → [0, 0, 1, 1]
        //System.out.println(Arrays.toString(zeroFront(0, 1, 1, 0, 1)));// → [0, 0, 1, 1, 1]
        //System.out.println(Arrays.toString(zeroFront(1, 0)));// → [0, 1]
        System.out.println(Arrays.toString(pre4(1, 2, 4, 1)));// → [1, 2]
        System.out.println(Arrays.toString(pre4(3, 1, 4)));// → [3, 1]
        System.out.println(Arrays.toString(pre4(1, 4, 4)));// → [1]
    }

    public static int[] pre4(int... args) {
        int size = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 4) {
                size = i;
                break;
            }
        }
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = args[i];
        }
        return output;
    }

    public static int[] zeroFront(int... args) {
        int[] output = new int[args.length];
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 0) {
                output[count] = args[i];
                count++;
            }
        }
        for (int i = 0; i < args.length; i++) {
            if (args[i] != 0) {
                output[count] = args[i];
                count++;
            }
        }
        return output;
    }

    public static int[] evenOdd(int... args) {
        int[] output = new int[args.length];
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] % 2 == 0) {
                output[count] = args[i];
                count++;
            }
        }
        for (int i = 0; i < args.length; i++) {
            if (args[i] % 2 != 0) {
                output[count] = args[i];
                count++;
            }
        }
        return output;
    }
}