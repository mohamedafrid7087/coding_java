package array.sorting.tcs.preparation;

import java.util.Scanner;

/**
 * A non-empty array A consisting of N numeric value is given The product of quadruplet (P, Q, R, S) equals to A[P]* A[Q]*A[R]*A[S]
 * (0<=P<Q<R<S< N).
 * For example, array A such
 * A[0] = -3 A[1]= 1 A[2] = 2 A[3]= -2 A[4]=5  A[5] = 6 A[6] = 1
 * (0, 1 2, 3), product is -3*1*2*-2 = 12
 * (1, 2 4, 5), product is 1*2*5*6-30
 * (2,4 5, 6), product is 2*5*6*1= 60
 * 60 is the product of quadruplets (2, 4, 5, 1). which is maximal
 * Your goal is to find the maximal product of any quadruplet for input Array Al Write an efficient algorithm for the following assumptions
 * N is an integer float within the range [4..100,000];
 *Example 1 :
 * Input: Enter count of values you are going to insert
 * 5
 * Enter 5 numbers
 * 3
 * 3
 * 3
 * 3
 * 3
 * Output:
 * 8:10
 *
 * Example 2:
 * Input
 *
 * Enter count of values you are going to insert:
 * 3
 * Enter 3 numbers
 * 2
 * 3
 * 4
 *
 * output :
 * Invalid output.
 *
 */


public class QuadrupletArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value your going to insert");
        int n = sc.nextInt();
        float [] array = new float[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextFloat();
        }

    }

    public float quadruplet(float [] arr, float q){


      return 0;
    }
}
