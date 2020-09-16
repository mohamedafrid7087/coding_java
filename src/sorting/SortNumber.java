package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumber {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getInteger(int capacity){
        int []array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values : \r");
        for(int i=0; i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int [] sortArray(int [] array){
//        int [] sortedArray = new int[array.length]; //TO Copy the array
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
            int[] sortedArray = Arrays.copyOf(array,array.length);

//        }
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=0; i<array.length-1;i++){
                if(sortedArray[i] <sortedArray[i+1]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int [] array){
        for(int i=0 ; i<array.length;i++){
            System.out.println("element " + i + " contents " + array[i]);
        }
    }
    public static void main(String[] args) {

        int [] myInteger = getInteger(5);
        int [] sorted = sortArray(myInteger);
        printArray(sorted);

    }
}
