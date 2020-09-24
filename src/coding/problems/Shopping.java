package coding.problems;

public class Shopping {

//    Jason goes to shopping and picks up garments worth $2500.
//The shop is running a discount sale of 10% off for purchasing upto $1000.
//And 19% off for purchases above $2000.
//Write a program to show the discount amount and the final amount that Jason has to pay.

    public double getDiscount(double totalAmount){
        double value = 0 ;
        if(totalAmount <= 1000 ){
            value = 0.1*totalAmount;
        }else if(totalAmount>=2000){
            value = 0.19*totalAmount;
        }
            return value;
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
