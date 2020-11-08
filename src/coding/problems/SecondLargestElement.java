package coding.problems;

/*
Find the second largest value in an array
Input = { 1, 4, 3, 5, 2 }
Output = 4
loop all elements
it takes each element and compares with largest number. if array[i] is greatter than largest integer.MIN_VALUE
the value present in largest store in second largest,


 */

import java.util.Arrays;

public class SecondLargestElement {

    public int getElement(int[] array) {
        int largeNumber = Integer.MIN_VALUE;
        ;
        int secondLargeNumber = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > largeNumber) {
                secondLargeNumber = largeNumber;
                largeNumber = array[i];

            } else if (array[i] > secondLargeNumber && array[i] != largeNumber) {
                secondLargeNumber = array[i];
            }

        }
        if (secondLargeNumber == Integer.MIN_VALUE) {
            System.out.println("there is no second largest element in the list ");
        } else {
            System.out.println("the second largest element is : " + secondLargeNumber);
        }
        return secondLargeNumber;
    }


    public static void main(String[] args) {
        int[] input = {-1, -2, 0, -4, -5};

        System.out.println("input : " + Arrays.toString(input));
        SecondLargestElement sc = new SecondLargestElement();
        System.out.println("output : " + sc.getElement(input));
    }
}
