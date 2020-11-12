package coding.problems;

/**
 * Write a Java program to find the duplicate values of an array of integer values.
 */

public class FindDuplicateElement {

    public static void main(String[] args) {
        int [] arr = {2, 9, 3, 4, 5, 5, 6, 7, 7, 8, 2};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }
}
