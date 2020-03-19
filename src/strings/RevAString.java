package strings;

public class RevAString {
    String rev(String s1) {
        String temps1;
        temps1 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            temps1 = temps1 + s1.charAt(i);
        }
        return temps1;
    }

    public static void main(String[] args) {
        String stringToRev = new String("newzealand");
        RevAString revAString = new RevAString();
        System.out.println("Reverse of " + stringToRev + ":" + revAString.rev(stringToRev));
    }
}