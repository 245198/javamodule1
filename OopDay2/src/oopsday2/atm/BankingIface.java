package oopsday2.atm;

public interface BankingIface
{
	public double withdraw(double amount); //all functions in an interface is implicitly abstract
	public double deposit(double amount);
	public double balanceEnquiry(int actno);

}
