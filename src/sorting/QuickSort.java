package sorting;

public class QuickSort {

    int partition(int [] arr, int low, int high){
        int pivot = arr[(low + high)/ 2];

        while(low<=high){
            while(arr[low]<pivot){
                low ++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high]= temp;
                low ++;
                high --;
            }
        }
        return low;
    }

    void QuickSortRecursion(int[]arr, int low, int high) {
        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            QuickSortRecursion(arr, low, pi - 1);
        }
        if (pi < high) {
            QuickSortRecursion(arr, low, pi);
        }
    }
     public static void printArray(int arr[]){
        for(int i :arr) {
            System.out.print(i + " ");
        }
     }

    public static void main(String[] args) {
        int [] arr = {38, 52, 9, 18, 6, 62, 13};
        int leng = arr.length;
        System.out.println("Before sorting");
        for(int i=0; i<leng; i++){
            System.out.print(arr[i] + " ");
        }
        QuickSort qs = new QuickSort();
        qs.QuickSortRecursion(arr,0,leng-1);
        System.out.println();
        System.out.println("after sorting");
        printArray(arr);
    }
}
