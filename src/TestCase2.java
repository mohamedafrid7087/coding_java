package afridcorp;

abstract class ThemeMusic{
    abstract void play();
}
class Rahman extends ThemeMusic{
   void play(){
       System.out.println("music");
   }

}
public class TestCase2 {
    public static void main(String[] args){
        ThemeMusic thememusic = new Rahman();
        thememusic.play();
    }
}
