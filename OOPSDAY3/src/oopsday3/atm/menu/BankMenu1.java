package oopsday3.atm.menu;
import java.util.*;
public class BankMenu1 
{
	Scanner sc = new Scanner(System.in);
	public BankMenu1() 
	{
	System.out.println("1.Create Account"+"\n"+"2.Deposit"+"\n"+"3.Withdraw"+"\n"+"4.BalanceEnquiry"+"\n"+"5.Exit");
	Account a1 = new Account(101,"John Doe","Savings",500);
	Account a2 = new Account(102,"Aneeta Roy","Savings",700);
	Account a3 = new Account(103,"Meera Doe","Savings",850);
	Account a4 = new Account(104,"John Doe","Savings",900);
	Account a5 = new Account(105,"John Doe","Savings",1500);
	BankOfAmerica2 boa = new BankOfAmerica2();
	boa.addAccount(a1);	
	boa.addAccount(a2);	
	boa.addAccount(a3);	
	boa.addAccount(a4);	
	boa.addAccount(a5);
	}

	public void menu()
	{
		System.out.println("Enter your choice 1..5");
		int choice = sc.nextInt();
	}
}
