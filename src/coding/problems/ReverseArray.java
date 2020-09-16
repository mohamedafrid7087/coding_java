package coding.problems;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray( int [] revArray){
        for(int left = 0, right = revArray.length-1; left < right; left++ ,right--){
            int temp = revArray[right];
            revArray[right] = revArray[left];
            revArray[left] = temp;
        }
    }

    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] myIntegers = {1, 2, 3, 4, 5};
        System.out.println(" input : ");
        for(int i=0 ; i<myIntegers.length; i++){
            System.out.print(myIntegers[i] + " ,");
        }
        reverseArray(myIntegers);
        System.out.println();
        System.out.println(" output :");
        printArray(myIntegers);
    }
}