package lesson02.hw02anton;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int var1 = setVar(1);
        int var2 = setVar(2);
        findLCM(var1, var2);
    }

    private static void findLCM(int var1, int var2) {
        int multiple = var1 > var2 ? var1 : var2;
        while (!(multiple % var1 == 0 && multiple % var2 == 0)) {
            multiple++;
        }
        System.out.println("The least common multiple of " + var1 + " and " + var2 + " is " + multiple);
    }

    private static int setVar(int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for variable" + number);
        return input.nextInt();
    }

}
