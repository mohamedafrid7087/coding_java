package coding.problems;

public class Numbers {

    public static void main(String[] args) {
        int [] myIntegers = {10, 20, 31, 41, 51};
        int even=0, odd =0 ;

        for(int element : myIntegers ){
        if(element % 2 == 0){
         even = even + element;
        }else{
            odd = odd + element;
        }
        }
        System.out.println("even values" + even);
        System.out.println("odd values" + odd);

    }
}
