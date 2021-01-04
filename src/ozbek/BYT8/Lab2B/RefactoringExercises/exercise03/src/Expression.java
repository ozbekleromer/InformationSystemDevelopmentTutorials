package ozbek.BYT8.Lab2B.RefactoringExercises.exercise03.src;

public class Expression {

	private final char op;

	private Expression left;

	private Expression right;

	private int constant;

	// "op" property changed to final because its initialized at constructor and never changed
	// At "evaluate" method, instead of writing several returns, changed to return switch operation

	public Expression(int constant) {
		this.op = 'c';
		this.constant = constant;
	}

	public Expression(char op, Expression left, Expression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public int evaluate() {
		return switch (op) {
			case 'c' -> constant;
			case '+' -> left.evaluate() + right.evaluate();
			case '-' -> left.evaluate() - right.evaluate();
			case '*' -> left.evaluate() * right.evaluate();
			case '/' -> left.evaluate() / right.evaluate();
			default -> throw new IllegalStateException();
		};
	}
}
