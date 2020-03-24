package afridcorp;

public class Payment {
    public boolean doPayment(){
        return false;
    }
    public boolean doPayment(int cash){
        return (cash>0) ? true : false;
//        if(cash>0){
//            return true;
//        }else {
//            return false;
//        }
    }
    public boolean dopayment(String netBanking, int aadharCardNo){
        return (aadharCardNo>0 && netBanking.equals("icici")) ? true : false;
//        if(aadharCardNo>0 &&netBanking.equals("icici")){
//            return true;
//        } else {
//            return  false;
//        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println("dopayment() payment done:" + payment.doPayment());
        System.out.println("dopayment() called: "+ payment.doPayment(10));
        System.out.println("dopayment(String paytm, int aadhaarCardNo) called:" + payment.dopayment("icici",123454));
    }
}
