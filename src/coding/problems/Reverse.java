package coding.problems;

public class Reverse {
    public static void main(String[] args) {
        int []myIntegers = {1, 2, 3, 4, 5};
        for(int i=myIntegers.length-1; i>=0; i--){
            System.out.print(myIntegers[i] + " ");
        }
    }
}
