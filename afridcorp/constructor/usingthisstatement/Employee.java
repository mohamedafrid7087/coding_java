package afridcorp.constructor.usingthisstatement;

public class Employee {
    String name;
    int age;
    String profession;

    Employee(){
        this("unknown");
    }

    Employee(String name){
        this(name,-1);
    }

    Employee(String name,int age){
        this(name,age,"unknown");
    }

    Employee(String name, int age, String profession){
       this.name= name;
       this.age= age;
       this.profession= profession;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("............default constructor.........");
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.profession);

        Employee emp2 = new Employee("mohamed afrid");
        System.out.println(".................constructor one argument.........");
        System.out.println(emp2.name);
        System.out.println(emp2.age);
        System.out.println(emp2.profession);

        Employee emp3 = new Employee("mohamed Afrid",22);
        System.out.println("..............two arg constructor");
        System.out.println(emp3.name);
        System.out.println(emp3.age);
        System.out.println(emp3.profession);

        Employee emp4 =new Employee("Mohamed Afrid",22,"not working");
        System.out.println(".........with three arg constructor...........");
        System.out.println(emp4.name);
        System.out.println(emp4.age);
        System.out.println(emp4.profession);
    }
}
