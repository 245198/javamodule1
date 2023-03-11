package functionalinterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Tamilnadu","Telengana","Andhra Pradesh",
				"Kerala","Karnataka");
		
		Function<String,Integer> f = (str)->{
			return str.length();
			};
			System.out.println(f.apply("2hell o30"));
			
			Function <Integer,Integer> f2 = (n) ->
			{
				return n*n;
			};
			System.out.println(f2.apply(25));
			Function<String,String> f3=(str)->{
				return str.toUpperCase();
				
			};
			for(String str:strings)
			{
				System.out.println(f.apply(str));
			}
			//System.out.println(f3.apply("Kulathoor UST"));
	}

}
