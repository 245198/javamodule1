package oopsday4.statictest;

public class StaticDemo2 
{
	int a;
	public static void method()
	{
		System.out.println("Inside method");
		//method2();
		//non static
		
	}
	void method2()
	{
		method();
	}
	
	
	

}
