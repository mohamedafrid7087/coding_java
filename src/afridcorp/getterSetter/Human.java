package afridcorp.getterSetter;

public class Human {
    private String Name;
    private int age;
    private String working;

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.age;
    }

    public String getWorking() {
        return this.working;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Mohamed Afrid");
        human.setAge(22);
        human.setWorking("not working");

        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getWorking());
    }
}
