package oopsday2.atm;

public class BankTranscations2 {

	public static void main(String[] args) {

		Account a1 = new Account(101,"John Doe","Savings",500);
		Account a2 = new Account(102,"John Doe","Savings",700);
		Account a3 = new Account(103,"John Doe","Savings",850);
		Account a4 = new Account(104,"John Doe","Savings",500);
		Account a5 = new Account(105,"John Doe","Savings",500);
		
		BankOfAmerica2 boa = new BankOfAmerica2();
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
		
		System.out.println(boa.balanceEnquiry(103));
		double result = boa.deposit(100, 103);
		System.out.println(result);
		result = boa.withdraw(50, 103);
		System.out.println(result);

	}

}
