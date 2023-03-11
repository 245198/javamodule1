package oopsday3.line;
import java.util.*;
public class RumDemo {

	public static void main(String[] args) 
	{
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the coordinates of first point: "); int a =
		 * sc.nextInt(); int b = sc.nextInt(); Points p1 = new Points(a,b);
		 * System.out.println("Enter the coordinates of second point: "); a =
		 * sc.nextInt(); b = sc.nextInt(); Points p2 = new Points(a,b);
		 */
		/*
		 * System.out.println("Horizontal line"); int x = p1.getX(); int y = p2.getX();
		 * MethodDemo m1 = new MethodDemo(); m1.calLine(x, y);
		 */
		
		
		
		
		Scanner sc = new Scanner(System.in);
		Points[] parray1 = new Points[3];
		private int accountIndex = 0;
		
		for(int i=0;i<parray1.length;i++)
		{
			System.out.println("Enter the coordinates of first point: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			parray1[i].setX(a);
			parray1[i].setY(b);
		}
		

	}

}
