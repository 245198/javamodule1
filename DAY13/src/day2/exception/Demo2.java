package day2.exception;

public class Demo2 {

	public static void main(String[] args) {
		int d = 10/0;
		throw new ArithmeticException("/ by zero is not possible");

	}

}
