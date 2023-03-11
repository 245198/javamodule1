package testlambdas;
interface Shape
{
	double area();
	//not allowed 
	//double perimeter();
}

interface Math
{
	double power(int b,int e);
}
public class Example1 {

	public static void main(String[] args) {
		int a=90;
		
		//Anonymous class
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				System.out.println("from run method");
			}
					
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		Math m = ( b, e) -> {
			int p = 1;
			for(int i=1;i<=e;i++)
			{
				p *=b;
			}
			return p;
		};
		Shape s = () ->{
						return 0.0;
						};
						
						
		//implementing built-in interface
						Runnable r = () ->{
							for(int i=1;i<5;i++)
							{
								System.out.println("in run method"+i+a);
							}
							//any local variables inside main method can be access inside lambda
						};
						Thread t = new Thread(r);
						t.start();
						double result = s.area();
						System.out.println(result);
						result = m.power(4, 2);
						System.out.println(result);
	}

}
