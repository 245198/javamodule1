package testException;

public class InvalidTranscationAmountException extends RuntimeException 
{
	public InvalidTranscationAmountException(String message)
	{
		super(message);
	}
	
}
