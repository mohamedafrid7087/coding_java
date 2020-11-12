package pr;

import java.util.Arrays;

class SecondLargestElement {

    int getSecondLargest(int[] array) {
        int largest = 0;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                secondLargest = largest;
                largest = array[i];
            } else {
                if (secondLargest < largest && secondLargest < array[i]) {
                    secondLargest = array[i];
                }
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] input = {-1, -2, -3, -4, -5};

        System.out.println("Input: " + Arrays.toString(input));
        SecondLargestElement s = new SecondLargestElement();
        System.out.println("Output: " + s.getSecondLargest(input));
    }
}
