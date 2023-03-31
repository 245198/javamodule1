package kbademo.com;
import java.util.*;
public class classA {
	public static void sum1(int a,int b) throws Exception
	{
		if(a<0 || a>100)
		{
			throw new NullPointerException();
		}
		/*
		 * if(b==0) { throw new ArithmeticException("Divide by zero"); }
		 */
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Enter two numbers");
		Scanner sc =new Scanner(System.in);
		try
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum1(a,b);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid input");
		}
		

	
	}
	
	

}
