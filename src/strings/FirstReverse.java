package strings;

public class FirstReverse {
    String rev(String s1) {
        String temps1;
        temps1 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            temps1 = temps1 + s1.charAt(i);
        }
        return temps1;
    }

    public static void main(String[] args) {
//        String revOfString = new String("afifa");
        FirstReverse firstReverse = new FirstReverse();
        System.out.println("the reverse of " + args[0] + ":" + firstReverse.rev(args[0]));

    }
}