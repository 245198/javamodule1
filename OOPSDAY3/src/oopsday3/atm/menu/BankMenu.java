package oopsday3.atm.menu;
import java.util.*;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountException;



public class BankMenu 
{
	public BankMenu() 
	{
		
	}
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
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
		while(true)
		{
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter account number: ");
					int actno = sc.nextInt();
					boa.displayAccount(actno);
					break;
				}
				case 2:
				{
					System.out.println("Enter accountno: ");
					int actno = sc.nextInt();
					System.out.println("Enter deposit amount: ");
					int val = sc.nextInt();
					try {
						double balance = boa.deposit(val, actno);
						//System.out.println("Balance: "+boa.deposit(val, actno));
					} catch (NegativeAmountException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case 3:
				{
					System.out.println("Enter accountno:");
					int actno = sc.nextInt();
					System.out.println("Enter withdraw amount: ");
					int val = sc.nextInt();
					double balance =0;
					try 
					{
					
						balance = boa.withdraw(balance, actno);
						System.out.println("Balance: "+boa.withdraw(val, actno));
					} 
					catch (InsufficientFundsException e) {
						e.printStackTrace();
					}
					break;
				}
				case 4:
				{
					System.out.println("Enter accountno:");
					int actno = sc.nextInt();
					System.out.println("Balance: "+boa.balanceEnquiry(actno));
					break;
				}
				case 5:
				{
					System.out.println("Exiting...");
					System.exit(0);
					
				}
			}
			
		}
		
		
	}
	

}
