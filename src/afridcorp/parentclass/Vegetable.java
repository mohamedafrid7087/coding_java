package afridcorp.parentclass;

public class Vegetable {
    String name;
    String color;

    public Vegetable(String n, String c){
        this.name = n;
        this.color = c;
    }

    public String getName() {
        return "cucumber";
    }

    public String getTaste() {
        return "sweet";
    }
}

class Carrot extends Vegetable {
    public Carrot() {
        super("unknown", "unknown");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

class HealthyFood extends Vegetable{
    public HealthyFood(){
        super("unknown","unknown");
    }
    @Override
    public String getTaste() {
        return super.getTaste();
    }
}



 class Main{
     public static void main(String[] args) {
         Vegetable carrot = new Carrot();
         System.out.println(carrot.getTaste());
         System.out.println(carrot.getName());


         Vegetable HealthyFood = new HealthyFood();
         System.out.println(HealthyFood.getTaste());
         System.out.println(HealthyFood.getName());

     }

}
