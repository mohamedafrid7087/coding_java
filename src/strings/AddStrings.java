package strings;

public class AddStrings {
    String sum (String x, String z){
        String s1;
        s1 = x.concat(z);
        return s1;
    }
    public static void main(String[] args){
        AddStrings AddStrings = new AddStrings();
        System.out.println(AddStrings.sum("muhammed", " Nabi s.a.w"));
    }
}

