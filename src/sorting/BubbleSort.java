package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntergerValue(int capacity){
        int [] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values :");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

   public static int[] bubbleSort(int[] arr){
        int [] sortedArray = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            sortedArray[i] = arr[j];
        }

        for(int i=0; i<arr.length-1-i; i++){
            for( j=i+1; j<arr.length; j++){
                if(sortedArray[i] > arr[j]){
                    int temp = sortedArray[i];
                    sortedArray[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return sortedArray ;
    }
    static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.println("Element" + i + " Content " + arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] myIntegers = getIntergerValue(5);
        int[] sorted = bubbleSort(myIntegers);
        printArray(sorted);
//        int [] arr = {50, 40, 13, 14, 12, 67, 45, 72};
//        int leng = arr.length;
//        System.out.println("before sorting");
//        for(int i=0; i<leng; i++){
//            System.out.print(arr[i] + " ");
//        }

//        bs.bubbleSort(arr);
//        System.out.println();
//        System.out.println("after sorting ");
//        printArray(arr);
    }
}
