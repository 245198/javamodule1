package userdefinedobjects;

import java.util.TreeSet;
import java.util.Iterator;

public class TestEmpTreeSet {

	public static void main(String[] args) {
		
	     TreeSet<Employee> empTreeSet = new TreeSet<Employee>();
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 14000);

		Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 17000);

		Employee emp3 = new Employee("Aneeta Roy", "Female", 22, 103, "Sales", 35000);

		Employee emp4 = new Employee("Hari", "Male", 24, 104, "Research", 89000);

		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 14000);

		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		System.out.println(empTreeSet);
		System.out.println(empTreeSet.size());

	}

}
