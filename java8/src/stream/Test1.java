package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("sun");
		list.add("moon");
		list.add("jupiter");
		list.add("uranus");
		list.add("pluto");
		list.add("mars");
		list.add("venus");
		Predicate<String> p =(str)->{
			return (str.length()>3 || str.length()<10);
		};
		Function<String,String> f=(str)->{
			return str.toUpperCase();
		};
		
		
		long count = list.stream().filter(p).count();
		System.out.println(count);
		List<String> outlist = list.stream().map(f).collect(Collectors.toList());
		System.out.println(outlist);
		Consumer <String> c = (str)->{
			System.out.println(str);
		};
		list.stream().forEach(c);
		//list.stream().forEach(System.out::println);
		//List<String> outlist = list.stream().map((str)->str.toUpperCase()).collect(Collectors.toList());
		
		list.stream().filter(p).map(f).forEach(c);
	}

}
