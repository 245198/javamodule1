package module1ExamDemo;
import java.util.function.*;
import java.util.Scanner;
public class FunctionTest2 {
	
	static public void method2(String str,Function f1)
	{
		System.out.println(f1.apply(str));
	}

	static public void method3(String str,String str1,BiFunction<String, String, Integer> f2)
	{
		System.out.println(f2.apply(str, str1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str3 = sc.nextLine();
		Function<String,String> f1 = (str)->
		{
			return str.toUpperCase();
		};
		method2(str3,f1);
		BiFunction<String,String,Integer> f2 = (str1,str2) ->
		{
			return str1.length()+str2.length();		
		};
		System.out.println("Enter two strings: ");
		String s1 = sc.next();
		String s2 = sc.next();
		method3(s1,s2,f2);
		
	}

}
