package lesson07;

import java.util.Arrays;

public class HomeWork07 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4)));// → [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4, 4, 3, 1)));// → [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(3, 2, 2, 4)));// → [3, 4, 2, 2]
        System.out.println(Arrays.toString(fix34(1, 3, 2, 4, 4, 3, 1, 3, 1, 3, 4, 2, 2, 1, 3, 2, 4, 4, 3, 1, 4
        )));//
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4, 4, 3, 1, 3, 1, 2, 4, 2, 2, 1, 3, 2, 1, 4
        )));//
    }

    private static int[] fix34(int... arr) {
        int target = 4;
        int indexOfTarget;
        int indexOfBegin = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                indexOfTarget = findIndexOfTarget(arr, target, indexOfBegin);

                int temp = arr[indexOfTarget];
                arr[indexOfTarget] = arr[i + 1];
                arr[i + 1] = temp;

                indexOfBegin = i + 2;
            }
        }
        return arr;
    }

    public static int findIndexOfTarget(int[] arr, int target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) if (target == arr[i]) return i;
        return -1;
    }
}
