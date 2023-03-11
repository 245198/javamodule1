package statemachine;

public class BankDemo 
{

	double value;
	int dCount;
	
	public BankDemo() {
		// TODO Auto-generated constructor stub
	}

	public BankDemo(double value, int dCount) {
		super();
		this.value = value;
		this.dCount = dCount;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getdCount() {
		return dCount;
	}

	public void setdCount(int dCount) {
		this.dCount = dCount;
	}

	
	
}
