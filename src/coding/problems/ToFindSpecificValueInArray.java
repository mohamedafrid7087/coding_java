package coding.problems;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class ToFindSpecificValueInArray {

    public static boolean toFindSpecificValue(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        ToFindSpecificValueInArray specificValue = new ToFindSpecificValueInArray();
        System.out.println(specificValue.toFindSpecificValue(my_array1,2035));
        System.out.println(specificValue.toFindSpecificValue(my_array1,2365));
    }

}