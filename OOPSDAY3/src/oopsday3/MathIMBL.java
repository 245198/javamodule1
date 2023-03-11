package oopsday3;
import java.lang.Math.*;
public class MathIMBL implements MathIface 
{
	

	@Override
	public int factorial(int n) 
	{
		int fact = 1;
		if(n<=0)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact = fact*i;
			}
			return fact;
		}
		
	}

	@Override
	public double area(int length,int breadth) 
	{
		double areaCal = length * breadth;
		return areaCal;
		
	}

	@Override
	public double perimeter(int length,int breadth) 
	{
		double periCal = 2*(length + breadth);
		return periCal;
	}

	@Override
	public void armstrong(int n) 
	{
		int dup = n,r,val=n,count = 0;
		double sum=0;
		while(n>0)
		{
			count++;
			n=n/10;
			
		}
		
		while(val > 0)
		{
			 r = val%10;
			 sum = sum + Math.pow(r, count);
			 val = val/10;
		}
		if(sum == dup)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
		
		
	}

	@Override
	public boolean primeNum(int n) 
	{
		int flag =0;
		if(n ==0 || n==1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag = 1;
					break;
				}
			}
		}
		
		if(flag ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int reverseNum(int n) 
	{
		int dup = n,sum = 0,r;
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		return sum;
	}

	@Override
	public int positiveNeg(int n) 
	{
		if(n>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public double sumNum(int n) 
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum += i;
		}
		
		return sum;
	}

	@Override
	public double sumSqr(int n) 
	{
		double sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum = sum +(i*i);
		}
		return sum;
	}

	@Override
	public void swapNum(int num1,int num2) 
	{
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1+" "+num2);

	}

}
