package userdefinedobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class FrequencyHashMapTest {

	public static void main(String[] arg)
	{
		String str1 = "The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is desired.Bags or multisets (unordered collections that may contain duplicate elements) should implement this interface directly.All general-purpose Collection implementation classes (which typically implement Collection indirectly through one of its subinterfaces) should provide two \"standard\" constructors: a void (no arguments) constructor, which creates an empty collection, and a constructor with a single argument of type Collection, which creates a new collection with the same elements as its argument. In effect, the latter constructor allows the user to copy any collection, producing an equivalent collection of the desired implementation type. There is no way to enforce this convention (as interfaces cannot contain constructors) but all of the general-purpose Collection implementations in the Java platform libraries comply.";
		String str = "hello world hello mainn print print ";
		String[] strArr = str1.split(" ");
		HashMap<String,Integer> map1 = new HashMap<>();
		System.out.println(strArr.length);
		for(String s :strArr)
		{
			if(map1.get(s)==null)
			{
				map1.put(s, 1);
			}
			else
			{
				int i = map1.get(s);
				i++;
				map1.put(s, i);
			}
		}
		System.out.println(map1);	
	}
}


