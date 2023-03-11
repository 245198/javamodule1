package oopsday4.inheritence;

import java.util.Objects;

public class Employee extends Person
{
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
	
	
	/*
	 * @Override public int hashCode() { int code = this.hashCode() * 32 *
	 * ((int)this.empId) * (this.getName().length())*this.deptno.length(); return
	 * super.hashCode(); }
	 */
	
	

}
