package oopsday4.inheritence;

public class CompanyHR {

	public static void main(String[] args) 
	{
		/*
		 * Employee emp1 = new Employee("John Doe","Male",24,101,"Research",14000);
		 * System.out.println(emp1); Employee emp2 = new
		 * Employee("Jane Doe","Female",23,102,"Accounting",17000);
		 * System.out.println(emp2); Employee emp3 = new
		 * Employee("Aneeta Roy","Female",22,103,"Sales",35000);
		 * System.out.println(emp3); Employee emp4 = new
		 * Employee("Hari","Male",24,104,"Research",89000); System.out.println(emp4);
		 * Employee emp5 = new Employee("John Doe","Male",24,101,"Research",14000);
		 * System.out.println(emp5); if(emp1.equals(emp5)) {
		 * System.out.println("The objects are same"); } else {
		 * System.out.println("The objects are not same"); }
		 * Even though the values of objects are same ,the hashcode is different
		 */
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",14000);
		System.out.println(emp1);
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",17000);
		System.out.println(emp2);
		Employee emp3 = new Employee("Aneeta Roy","Female",22,103,"Sales",35000);
		System.out.println(emp3);
		Employee emp4 = new Employee("Hari","Male",24,104,"Research",89000);
		System.out.println(emp4);
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",14000);
		System.out.println(emp5);
		if(emp1.equals(emp5))
		{
			System.out.println("The objects are same");
		}
		else
		{
			System.out.println("The objects are not same");
		}
		
	}

}
