package testException;

import junit.framework.Test;

public class TellerTest {
	Teller teller = new Teller();
	
	
@Test(expected =IllegalAccessException.class)
	public void testValidateUnexpectedCurrency()
	{
		teller.validateTransaction("AUST", 100);
	}
	
@Test(expected =InvalidTranscationAmountException.class)
	public void testValidateNegativeAmount()
	{
		teller.validateTransaction("EUR", -100);
	}

}
