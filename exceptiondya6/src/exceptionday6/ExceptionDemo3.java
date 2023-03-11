package exceptionday6;

public class ExceptionDemo3 {

	public static void main(String[] args) 
	{
		
		System.out.println("Program task begins");
		try
		{
			System.out.println("Entered try.....");
			int c = 10/0;
			System.out.println("from try after exception.....");
		}
		catch(Exception e)
		{
			System.out.println("from catch.....");
		}
		/*
		 * catch(ArithmeticException e) { e.printStackTrace(); }
		 */
		finally
		{
		System.out.println("From finally");
		}
		
		System.out.println("Program completed task.");
	}

}
