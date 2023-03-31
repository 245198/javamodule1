package kbademo.com;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		
		input = input.toLowerCase();
		String [] strArr = input.split("[\\s,.;:/!?]");
		
		HashMap<String,Integer> map = new HashMap<>();
		for(String str:strArr)
		{
			System.out.println(str);
			
			if(map.get(str)!=null)
			{
				int count = map.get(str);
				count++;
				map.put(str, count);
			}
			else
			{
				map.put(str, 1);
			}
		}
		System.out.println(map);
		
		
	}

}
