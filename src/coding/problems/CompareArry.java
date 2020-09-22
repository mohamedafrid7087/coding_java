package coding.problems;

class CompareArry{


    public static void main(String[] args) {
        int [] array1 ={1,2,3};
        int [] array2 = {1,2,3};

        boolean isSame = false;

        for(int i =0 ; i<array1.length; i++){
            isSame  =false;
            for(int j=0; j<array2.length; j++){
               if(array1[i]==array2[j]){
                   isSame=true;
                   break;
                }
            }
            if(!isSame){
                break;
            }
        }
        if(isSame){
            System.out.println("the array are same");
        }else{
            System.out.println("the arrays are not same");
        }
    }
}