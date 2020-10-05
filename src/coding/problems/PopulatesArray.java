package coding.problems;

public class PopulatesArray {



    public int[] createAndPopulateArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int location = 0; location < array.length; location++) {

            if (array[location] % 2 == 0) {
                System.out.println("Even value : array [" + location + "]: " + array[location]);

                if (location % 2 != 0) {
                    newArray[location] = array[location];
                    System.out.println("odd location :" + location);
                } else {
                    newArray[location] = array[location];
                }
            } else {
                System.out.println("odd value : array[" + location + "] :" + array[location]);
                newArray[location] = array[location];
                //odd num & even location
                if (location % 2 == 0) {
                    newArray[location] = array[location];
                } else {
                    newArray[location] = array[location];
                }
            }
        }
        printArray(newArray);
        return  newArray;
    }

    public void printArray(int [] array){
        System.out.print("input : " );
        for(int item : array ){
            System.out.print(item + " ,");
        }
    }

    public static void main(String[] args) {
        int [] input ={2, 5, 7, 9, 4, 10};
        PopulatesArray populatesArray = new PopulatesArray();
        populatesArray.createAndPopulateArray(input);
    }
}
