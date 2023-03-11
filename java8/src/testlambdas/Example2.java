package testlambdas;
interface factorial
{
	double fact(int n);
}

public class Example2 {

	public static void main(String[] args) 
	{
		factorial f =(n) ->{
			
			int fac =1;
			if(n<=0)
			{
				return 1;
			}
			else
			{
				for(int i=2;i<=n;i++)
				{
					fac *=i;
				}
				return fac;
			}
		};
		
		double result = f.fact(5);
		System.out.println(result);

	}

}
