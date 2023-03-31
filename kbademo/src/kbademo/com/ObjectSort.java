package kbademo.com;
import java.util.*;
public class ObjectSort {
	

	public static void main(String[] args) {
		
		Set<ComparableDemo> s1 = new TreeSet<>();
		s1.add(new ComparableDemo(100,"Aneeta"));
		s1.add(new ComparableDemo(20,"Hello"));

		for(ComparableDemo c1:s1)
		{
			System.out.println(c1.name+" "+c1.id);
		}
	}

}
