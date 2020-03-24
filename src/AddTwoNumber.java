public class AddTwoNumber {
    int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public static void main(String[] args) {
        AddTwoNumber addTwoNumber = new AddTwoNumber();
        System.out.println(addTwoNumber.sum(1000, 2000));
    }

}
