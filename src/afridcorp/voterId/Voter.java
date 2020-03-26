package afridcorp.voterId;

public class Voter {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Voter(String name, int age){
        this.name = name;
        this.age = age;
    }
}

 class Main{
    Voter[] voterList = new Voter[3];

    public void addVoter(String name, int age) {
        voterList[0] = new Voter(name, age);
        voterList[1] = new Voter(name, age);
        voterList[2] = new Voter(name, age);
    }

    public void printVoterList(){
        for(Voter eachVoter : voterList) {
            System.out.println(eachVoter);
        }
    }

    public static void main(String[] args) {
            Main instanceObj = new Main();
            instanceObj.addVoter("Mohamed Afrid", 22);
            instanceObj.printVoterList();
    }
}

