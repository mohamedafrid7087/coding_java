package afridcorp.sorting;

public class InsertionSort {

    public void insertionSort (int[] arr){
        int leng = arr.length;
        int temp,j = 0;
        for (int i=0; i<leng; i++) {
             temp = arr[i];
             j = i;
           while(j>0 && arr[j-1]>temp){
               arr[j] = arr[j-1];
               j = j-1;
           }
           arr[j] = temp;
     }
    }

     static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
     }

    public static void main(String[] args) {
        int[] arr = {38, 52, 9, 18, 6, 62, 13};
        int leng = arr.length;
        System.out.println("before sorting");
        for(int i=0; i<leng; i++){
            System.out.print(arr[i] + " ");
        }
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        System.out.println();
        System.out.println("aftersorting");
        printArray(arr);
    }
}
