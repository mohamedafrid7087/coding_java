package coding.problems;

/**1 requriement
 * 2 input and output
 *
 *
 */
public class TestCase {

    public int[] createsAndPopulatesArray(int[] array) {
        int evenInd = 1;
        int oddInd = 0;
        int n = array.length;

        while (true) {
            while (evenInd < n && array[evenInd] % 2 == 0)
                evenInd += 2;
            while (oddInd < n && array[oddInd] % 2 == 1)
                oddInd += 2;
            if (evenInd < n && oddInd < n) {
                int temp = array[evenInd];
                array[evenInd] = array[oddInd];
                array[oddInd] = temp;
            }
            else
                break;
        }

        return array;
    }

    public static void main(String[] args) {
        int [] input = {2, 3, 4, 5, 6};
        TestCase populatesArray = new TestCase();
        int [] result = populatesArray.createsAndPopulatesArray(input);
        System.out.print("output : ");
        for(int item : result){
            System.out.print(item + ", ");
        }

    }
}

