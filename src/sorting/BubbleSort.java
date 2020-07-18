package sorting;

public class BubbleSort {

    void bubbleSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {50, 40, 13, 14, 12, 67, 45, 72};
        int leng = arr.length;
        System.out.println("before sorting");
        for(int i=0; i<leng; i++){
            System.out.print(arr[i] + " ");
        }
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        System.out.println();
        System.out.println("after sorting ");
        printArray(arr);
    }
}
