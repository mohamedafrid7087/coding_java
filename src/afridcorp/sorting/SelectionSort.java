package afridcorp.sorting;

public class SelectionSort {

    public void SelectionSort (int[] arr){

        for(int i=0; i<arr.length; i++){
            int minValue = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minValue]) {
                    minValue = j;
                }
                    int temp = arr[i];
                    arr[i] = arr[minValue];
                    arr[minValue] = temp;

            }
        }
    }

    static void printArray(int[] arr){
        for(int i :arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 52, 9, 18, 6, 62, 13};
        int leng = arr.length;
        System.out.println("before sorting");
        for(int i=0; i<leng; i++){
            System.out.print(arr[i] + " ");
        }
        SelectionSort ss = new SelectionSort();
        ss.SelectionSort(arr);
        System.out.println();
        System.out.println("after sorting ");
        printArray(arr);
    }
}
