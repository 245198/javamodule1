package exceptionday6;

import java.util.*;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Program task begins");

		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = b / a; // POINT OF EXCEPTION
			System.out.println("result: " + c);
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot / by zero");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Invalid Input format");
		}
		System.out.println("Program task completed");

	}
}
