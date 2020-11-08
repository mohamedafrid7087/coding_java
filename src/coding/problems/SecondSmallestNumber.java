package coding.problems;

import java.util.Arrays;

public class SecondSmallestNumber {

    public int getElement(int[] array) {
        int largeNumber = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < largeNumber) {
                secondSmallest = largeNumber;
                largeNumber = array[i];

            } else if (array[i] < secondSmallest && array[i] != largeNumber) {
                secondSmallest = array[i];
            }

        }
        if (secondSmallest == Integer.MIN_VALUE) {
            System.out.println("there is no second largest element in the list ");
        } else {
            System.out.println("the second largest element is : " + secondSmallest);
        }
        return secondSmallest;
    }


    public static void main(String[] args) {
        int[] input = {-1, -2, -3, -4, -5};

        System.out.println("input : " + Arrays.toString(input));
        SecondSmallestNumber sc = new SecondSmallestNumber();
        System.out.println("output : " + sc.getElement(input));
    }
}
