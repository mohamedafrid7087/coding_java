package afridcorp.overloading;

public class Employee {
    private String name;
    private int age;
    private String profession;
    private final boolean isIndian;

    Employee() {
        this("unknown employee",-1,"not known",false);
    }

    Employee(String name) {
        this(name,-1,"not known",false);
    }

    Employee(String name, int age) {
        this(name,age,"not known",false);
    }

    Employee(String name, int age, String profession) {
        this(name,age,profession,false);
    }

    Employee(String name, int age, String profession, boolean isIndian) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.isIndian = isIndian;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(".............default constructor called.........");
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.profession);
        System.out.println(employee.isIndian);

        Employee emp1 = new Employee("Mohamed Afrid");
        System.out.println("...........constructor with one parameter..........");
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.profession);
        System.out.println(emp1.isIndian);

        Employee emp2 = new Employee("Mohamed Afrid", 22);
        System.out.println("...........constructor with two parameter..........");
        System.out.println(emp2.name);
        System.out.println(emp2.age);
        System.out.println(emp2.profession);
        System.out.println(emp2.isIndian);

        Employee emp3 = new Employee("Mohamed Afrid", 22,"B.E Computer Science Engineering");
        System.out.println("...........constructor with three parameter..........");
        System.out.println(emp3.name);
        System.out.println(emp3.age);
        System.out.println(emp3.profession);
        System.out.println(emp3.isIndian);

        Employee emp4 = new Employee("Mohamed Afrid", 22,"B.E Computer Science Engineering",true);
        System.out.println("...........constructor with four parameter..........");
        System.out.println(emp4.name);
        System.out.println(emp4.age);
        System.out.println(emp4.profession);
        System.out.println(emp4.isIndian);
    }

}
