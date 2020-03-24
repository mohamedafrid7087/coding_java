package afridcorp.finalkeyword;

public class ClassArrayUsingFinal {
  public final static   int arr[] = {1, 2, 3};
        public static void main(String[] args)
        {


            // final with for-each statement
            // legal statement
            for (final int i : arr)
                System.out.print(i + " ");
        }
    }


