package userdefinedobjects;

import java.util.HashSet;
import java.util.Iterator;

public class TestEmpHashSet {

	public static void main(String[] args) {
		
	     HashSet<Employee> empSet = new HashSet<Employee>();
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 14000);

		Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 17000);

		Employee emp3 = new Employee("Aneeta Roy", "Female", 22, 103, "Sales", 35000);

		Employee emp4 = new Employee("Hari", "Male", 24, 104, "Research", 89000);

		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 14000);

		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		System.out.println(empSet);
		System.out.println(empSet.size());

	}

}
