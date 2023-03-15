package oopsday4.composition;

import java.util.Objects;

public class Employee extends Person
{//extends : "is a relationship" ==>(person is an employee)
	private long empId;
	private String deptno;
	private double salary;
	private Address residenceAddress;
	private Address correspondenceAddress; 
	
	//has a relationship ==>composition==>car has a wheel==>employee has a address
	//object as instance variable(data member)
	public Employee() {
		
	}
	
	public Employee(String name, String gender, int age,long empId, String deptno, double salary, Address residenceAddress, Address correspondenceAddress) {
		super(name,gender,age);
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondenceAddress = correspondenceAddress;
	}

	public long getEmpId() {
		return empId;
	}

	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
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
