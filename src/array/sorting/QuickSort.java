package array.sorting;

public class QuickSort {
    int partition(int []arr, int low, int high){

        int pivot = arr[(low+high)/2];// if we are taking pivot element  as low index even then the program works.divide and conqur

        while(low <= high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high --;
            }
            }
       return low;
    }

    void quickSortRecursion(int[] arr, int low, int high){
         int pi = partition(arr,low,high);
         if(low<pi-1){
             quickSortRecursion(arr, low, pi-1);
         }
         if(pi<high){
             quickSortRecursion(arr,pi,high);
         }
    }

    void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int []arr = {50, 40, 13, 14, 12, 67, 45, 72};
        int leng = arr.length;
        System.out.println("before sorting ");
        for(int i =0; i<leng; i++){
            System.out.print(arr[i] + " ");
        }
        QuickSort qs = new QuickSort();
        qs.quickSortRecursion(arr,0,leng-1);
        System.out.println();
        System.out.println("After sorting");
        qs.printArray(arr);
    }
}
