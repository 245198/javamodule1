package module1ExamDemo;


interface Iface2
{
	public void method4();
}

public class Class2 implements Iface2{
	
	public void method4()
	{
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Iface2 f2 = new Class2();
		f2.method4();
		
	}

}
