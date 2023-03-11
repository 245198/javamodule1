package userdefinedobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmpArrayList {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 14000);

		Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 17000);

		Employee emp3 = new Employee("Aneeta Roy", "Female", 22, 103, "Sales", 35000);

		Employee emp4 = new Employee("Hari", "Male", 24, 104, "Research", 89000);

		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 14000);

		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		System.out.println(emplist);

	}

}
