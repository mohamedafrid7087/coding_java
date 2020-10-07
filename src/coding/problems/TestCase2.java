package coding.problems;

/**
 * write a program to find the sum of all the value found in the odd location of a given array.
 * input {10, 20, 30, 40, 50};
 * output :60
 *
 */

public class TestCase2 {

    public void oddLocation(int [] array){
        int oddValue = 0;
        for(int i=0; i<=array.length; i++){
            if(array[i] % 2 !=0){
               oddValue += array[i];
            }
        }

    }

    public static void main(String[] args) {
        int [] input = {10, 20, 30, 40, 50};
        TestCase testCase = new TestCase();
        testCase.

    }
}





