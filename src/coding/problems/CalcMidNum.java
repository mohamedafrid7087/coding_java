package coding.problems;

//print square of the middle value of an array if the array has even number of value then print this is an array of even length

public class CalcMidNum {
    public static void main(String[] args) {

        int [] myIntegers = {10, 20, 30, 40, 4, 60, 70 ,80, 90};
        int middleIndex =myIntegers.length/2;
        System.out.println(middleIndex);
        System.out.println(myIntegers[middleIndex]);
       


        if(myIntegers.length %2 ==0){
            System.out.println("this is an array of even length");
        }else{
            System.out.println("square of middle value =" +myIntegers[middleIndex]* myIntegers[middleIndex]);
        }
    }
}

