package ozbek.BYT45.Chain;

/**
 * created by ozbek on 2021-01-01
 */
public class Divide implements CalculatorChain {

    private CalculatorChain nextChain;

    @Override
    public void setNextChain(CalculatorChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Request request) {
        if(request.getOperation().equals("divide")){
            System.out.println(request.getNum1() + " / " + request.getNum2() + " = " + (request.getNum1()/request.getNum2()));
        } else {
            System.out.println("Only works for 'add', 'subtract', 'multiply', and 'divide'");
        }
    }
}
