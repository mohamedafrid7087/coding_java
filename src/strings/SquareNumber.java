package strings;
public class SquareNumber {
    int square(int a){
//     int b ;
//     b = a*a;
     return a*a;
    }
    int cubeNumber(int a1){
//        int b1;
//        b1 = a1*a1*a1;
        return a1*a1*a1;
    }
    public static void main (String[] args){
        SquareNumber squareNumber = new SquareNumber();
        int valueOfNumber ;
//        valueOfNumber = squareNumber.cubeNumber(2);
//         valueOfNumber = squareNumber.square(3);
        System.out.println("the cube number is="+ squareNumber.square(2));
        System.out.println("the square number is="+  squareNumber.cubeNumber(3));
    }
}
