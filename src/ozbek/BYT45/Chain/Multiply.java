package ozbek.BYT45.Chain;

/**
 * created by ozbek on 2021-01-01
 */
public class Multiply implements CalculatorChain {

    private CalculatorChain nextChain;

    @Override
    public void setNextChain(CalculatorChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Request request) {
        if(request.getOperation().equals("multiply")){
            System.out.println(request.getNum1() + " x " + request.getNum2() + " = " + (request.getNum1()*request.getNum2()));
        } else {
            nextChain.calculate(request);
        }
    }
}
