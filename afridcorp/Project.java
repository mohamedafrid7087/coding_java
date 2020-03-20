package afridcorp;

public class Project {
    private Integer amount = 0;
    public void exampleMethod() {
        amount++;
    }
    public void anotherExampleMethod() {
        Integer anotherAmount = amount + 4;
    }


    public static void main(String[] args){
        Project mv = new Project();
        mv.anotherExampleMethod();
        mv.exampleMethod();


    }

}
