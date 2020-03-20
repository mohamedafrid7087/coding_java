package afridcorp.overloading;

public class CricketBall {
    public boolean favoriteBall(){
        return false;
    }
    public boolean favoriteBall(String testMatchBall){
        if(testMatchBall.equals("RedBall")){
            return true;
        } else {
            return false;
        }
    }
    public boolean favoriteBall(String practiceBall, int dhoniFavoriteNumber){
        if(practiceBall.equals("white ball") && dhoniFavoriteNumber>0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CricketBall ball = new CricketBall();
        System.out.println("favoriteBall() is given:" + ball.favoriteBall());
        System.out.println("favoriteBall(String testMatchBall) called: "+ ball.favoriteBall("RedBall"));
        System.out.println("favoriteBall(String practiceBall, int dhoniFavoriteNumber) called:" + ball.favoriteBall("white ball",7));

    }
}


