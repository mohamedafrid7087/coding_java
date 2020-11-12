package coding.problems;

/**
 * write a program to find the sum of all the value found in the odd location of a given array.
 * input {10, 20, 30, 40, 50};
 * output :60
 *
 */
public class SumOfOddLocationValuesOfArray {

    public int sumOfOddValues(int [] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            if(i % 2 !=0){ // Odd Index
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] input = {10, 20, 30, 40, 50};
        SumOfOddLocationValuesOfArray s = new SumOfOddLocationValuesOfArray();
        System.out.println("Output: " + s.sumOfOddValues(input));
    }
}
