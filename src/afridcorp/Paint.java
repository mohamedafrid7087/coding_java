package afridcorp;

public class Paint {

    public boolean paintColor() {
        return false;
    }

    public boolean paintColor(String roomColor) {
        if (roomColor.equals("blue")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean paintColor(String kitchenColor, String hallColor) {
//        return (kitchenColor.equals("red") && hallColor.equals("yellow")) ? true : false;
        if(kitchenColor.equals("red") && hallColor.equals("yellow")){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        System.out.println("paintColor() Color painted:" + paint.paintColor());
        System.out.println("paintColor(String roomColor) called: " + paint.paintColor("blue"));
        System.out.println("paintColor(String kitchenColor, String hallColor) called:" + paint.paintColor("red", "yellow"));

    }
}



