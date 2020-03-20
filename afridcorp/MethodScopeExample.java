package afridcorp;

public class MethodScopeExample {

    public void methodA() {
        Integer area = 2;
    }

    public void methodB() {
        Integer area = 5;
    }

    public static void main(String[] args){
        MethodScopeExample scopeMethod = new MethodScopeExample();

    }
}
