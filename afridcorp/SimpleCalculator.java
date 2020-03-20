package afridcorp;

class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    double getFirstNumber() {
        return this.firstNumber;
    }

    double getSecondNumber() {
        return this.secondNumber;
    }

    double setFirstNumber(double calc) {
        return this.firstNumber = calc;
    }

    double setSecondNumber(double calc2) {
        return this.secondNumber = calc2;
    }

    double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    double getDivisionResult() {
        if (this.secondNumber==0){
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(9);
        simpleCalculator.setSecondNumber(1);

        System.out.println(simpleCalculator.getAdditionResult());
        System.out.println(simpleCalculator.getSubtractionResult());
        System.out.println(simpleCalculator.getMultiplicationResult());
        System.out.println(simpleCalculator.getDivisionResult());

    }
}
