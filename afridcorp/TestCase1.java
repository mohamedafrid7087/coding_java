package afridcorp;

interface Music{
    void play();
}
class RahmanClass implements Music{
    public void play(){
        System.out.println(" show premise shortly");
    }

}
public class TestCase1 {

    public  static void main(String[] args){
        RahmanClass obj1 = new RahmanClass();
//        Music obj = new Rahman();
//       obj.play();
        obj1.play();
    }
}
