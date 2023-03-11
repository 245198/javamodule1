package testlambdas;


@FunctionalInterface
public interface TestInterface {
	public double method();
	
	public default void method2()
	{
		System.out.println("from methods2");
	}
	public static void method3()
	{
		System.out.println("from staic method");
	}

}
