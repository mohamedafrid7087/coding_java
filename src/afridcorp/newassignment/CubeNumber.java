package afridcorp.newassignment;

public class CubeNumber {
    int cube(int a) {
        int c;
        c = a*a*a;
        return c;
    }

    public static void main(String[] args) {
        CubeNumber cubeOfNumber = new CubeNumber();
        System.out.println("the cube number is :" +cubeOfNumber.cube(2));
    }
}
