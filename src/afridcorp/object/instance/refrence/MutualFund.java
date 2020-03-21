package afridcorp.object.instance.refrence;

public class MutualFund {
    private String name;
    private int stockPrice;

    public String getName() {
        return name;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    //constructor

    public MutualFund(String n) {
        this.name = n;
    }

    public static void main(String[] args) {
        MutualFund mf1 = new MutualFund("UP STOCKS");
        mf1.setStockPrice(600);

        System.out.println("mf1.getName :" + mf1.getName());
        System.out.println("mf1.getStockPrice :" + mf1.getStockPrice());

        MutualFund mf2 = mf1;
        mf2.setStockPrice(700);
        System.out.println("mf2.getName :" + mf2.getName());
        System.out.println("mf2.getStockPrice :" + mf2.getStockPrice());

        // memory location for mf1 and mf2
        System.out.println("mf1  : " + mf1);
        System.out.println("mf2  : " + mf2);

    }
}
