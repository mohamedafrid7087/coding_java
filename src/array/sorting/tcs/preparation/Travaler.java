package array.sorting.tcs.preparation;


import java.util.Scanner;

public class Travaler {


    public static void getDistance(int a) {
        int distance = 10;
        int x = 0;
        int y = 0;
        char ch = 'R';
        while(a > 0)
        {
            switch(ch)
            {
                case 'R':
                    x = x + distance;
                    ch = 'U';
                    distance = distance+10;
                    break;

                case 'U':
                    y = y + distance;
                    ch = 'L';
                    distance = distance + 10;
                    break;

                case 'L':
                    x = x - distance;
                    ch = 'D';
                    distance = distance + 10;
                    break;

                case 'D':
                    y = y - distance;
                    ch = 'A';
                    distance = distance + 10;
                    break;

                case 'A':
                    x = x + distance;
                    ch = 'R';
                    distance = distance + 10;
                    break;
            }
            a--;
        }
        System.out.println(x+ " , "+y);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        getDistance(testCase);
    }

}