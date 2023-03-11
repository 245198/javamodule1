package listdemo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.iterator;
public class TestHashMap {

	public static void main(String[] args) {

		HashMap<String,String> countryCurr = new HashMap<>();
		countryCurr.put("IND", "Rupe");
		countryCurr.put("USA", "Dollar");
		countryCurr.put("UK", "Pound");
		countryCurr.put(null, null);
		System.out.println(countryCurr);
		System.out.println(countryCurr.get("IND")); 
		//get(key) : to obtain object
		countryCurr.put("IND","Rupee"); 
		//replace old value with new value
		System.out.println(countryCurr);
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Dollar"));
		
		//HashMap has three views 
		//1. key view
		
		Set<String> keys = countryCurr.keySet();
		for(String key :keys)
		{
			System.out.println(key);
		}
		
		//2.Value view
		Collection<String> values = countryCurr.values();
		for(String value:values)
		{
			System.out.println(value);
		}
		
		//3.Key values together - EntrySet
		Set<Entry<String,String>> entries = countryCurr.entrySet();	
		for(Entry<String,String> entry : entries)
		{
			System.out.println(entry);
		}
		}

}
