package module1ExamDemo;

import java.util.function.BiConsumer;
import java.util.HashMap;
import java.util.Map;

public class ForEachJava8 {

	public static void main(String[] args) {

		Map<String,Integer> map1 = new HashMap<>();
		map1.put("Aneeta",78);
		map1.put("Hari", 89);
		map1.put("Hello", 11);
		//map1.forEach((k,v)->System.out.println("Key: "+k+"		Value: "+v));
		BiConsumer<String,Integer> c1 =(k,v)->{
			System.out.println(k+" "+v);
			};
			map1.forEach(c1);
			
		
	}

}
