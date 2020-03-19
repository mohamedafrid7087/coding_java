package strings;

public class StoringNumber {
//    write a method to define and initialize an integer array to store 10 number and print those array elements
//    write a method to define and initialize an string array to store family names and print those array element
    void printIntegerArrayElements(){
        int b [] = {100,200,300,400,500};
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);
//        System.out.println(b[3]);
//        System.out.println(b[4]);
    }
    public static void main(String[]args){
    StoringNumber storingNumber = new StoringNumber();
    storingNumber.printIntegerArrayElements();

    }

}
