package array.sorting.tcs.preparation;
/*
Write a code to check whether no is prime or not. Condition use function check()
to find whether entered no is positive or negative ,
if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?
 */

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//First we will ask the user to enter a number
        System.out.println("Enter value to be evaluated : ");
        int n = sc.nextInt();
//create object of class CheckPrime
        PrimeOrNot prime=new PrimeOrNot();
//calling function with value n, as parameter
        prime.verify(n);
    }
    //function for checking number is positive or negative
    void verify(int n)
    {
        if(n<0)
            System.out.println("Negative number detected enter positive number");
        else
            calc(n);
    }
    //creating function for checking prime or not
    void calc(int n)
    {
        int x=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                ++x;
        }
        if(x>=1)
            System.out.println("The number that you have entered is not prime");
        else
            System.out.println("The number that you have entered is prime");
    }
}