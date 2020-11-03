package lesson02;

public class BinarySearch {
    public static void main(String[] args) {
        int[] testArr = {1, 2, 4, 5, 7, 8, 9, 13, 15};
        //System.out.println(iterativeBinarySearch(testArr, 13));
        System.out.println(recursiveSearch(testArr, 13));
    }

    public static int recursiveSearch(int[] arrToSearch, int element) {
        return recursiveSearch(arrToSearch, element, 0, arrToSearch.length - 1);
    }

    private static int recursiveSearch(int[] arrToSearch, int element, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) {
            return -1;
        }
        int elementPosition = -1;
        int middleIndex = (lowIndex + highIndex) / 2;
        if (element == arrToSearch[middleIndex]) {
            elementPosition = middleIndex;
        } else if (element < arrToSearch[middleIndex]) {
            return recursiveSearch(arrToSearch, element, lowIndex, middleIndex - 1);
        } else if (element > arrToSearch[middleIndex]) {
            return recursiveSearch(arrToSearch, element, middleIndex + 1, highIndex);
        }
        return elementPosition;
    }

    public static int iterativeBinarySearch(int[] arrToSearch, int element) {
        int elementPosition = -1;
        int lowIndex = 0;
        int highIndex = arrToSearch.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (element == arrToSearch[middleIndex]) {
                elementPosition = middleIndex;
                break;
            } else if (element < arrToSearch[middleIndex]) {
                highIndex = middleIndex - 1;
            } else if (element > arrToSearch[middleIndex]) {
                lowIndex = middleIndex + 1;
            }
        }
        return elementPosition;
    }
}
