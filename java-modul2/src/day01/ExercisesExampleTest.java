package day01;

import day01.CrudArray;

public class ExercisesExampleTest {
    public static void main(String[] args) {
        int[] myNewArr = new int[]{1,2};
        CrudArray.printArr(myNewArr);
        double[] myNewArr2 = new double[]{1.3,2.7};
        CrudArray.printArr(myNewArr2);
        CrudArray.printArr();
        int a = Sum.sum(5,6);
    }
}
