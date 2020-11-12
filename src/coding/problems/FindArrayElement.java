package coding.problems;

import java.util.Scanner;

/**
 * write the program to find if a element exist in an array.
 * array = {1, 2, 3, 4, 5}
 * input = 5 output is true
 * input = 7 output is false.
 */
public class FindArrayElement {


    public boolean findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return true;
            }

        }
        return false;
    }




    public static void main(String[] args) {
        FindArrayElement problemsArray = new FindArrayElement();
         Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("press to find element in array");
        int input ;
        input = scanner.nextInt();
        System.out.println(" output is " + problemsArray.findElement(array, input));
    }
}