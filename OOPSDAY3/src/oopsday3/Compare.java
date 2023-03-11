package oopsday3;

public class Compare {

	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		//Compare primitives
		int a = 10;
		int b = 35;
		
		boolean result = a==b;	//false
		 
		/*
		 * Comparing objects
		 * Case 1: Comparing references
		 * Case 2: Comparing members
		 */
		
		result = r1==r2;
		System.out.println(result);	//false
		
		//result=r1==t1; //error:types mismatch
		
		Rectangle r3 = r1;
		System.out.println(r3 == r1);//true : without new keyword same object is referenced.
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		
		result = r1.equals(r3);
		System.out.println(result);
		
		r1.setLength(35.5);
		r1.setBreadth(75.45);
		
		r2.setLength(35.5);
		r2.setBreadth(75.45);
		
		if(r1.getBreadth()==r2.getBreadth() && r2.getLength() == r1.getLength())
		{
			System.out.println("They have same length and breadth");
		}
		else
		{
			System.out.println("They not have same length and breadth");
		}
		
		
		
	}

}
