package functionalinterfaces;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class SupplierTest {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Tamilnadu",
				"Telengana","Andhra Pradesh",
				"Kerala","Karnataka");
	
	Supplier <String> supplier = () ->
	{
		return new String("Hello");
	};
	System.out.println(supplier.get());
	}
	public static void fetchStrings(List<String> strings, Supplier<String> s)
	{
		for(String str:strings)
		{
			s.get();
		}
	}
	
}

