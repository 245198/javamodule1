package Demo2;

public class NewDemo {

	public static void main(String[] args) {

		NewMethod1();
	}

	public static void NewMethod1() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		NewMethod1();
	}
	
	public void NewMethod2()
	{
		int c= 89;
	}

}
