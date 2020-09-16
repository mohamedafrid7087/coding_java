package sorting;

import java.util.Scanner;

public class SelectionSort {
    public static Scanner scanner = new Scanner(System.in);

    public static int [] getInteger(int capacity){
        int [] array = new int[capacity];
        System.out.println(" Enter " + capacity + " integer values :  \r");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static  int [] selectionSort (int[] arr){
        int[] sortedArray = new int[arr.length];
        int minValue = 0 , temp =0;
        for(int i=0; i<arr.length; i++){
            sortedArray[i] = arr[minValue];
        }

        for(int i=0; i<arr.length; i++){
             minValue = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minValue]) {
                    minValue = j;
                }
                     temp = arr[i];
                    arr[i] = arr[minValue];
                    arr[minValue] = temp;

            }
        }
        return  sortedArray;
    }

   public static void printArray(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.println("Element" + i + " Content " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] myIntegerValues = getInteger(8);
        int [] sorted = selectionSort(myIntegerValues);
        printArray(sorted);

    }
}
//        int[] arr = {38, 52, 9, 18, 6, 62, 13};
//        int leng = arr.length;
//        System.out.println("before sorting");
//        for(int i=0; i<leng; i++){
//            System.out.print(arr[i] + " ");
//        }
//        SelectionSort ss = new SelectionSort();
//        ss.SelectionSort(arr);
//        System.out.println();
//        System.out.println("after sorting ");
//        printArray(arr);
