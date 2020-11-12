package coding.problems;

public class Shopping {

    public static final int TEN_PERCENTAGE_OFFER_AMOUNT = 500;
    public static final int NINETEEN_PERCENTAGE_OFFER_AMOUNT = 1500;

//    Jason goes to shopping and picks up garments worth $2500.
//The shop is running a discount sale of 10% off for purchasing upto $1000.
//And 19% off for purchases above $2000.
//Write a program to show the discount amount and the final amount that Jason has to pay.

    public double getDiscount(double totalAmount){
        double discount = 0 ;
        if(totalAmount <= TEN_PERCENTAGE_OFFER_AMOUNT ){
            discount = 0.1*totalAmount;
        }else if(totalAmount>=NINETEEN_PERCENTAGE_OFFER_AMOUNT){
            discount = 0.19*totalAmount;
        }
            return discount;
    }
    
public static void main(String[] args) {

        Shopping shopping = new Shopping();
        double totalAmount = 2000;
        double discount = shopping.getDiscount(totalAmount);
        double finalAmount = totalAmount- discount;
        System.out.println("final amount to be paid = " +finalAmount);
        System.out.println("discount price availed for purchase is = " +discount);

    }
}
//    Write a program that creates an array and populates the given even numbers in odd locations and odd numbers in even locations.
//        Then print the array and show the output.
//        Input - number = 2, 5, 7, 9 , 4