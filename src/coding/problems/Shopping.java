package coding.problems;

public class Shopping {

//    Jason goes to shopping and picks up garments worth $2500.
//The shop is running a discount sale of 10% off for purchasing upto $1000.
//And 19% off for purchases above $2000.
//Write a program to show the discount amount and the final amount that Jason has to pay.
public static void main(String[] args) {

    int jasonAmount = 2500;
    double finalAmount =0 ;

    double ifPurchasing = 1000;
    double ifshopping = 2000;

    if(ifPurchasing <=1000){
        finalAmount = ifPurchasing - 0.1*ifPurchasing;
    }
    System.out.println("discount price for purchasing upto 1000 = " + finalAmount);

    if(ifshopping <= 2000){
        finalAmount = ifshopping - 0.19*ifshopping;
    }
    System.out.println("discount price for purchasing upto 2000 = " + finalAmount);

    if(jasonAmount <= 1000){
        finalAmount = jasonAmount - 0.1*jasonAmount;
    } else if (jasonAmount>=2000){
        finalAmount = jasonAmount - 0.19*jasonAmount;
    }
    System.out.println("the final amount jason has to pay = " + finalAmount);
    }
}
