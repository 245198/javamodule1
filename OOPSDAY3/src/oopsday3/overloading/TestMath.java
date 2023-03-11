package oopsday3.overloading;

public class TestMath 
{
	public static void main(String[] args) 
	{
		Math math = new Math();
		int result = math.add(10,20);
		System.out.println(result);
		result = math.add(10, 20,30);
		System.out.println(result);
		double result2 = math.add(23, 45);
		System.out.println(result2);
		result2 = math.add(12.9, 23, 10);
		System.out.println(result2);
		result2 = math.add(23L, 78L,23L);
		System.out.println(result2);
		result2 = math.add(67.5, 23.5);
		System.out.println(result2);
		
	}
	
	
}
