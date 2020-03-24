package afridcorp.parentclass;

public class SuperMarket {
    String name;
    String products;

    SuperMarket(String n, String p) {
        this.name = n;
        this.products = p;
    }

    public String getName() {
        return name;
    }

    public String getProducts() {
        return products;
    }

}

    class Glocerries extends SuperMarket {
        public Glocerries(String n, String p) {
            super(n,p);
        }

        @Override
        public String getName() {
//            System.out.printf("CHILD CLASS CALLED");
            return super.getName();
        }

        @Override
        public String getProducts() {
            return super.getProducts();
        }
    }

class main {
    public static void main(String[] args) {
        SuperMarket glocerries = new Glocerries("wash matic", "surf excel");
        System.out.println(glocerries.getName());
        System.out.println(glocerries.getProducts());
    }
}






