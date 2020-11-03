package lesson02;

public class BodyMassIndex {
    public static void main(String[] args) {
        int weight = 85;
        int length = 182;
        System.out.println(findBMI(weight, length));
    }

    public static double findBMI(int mass, int length) {
        double high = (double) length / 100;
        return mass / (high * high);
    }
}
