package afridcorp;

public interface Bank {
    float rateOfInterest();
}
class SBI implements Bank{
    final static float RATE_OF_INTEREST = 9.15f;

    public float rateOfInterest(){
       float RATE_OF_INTEREST= 10.1f;
        return RATE_OF_INTEREST;
    }
}
class PNB implements Bank{
    final static float RATE_OF_INTEREST = 9.7f;

    public float rateOfInterest(){
        return RATE_OF_INTEREST;
    }
}
class TestInterface2{
    public static void main(String[] args){
        Bank b=new SBI();
        System.out.println("ROI: "+b.rateOfInterest());
        System.out.println("ROI: "+b.rateOfInterest());
    }}
