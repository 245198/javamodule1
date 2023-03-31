package module1ExamDemo;

import java.util.Scanner;

interface iface7 {
	public int method1(int start, int end);
}

public class Lamda2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		iface7 obj1 = (int n, int n2) -> (n+n2);
		/*
		 * {
		 * 
		 * int sum=0; for(int i=n;i<=n2;i++) { sum+=i; }
		 * 
		 * return sum; };
		 */
		System.out.println("Sum of number between" + a + " " + b + " = " + obj1.method1(a, b));

	}

}
