package structuralpatterns.adapter.phone.impl;

import structuralpatterns.adapter.phone.ifaces.LightingPhone;

public class Iphone implements LightingPhone{
	private boolean connector;
	
	@Override
	public void recharge()
	{
		if(connector)
		{
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
			
		}
		else
		{
			System.out.println("Connect Lighting finished");
		}
	}

	@Override
	public void useLighting()
	{
		connector=true;
		System.out.println("Lighting connected");
	}

}
