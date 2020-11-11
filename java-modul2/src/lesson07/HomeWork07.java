package lesson07;

import java.util.Arrays;

public class HomeWork07 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4)));// → [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4, 4, 3, 1)));// → [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(3, 2, 2, 4)));// → [3, 4, 2, 2]
    }

    private static int[] fix34(int... args) {
        int[] output = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            output[i] = args[i];
            if (args[i] == 3) {
                for (int j = args.length - 1; 0 < j; j--) {
                    if (args[j] == 4) {
                        int temp = args[i + 1];
                        output[i + 1] = args[j];
                        args[i + 1] = args[j];
                        args[j] = temp;
                        i++;
                        break;
                    }
                }
            }
        }
        return output;
    }
}
