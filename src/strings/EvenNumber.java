package strings;

public class EvenNumber {
    void checkEven(int n){
        if(n % 2 ==0){
            System.out.println("the given number is even");

        }
        else{
            System.out.println("the given number is not even");
        }

    }
    public static void main(String [] args){
        EvenNumber evenNumber = new EvenNumber();

        evenNumber.checkEven(4);
    }

}
