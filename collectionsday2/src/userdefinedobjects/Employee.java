package userdefinedobjects;

import java.util.Objects;

public class Employee extends Person implements Comparable
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(deptno, empId, salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empId == other.empId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	private long empId;
	private String deptno;
	private double salary;
	public Employee() {
		
	}
	
	public Employee(String name, String gender, int age,long empId,String deptno,double salary) 
	{
		super(name, gender, age);
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDeptno() {
		return deptno;
	}

	

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee ref = null;
		if( o != null)
		{
			ref = (Employee) o;
		}
		if(this.empId < ref.getEmpId())
		{
			return -1; //ascending order: the return value should be negative
		}
		else if(this.empId > ref.getEmpId())
		{
			return 1; //descending order: the return value should be positive
			
		}
		else
			return 0;
	}
	
}
