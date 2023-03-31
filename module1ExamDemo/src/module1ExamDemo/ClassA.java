package module1ExamDemo;

@FunctionalInterface
interface iface1
{
	void method1();
	default void method2()
	{
		System.out.println("hello");
	}
}

class ClassB implements iface1
{
	@Override
	public void method1()
	{
		System.out.println("Hello world");
	}
}

class ClassA
{
	public static void main(String[] args) {
		iface1 obj1 = new ClassB();
		obj1.method1();
	}
}