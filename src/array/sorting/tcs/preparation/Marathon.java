package array.sorting.tcs.preparation;
/**
 * marathon is a long distance face with an official distance of 42.195
 * kilometres (26 miles 385 yards), usually run as a road race or footrace
 * A local marathon was organized at Bavdhan Pune. The distance actually
 * Covered by the participants has been recorded in an array R[]which is an
 * integer array holding the values in kilometres if there are N Number of
 * participants who started running at a particular time, then the size of R is
 *N.The participants should cover a distance more than 0.0 km to get
 * recorded in array R[]
 * Find the maximum distances covered by highest racer excluding finisher if there are one or two racers excluding finisher
 * give there distance covered.
 * R[] will be the input float array.
 * write the code to take the input array R[] and return 3 maximum distance excluding finishing distance d,d=42.195 km.
 *
 * Example 1: Input Values
 * Enter the distance covered by racers in marathon (kilometers) please
 * (press q to terminate)
 * 42.195
 * 42.195
 * 42.195
 * 33.25
 * 40
 * 41.2
 * 38.9
 * q
 *
 * Output Values
 * Highest Distance Excluding Finishers
 * [41.2, 40.0, 38.9]
 *
 * Example 2:
 * Input Values
 * Enter the distances covered by racers in Marathon (Kilometers) please
 * (press q to terminate)
 * 3333
 * 42.9
 * 39.56
 * -35.6
 * 42.195
 * q
 *
 * output:
 *  Highest Distance Excluding Finishers
 *
 * invalid output.
 */


import java.util.Scanner;

public class Marathon {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
   int n =sc.nextInt();

        double array[]= new double[n];
        System.out.println("enter distance covered by racers in marathon " + n);
      for(int i=0;i<n;i++){
          array[i] = sc.nextDouble();
      }
      for(int i=0; i<n;i++){
          for(int j = i+1;j<n;j++){
              if(array[i] < array[j]){
                  double temp = array[i];
                  array[i]=array[j];
                  array[j]= temp;
              }
          }
      }
      double R[] = new double[3];    /// 1.5 1 1.6 1.7 1.8 2
      int j =0;
      for(int i =0 ;i<n;i++){
          if(array[i] < 42.75){
              R[j] = array[i];
              j++;
          }
          if(j==3){
              break;
          }
      }

        System.out.println("highest distance excluding finishers are ");
      for(int i=0;i<3;i++){
          if(R[i]!=0.0){
              System.out.println(R[i]);
          }
      }
    }
}
