package array.sorting.tcs.preparation;


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year :");
        year = sc.nextInt();
        sc.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap == true ){
            System.out.println(year + " this year is a leap year");
        }else{
            System.out.println(year + " this year is not a  leap year");

        }


    }
}
