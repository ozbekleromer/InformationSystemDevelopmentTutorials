package ozbek.BYT45.Chain;

/**
 * created by ozbek on 2021-01-01
 */
public class Request {

    private int num1;
    private int num2;

    private String operation;

    public Request(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }
}
