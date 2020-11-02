package day01.hw01anton;

//Create methods for arrays[] with primitive dataTypes:
//int, double, byte, char, long
//print, create, add element, delete element, update element
//use overloading

public class Arrays {
    public static void main(String[] args) {

    }

    public static void print(int... args) {
        System.out.print("[");
        for (int i = 0; i < args.length - 1; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println(args[args.length - 1] + "]");
    }

    public static void print(byte... args) {
        System.out.print("[");
        for (int i = 0; i < args.length - 1; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println(args[args.length - 1] + "]");
    }

    public static void print(char... args) {
        System.out.print("[");
        for (int i = 0; i < args.length - 1; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println(args[args.length - 1] + "]");
    }

    public static void print(long... args) {
        System.out.print("[");
        for (int i = 0; i < args.length - 1; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println(args[args.length - 1] + "]");
    }

    public static void print(double... args) {
        System.out.print("[");
        for (int i = 0; i < args.length - 1; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println(args[args.length - 1] + "]");
    }

    public static int[] createInt(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 50);
        }
        return output;
    }

    public static double[] createDouble(int size) {
        double[] output = new double[size];
        for (int i = 0; i < size; i++) {
            output[i] = (double) (Math.random() * 50);
        }
        return output;
    }

    public static byte[] createByte(int size) {
        byte[] output = new byte[size];
        for (int i = 0; i < size; i++) {
            output[i] = (byte) (Math.random() * 7);
        }
        return output;
    }

    public static long[] createLong(int size) {
        long[] output = new long[size];
        for (int i = 0; i < size; i++) {
            output[i] = (long) (Math.random() * 50);
        }
        return output;
    }

    public static char[] createChar(int size) {
        char[] output = new char[size];
        for (int i = 0; i < size; i++) {
            output[i] = (char) (Math.random() * 100 + 33);
        }
        return output;
    }

    public static int[] add(int element, int... args) {
        int[] output = new int[args.length + 1];
        for (int i = 0; i < args.length; i++) {
            output[i] = args[i];
        }
        output[args.length] = element;
        return output;
    }

    public static int[] add(int element, int index, int... args) {
        int[] output = new int[args.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = args[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = args[i - 1];
        }
        return output;
    }

    public static double[] add(double element, double... args) {
        double[] output = new double[args.length + 1];
        for (int i = 0; i < args.length; i++) {
            output[i] = args[i];
        }
        output[args.length] = element;
        return output;
    }

    public static double[] add(double element, int index, double... args) {
        double[] output = new double[args.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = args[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = args[i - 1];
        }
        return output;
    }

    public static byte[] add(byte element, byte... args) {
        byte[] output = new byte[args.length + 1];
        for (int i = 0; i < args.length; i++) {
            output[i] = args[i];
        }
        output[args.length] = element;
        return output;
    }

    public static byte[] add(byte element, int index, byte... args) {
        byte[] output = new byte[args.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = args[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = args[i - 1];
        }
        return output;
    }

    public static char[] add(char element, char... args) {
        char[] output = new char[args.length + 1];
        for (int i = 0; i < args.length; i++) {
            output[i] = args[i];
        }
        output[args.length] = element;
        return output;
    }

    public static char[] add(char element, int index, char... args) {
        char[] output = new char[args.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = args[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = args[i - 1];
        }
        return output;
    }

    public static long[] add(long element, long... args) {
        long[] output = new long[args.length + 1];
        for (int i = 0; i < args.length; i++) {
            output[i] = args[i];
        }
        output[args.length] = element;
        return output;
    }

    public static long[] add(long element, int index, long... args) {
        long[] output = new long[args.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = args[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = args[i - 1];
        }
        return output;
    }

    public static int[] delete(int index, int... args) {
        if (index + 1 > args.length) {
            return args;
        } else {
            int[] output = new int[args.length - 1];
            for (int i = 0; i < index; i++) {
                output[i] = args[i];
            }
            for (int i = index + 1; i < args.length; i++) {
                output[i - 1] = args[i];
            }
            return output;
        }
    }

    public static double[] delete(int index, double... args) {
        if (index + 1 > args.length) {
            return args;
        } else {
            double[] output = new double[args.length - 1];
            for (int i = 0; i < index; i++) {
                output[i] = args[i];
            }
            for (int i = index + 1; i < args.length; i++) {
                output[i - 1] = args[i];
            }
            return output;
        }
    }

    public static byte[] delete(int index, byte... args) {
        if (index + 1 > args.length) {
            return args;
        } else {
            byte[] output = new byte[args.length - 1];
            for (int i = 0; i < index; i++) {
                output[i] = args[i];
            }
            for (int i = index + 1; i < args.length; i++) {
                output[i - 1] = args[i];
            }
            return output;
        }
    }

    public static long[] delete(int index, long... args) {
        if (index + 1 > args.length) {
            return args;
        } else {
            long[] output = new long[args.length - 1];
            for (int i = 0; i < index; i++) {
                output[i] = args[i];
            }
            for (int i = index + 1; i < args.length; i++) {
                output[i - 1] = args[i];
            }
            return output;
        }
    }

    public static char[] delete(int index, char... args) {
        if (index + 1 > args.length) {
            return args;
        } else {
            char[] output = new char[args.length - 1];
            for (int i = 0; i < index; i++) {
                output[i] = args[i];
            }
            for (int i = index + 1; i < args.length; i++) {
                output[i - 1] = args[i];
            }
            return output;
        }
    }

    public static void update(int element, int index, int... args) {
        args[index] = element;
    }

    public static void update(byte element, int index, byte... args) {
        args[index] = element;
    }

    public static void update(long element, int index, long... args) {
        args[index] = element;
    }

    public static void update(char element, int index, char... args) {
        args[index] = element;
    }

    public static void update(double element, int index, double... args) {
        args[index] = element;
    }
}
