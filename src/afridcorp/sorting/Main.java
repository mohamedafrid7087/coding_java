package afridcorp.sorting;

public class Main {
    private int [] mathScore = {98, 99, 88, 94, 95, 94};

    public void sortMathScore(){
        int pass = 0;
        for(int i = 0; i<mathScore.length; i++){
            for(int j = 0; j<mathScore.length; j++){
                if(mathScore[i]< mathScore[j]){
                    int temp = mathScore[i];
                    mathScore[i] = mathScore[j];
                    mathScore[j]= temp;
                }
            }
            ++pass;
            System.out.println("Loop: " + pass);

        }
    }

    void printMathScore(){
        for(int eachScore:mathScore){
            System.out.println(eachScore+ " ");
        }

    }

    public static void main(String[] args) {
        Main mp = new Main();
        mp.sortMathScore();
        mp.printMathScore();
    }
}
