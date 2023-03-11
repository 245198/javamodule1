package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula{
	public void m1();
}

class Some{
	public static void m2()
	
	{
		System.out.println("from m2...");
	}
}
class Other{
	Other()
	{
		System.out.println("from other constructor");
	}
}
public class TestmethodRefs {

	public static void main(String[] args) {

		Formula f = Some::m2;
		f.m1();
		f = Other::new; 
		List<String> list =Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);
		List<Integer> intList = Arrays.asList(12,23,45,66,75);
		Optional<Integer> num = intList.stream().reduce(Math::max);
		System.out.println(num.get());
		
	}

}
