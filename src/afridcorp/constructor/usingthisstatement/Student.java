package afridcorp.constructor.usingthisstatement;

public class Student {
    private final String name;
    private final   int age;
   private final boolean isTeen;

  public Student(String name, int age, boolean isTeen){
    this.name= name;
    this.age= age;
    this.isTeen = isTeen;
    }

    public final void studentsDetails(){
        System.out.println("stu name" + this.name);
        System.out.println("stu age" + this.age);
        System.out.println("stu isTeen" + this.isTeen);
    }
}
class Rohit extends Student{
    public Rohit(String name, int age, boolean isTeen) {

        super(name, age, isTeen);
    }
}

class Virat extends Student{
    public Virat(String name, int age, boolean isTeen) {
        super(name, age, isTeen);
    }
}

class TestCase{
    public static void main(String[] args) {
        Rohit obj1 = new Rohit("mohamed afrid",22,true);
        obj1.studentsDetails();
        Virat obj2 = new Virat("virat",29,true);
        obj2.studentsDetails();
    }
}



