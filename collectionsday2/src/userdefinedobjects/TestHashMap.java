package userdefinedobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 14000);

		Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 17000);

		Employee emp3 = new Employee("Aneeta Roy", "Female", 22, 103, "Sales", 35000);

		Employee emp4 = new Employee("Hari", "Male", 24, 104, "Research", 89000);

		Employee emp5 = new Employee("John Doe", "Male", 24, 105, "Research", 14000);

		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);

		HashSet<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);

		TreeSet<Employee> empTreeSet = new TreeSet<Employee>();
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		HashMap<String,Collection> dataMap = new HashMap<>();
		dataMap.put("empList", emplist);
		dataMap.put("empSet", empSet);
		dataMap.put("empTreeSet", empTreeSet);
		System.out.println(dataMap);
		
		Collection<Employee> list = dataMap.get("empList");
		Iterator<Employee> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		Collection<Employee> set = dataMap.get("empSet");
		iter = set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		Collection<Employee> treeset = dataMap.get("empTreeSet");

		iter = treeset.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}