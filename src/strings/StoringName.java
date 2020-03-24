package strings;

public class StoringName {
    String capitalOfIndia;
    int age;
    String name;
    int salary;

    void printStringArrayElements() {
        int i =0;
        String a[] = {"afrid", "tansin", "ammi", "pappa"};

//        while(i<a.length){
//            System.out.println(a[i]);
//            ++i;
//        }
do {
    System.out.println(a[i]);
    ++i;
}
while(i<a.length);



//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
}

    public StoringName(String capital) {
//        this.capitalOfIndia = "new delhi";
        this.capitalOfIndia = capital;
        System.out.println("constructor being called" + this.capitalOfIndia);
    }
    public StoringName(String name, int age){
       this.name = "name";
        this.age =age;
        System.out.println("constructor with two argument:"  +this.name+""+this.age);
    }

    public StoringName(String name , int age, int salary ){
        this.salary= salary;
        System.out.println("constructor with third argument:" +this.name+""+this.age+""+this.salary);
    }


    public static void main(String[] args) {
        StoringName storingName = new StoringName("new delhi");
        StoringName storingName2 = new StoringName("",+22);
        StoringName storingName3 = new StoringName("afrid",22,25000);

        storingName.printStringArrayElements();

    }
}