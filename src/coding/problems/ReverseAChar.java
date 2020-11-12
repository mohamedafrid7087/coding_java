package coding.problems;

public class ReverseAChar {

        public static void main(String[] args) {
            String input = "tutorialspoint";
            char[] str = input.toCharArray();
            for (int i = str.length-1;i >= 0; i--)
                System.out.print(str[i]);
        }
    }