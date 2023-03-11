package oopsday3.line;

import oopsday3.atm.menu.Account;

public class MethodDemo {
	
	
	public void calLine(int x1,int x2)
	{
		for(int i=0;i<x1;i++)
		{
			System.out.print(" ");
		}
		for(int i = x1;i<=x2;i++)
		{
			System.out.print(".");
		}
	}

}
