package coding.problems;

/**
 * write the program to find if a element exist in an array.
 * array = {1, 2, 3, 4, 5}
 * input = 5 output is true
 * input = 7 output is false.
 */

public class ElementExistInAnArray {

    public void elementExist(int[] array) {
        int n = array.length;
        int element = 5;
        boolean checkValue = false;
        for (int i = 0; i < n; i++) {
            if (element == array[i]) {
                checkValue = true;
                break;
            }
        }
        System.out.println("the value is  " + checkValue);

    }


    public static void main(String[] args) {
        ElementExistInAnArray problemsArray = new ElementExistInAnArray();
        int[] input = {1, 2, 3, 4, 5};
        problemsArray.elementExist(input);
    }
}
