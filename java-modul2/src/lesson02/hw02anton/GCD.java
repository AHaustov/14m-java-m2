package lesson02.hw02anton;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int var1 = setVar(1);
        int var2 = setVar(2);
        findGCD(var1, var2);
    }

    private static void findGCD(int var1, int var2) {
        int divisor = var1 < var2 ? var1 : var2;
        while (!(var1 % divisor == 0 && var2 % divisor == 0)) {
            divisor--;
        }
        System.out.println("The greatest common Divisor of " + var1 + " and " + var2 + " is " + divisor);
    }

    private static int setVar(int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for variable" + number);
        return input.nextInt();
    }

}
