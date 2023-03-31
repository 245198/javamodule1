package kbademo.com;
import java.util.*;

public class WordCount2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		
		input = input.toLowerCase();
	
		String [] strArr = input.split("[\\s,.;:/!?]");
		List<String> arrLis = Arrays.asList(strArr);
		Map<String,Integer> map1 = new TreeMap<>();
		for(String str:arrLis)
		{
			System.out.println(str);
			int c = Collections.frequency(arrLis, str);
			map1.put(str, c);
		}
		System.out.println(map1);
	}
	
}