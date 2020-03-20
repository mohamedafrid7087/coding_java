package afridcorp;

public class Person {
   private String firstName;
    private String lastName;
    private int age;
    String getFirstName(){
        return this.firstName;
    }

    String getLastName(){

        return this.lastName;
    }

    int getAge(){

        return this.age;
    }

    void setFirstName(String a){
        this.firstName = a;

    }

    void setLastNmae(String b){

        this.lastName = b;
    }

    void setAge(int a){
        if(a>100 || a<0){
            this.age= 0;
        } else{
            this.age=a;
        }
    }

    boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }

     String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        if(this.lastName.isEmpty()){
            return this.firstName;
        }
        if(this.firstName.isEmpty()){
            return this.lastName;
        }
        return this.firstName + this.lastName;
        }

        public static void main(String[] args){
        Person person = new Person();
        person.setFirstName("mohamed");
        person.setLastNmae("afrid");
        person.setAge(22);

        System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            System.out.println(person.getAge());
            System.out.println(person.isTeen());
            System.out.println(person.getFullName());

        }
    }

