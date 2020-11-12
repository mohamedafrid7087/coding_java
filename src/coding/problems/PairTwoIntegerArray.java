package coding.problems;

/**
 * Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
 */

public class PairTwoIntegerArray {


    public  void  pairValue(int inputArray[], int inputNumber) {

        System.out.println("Pairs of elements and their sum : ");

        for (int i =  0; i < inputArray.length; i++){

            for (int j  = i+1; j < inputArray.length; j++) {

                if(inputArray[i]+inputArray[j] == inputNumber) {

                    System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
                }
            }
        }
    }

    public static void  main(String[] args) {

        PairTwoIntegerArray pairTwoIntegerArray = new PairTwoIntegerArray();

        pairTwoIntegerArray.pairValue(new int[] {2, 7, 4, -5, 11, 5, 20}, 13);
        pairTwoIntegerArray.pairValue(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);

    }
}
