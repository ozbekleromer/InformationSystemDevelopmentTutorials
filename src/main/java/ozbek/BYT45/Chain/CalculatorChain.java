package ozbek.BYT45.Chain;

/**
 * created by ozbek on 2021-01-01
 */
public interface CalculatorChain {

    public void setNextChain(CalculatorChain nextChain);

    public void calculate(Request request);

}
