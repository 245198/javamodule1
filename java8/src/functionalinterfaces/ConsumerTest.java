package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Tamilnadu",
				"Telengana","Andhra Pradesh",
				"Kerala","Karnataka");
		
		
		Consumer consumer = (str) ->
		{
			System.out.println(str);
		};
		
		printStrings(strings,consumer);
		
	}
	public static void printStrings(List<String> strings,Consumer<String>c)
	{
		for(String str:strings)
		{
			c.accept(str);
		}
		
	}

}
