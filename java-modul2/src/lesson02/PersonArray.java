package lesson02;

public class PersonArray {
    public static void main(String[] args) {
        Person p1 = new Person("Anton", 90, 190, 31);
        Person p2 = new Person("Merkel", 86, 166, 15);
        Person p3 = new Person("Putin", 120, 175, 45);
        Person p4 = new Person("Macron", 125, 179, 10);
        Person p5 = new Person("Trump", 115, 194, 70);
        Person p6 = new Person("Biden", 88, 176, 100);
        Person p7 = new Person("Merz", 93, 182, 28);
        Person p8 = new Person("Laschet", 75, 184, 53);
        Person p9 = new Person("Caligula", 65, 199, 37);
        Person p10 = new Person("Peter", 97, 192, 16);
        Person[] arrP = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        bubbleSort(arrP);
        //System.out.println(arrP[0].age);
        //System.out.println(p1.age);
        //System.out.println(arrP[7].bmi);
        printArr(arrP);
    }

    public static void printArr(Person[] arr) {
        for (Person user : arr) {
            user.displayInfo();
        }
    }

    private static void bubbleSort(Person[] arr) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].age > arr[i + 1].age) {
                    Person temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
