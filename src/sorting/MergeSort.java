package sorting;

public class MergeSort {

    public void mergeSort(int[] arr, int l, int m, int r){

        int n1 = m - l+1;
        int n2 = r-m;

        int Left [] = new int [n1];
        int Right [] = new int[n2];

        for(int i=0; i<n1; ++i){
            Left[i] = arr[l + i];
            for(int j = 0; j<n2; ++j){
                Right [j] = arr[m + 1 + j];
            }
        }
        int i= 0;
        int j=0;
        int k =l;
        while(i<n1 && j<n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

            while(i<n1){
                arr[k] = Left[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k] = Right[j];
                j++;
                k++;
            }

    }

    public void mergeSortReccursion(int [] arr, int l, int r){
        if(l<r) {
            int m = (l + r) / 2;
            mergeSortReccursion(arr, l,m);
            mergeSortReccursion(arr,m+1,r);
            mergeSort(arr,l,m,r);
        }
    }

        public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        }


    public static void main(String[] args) {

        int arr[] = {100000, 21212, 3333333, 44444, 5232, 623, 734, 866, 99};
        MergeSort obj = new MergeSort();
        int leng = arr.length;
        System.out.println("before sorting : ");
        for(int i=0; i<leng; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        obj.mergeSortReccursion(arr,0,arr.length-1);
        System.out.println("after sorting");
        printArray(arr);

    }
}