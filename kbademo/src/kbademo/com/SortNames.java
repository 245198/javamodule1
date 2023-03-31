package kbademo.com;
import java.util.*;
public class SortNames {

	public static void main(String[] args) {
		String s1="hello";
		
		String s2 = "Aneeta";
		String s3 = "Main";
		Set<String> set1 = new TreeSet<>(new ComparatorDemo());
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);

		System.out.println(set1);
	}

}
