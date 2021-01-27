package ozbek.BYT45.Chain;

import java.util.Scanner;

/**
 * created by ozbek on 2021-01-01
 */
public class TestCalculatorChain {

    public static void main(String[] args) {

        CalculatorChain chain1 = new Add();
        CalculatorChain chain2 = new Subtract();
        CalculatorChain chain3 = new Multiply();
        CalculatorChain chain4 = new Divide();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Scanner scanner = new Scanner(System.in);
        String operation;
        do {
            System.out.print("1-'add'\n" +
                    "2-'subtract'\n" +
                    "3-'multiply'\n" +
                    "4-'divide'\n" +
                    "5-'exit'\n" +
                    "Please enter the operation: ");
            operation = scanner.next();

            if(!operation.equals("exit")) {
                System.out.print("Please enter first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Please enter second number: ");
                int num2 = scanner.nextInt();

                chain1.calculate(new Request(num1, num2, operation));
            }
        } while(!operation.equals("exit"));
    }
}
