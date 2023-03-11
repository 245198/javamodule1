package statemachine;
import java.util.Scanner;

public class Ifunction implements StateIface 
{
	public Ifunction() {
		Scanner sc  = new Scanner(System.in); 
	}
	
	int index =0;
	
	double amt;
	BankDemo [] objArr = new BankDemo[7];
	int f=0;

	@Override
	public double Amount() 
	{
		
		objArr[0] = new BankDemo(10,3);
		objArr[1] = new BankDemo(20,5);
		objArr[2] = new BankDemo(50,23);
		objArr[3] = new BankDemo(100,5);
		objArr[4] = new BankDemo(200,13);
		objArr[5] = new BankDemo(500,15);
		objArr[6] = new BankDemo(2000,13);
		
		
		loop1:do
		{
			System.out.println("Enter Amount: ");
			Scanner sc  = new Scanner(System.in); 
			amt = sc.nextDouble();
			double dtn2 = Denomination(); //200 note
			if(amt % dtn2 != 0)
			{
				f++;
				System.out.println(f);
				//System.out.println("Enter a valid Amount ");
				continue loop1;
			}
			else
			{
				int flag =0;
				int count1=0;
				int i;
				for(i=0;i<objArr.length;i++)
				{
					double val = objArr[i].getValue(); 
					if(val == dtn2)
					{
						flag++;
						count1 = objArr[i].getdCount();
						f++;
						break ;
						
					}
				}
				
				if(flag==0)
				{
					f++;
					System.out.println("Enter a valid Denoamination ");
					continue loop1;
				}
				else
				{
					int r = (int) (amt/dtn2);
					if(r>=count1)
					{
						System.out.println("Amount Dispensded :"+dtn2+"*"+r);
						f++;
						objArr[i].dCount = (objArr[i].dCount) - count1;
						break;

					}
					else
					{
						f++;
						System.out.println("Enter a valid Amount: ");
						
					}
					
				}
			}
				
		}while(f<3);
		if(f==0)
		{
			System.out.println("Account Blocked Try after 24 Hours");
		}
		return 0;
	}

	@Override
	public double Denomination() 
	{
		System.out.println("Denominations Available");
		
			for(int i=0;i<objArr.length;i++)
			{
				System.out.println(objArr[i].value);
				
			}
		System.out.println("Enter the denomination: ");
		Scanner sc  = new Scanner(System.in); 
		double dtn1 = sc.nextInt();
		return dtn1;
	}

	@Override
	public double Balance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
