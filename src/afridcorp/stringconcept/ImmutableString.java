package afridcorp.stringconcept;

public class ImmutableString {

        public static void main(String args[]){
            String s="Sachin";
            s=s.concat(" Tendulkar");
            System.out.println(s);
        }
    }
    class main{
        public static void main(String[] args) {
            String s = "mohamed"; // class String and its immutable
            s.concat("afrid"); // it cannot be joined because i just called object to (s.concat) join another name so the
            // string is immutable it will not join or concat another name.
            System.out.println(s);
        }
    }

