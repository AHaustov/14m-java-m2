package lesson09;

public class ClassWork09 {
    public static void main(String[] args) {
       /* int[] a1 = {1, 2, 4, 6};
        int[] a2 = {2, 4};
        int[] b1 = {1, 2, 4, 6};
        int[] b2 = {2, 3, 4};
        int[] c1 = {1, 2, 4, 4, 6};
        int[] c2 = {2, 4};
        int[] d1 = {1, 3, 5, 7, 9, 11};
        int[] d2 = {5, 7, 8, 11};
        System.out.println(linearIn(a1, a2));// → true
        System.out.println(linearIn(b1, b2));// → false
        System.out.println(linearIn(c1, c2));// → true
        System.out.println(linearIn(d1, d2));// → false*/
        System.out.println(maxMirror(1, 2, 3, 8, 9, 3, 2, 1));// → 3
        System.out.println(maxMirror(1, 2, 1, 4));// → 3
        System.out.println(maxMirror(7, 1, 2, 9, 7, 2, 1));// → 2
        System.out.println(maxMirror(7, 1, 2, 3, 9, 7, 2, 1, 3, 2, 1));// → 3
    }

    private static int maxMirror(int... args) {
        int[] reverse = makeArrayReverse(args);
        int maxSpan = 0;
        int span;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                span = 0;
                if (args[i] == reverse[j]) {
                    int kSize = Math.min(args.length - i, reverse.length - j);
                    for (int k = 0; k < kSize; k++) {
                        if (args[i + k] == reverse[j + k]) {
                            span++;
                        } else break;
                    }
                }
                maxSpan = Math.max(span, maxSpan);
            }
        }
        return maxSpan;
    }

    private static int[] makeArrayReverse(int[] args) {
        int size = args.length;
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = args[size - i - 1];
        }
        return output;
    }

    private static boolean linearIn(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (count == b.length) {
                break;
            }
            if (a[i] == b[0]) {
                count = 1;
                for (int j = 1; j < b.length; j++) {
                    if (b[j] == a[i + j]) {
                        count++;
                    }
                }
            }
        }
        return count == b.length;
    }
}
