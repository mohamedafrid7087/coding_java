package afridcorp.constructor.usingthisstatement;

public class ConstructorChaining {
    private String name;
    private int age;
    private String location;

    ConstructorChaining(){
        this("unknown");
    }

    ConstructorChaining(String name){
        this(name,-1);
    }

    ConstructorChaining(String name,int age){
        this(name,age,"unknown");
    }

    ConstructorChaining(String name, int age, String location){
        this.name= name;
        this.age = age;
        this.location = location;
    }

    public static void main(String[] args) {
        ConstructorChaining obj1 = new ConstructorChaining();
        System.out.println("...........default constructor.............");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.location);

        ConstructorChaining obj2 = new ConstructorChaining("mohamed afrid");
        System.out.println("...............one parameterized constructor................");
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.location);

        ConstructorChaining obj3 = new ConstructorChaining("mohamed afrid",22);
        System.out.println("...............two parameterized constructor................");
        System.out.println(obj3.name);
        System.out.println(obj3.age);
        System.out.println(obj3.location);

        ConstructorChaining obj4 = new ConstructorChaining("mohamed afrid",22,"Chennai");
        System.out.println("...............three parameterized constructor................");
        System.out.println(obj4.name);
        System.out.println(obj4.age);
        System.out.println(obj4.location);
    }
}
