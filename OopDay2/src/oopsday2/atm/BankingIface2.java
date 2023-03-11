package oopsday2.atm;

public interface BankingIface2
{
	public double withdraw(double amount,int acctno); //all functions in an interface is implicitly abstract
	public double deposit(double amount,int acctno);
	public double balanceEnquiry(int actno);
}
