package kbademo.com;

public class NewException extends RuntimeException{
	NewException(String msg) throws ArithmeticException
	{
		super(msg);
		System.out.println(msg);
	}

}
