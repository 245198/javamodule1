package oopsday3;

public class RunClass {

	public static void main(String[] args) {
		MathIMBL obj = new MathIMBL();
		System.out.println("Factorial: "+obj.factorial(5));
		System.out.println(obj.area(3,4));
		System.out.println(obj.perimeter(4, 5));
		obj.armstrong(153);
		boolean f = obj.primeNum(56);
		if(f==false)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
		
		System.out.println(obj.reverseNum(523));
		int posneg = obj.positiveNeg(-1);
		if(posneg == 1 )
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("Negative number");
		}
		
		System.out.println(obj.sumNum(7));
		System.out.println(obj.sumSqr(7));
		obj.swapNum(7, 2);

	}

}
