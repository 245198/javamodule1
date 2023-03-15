package testlambdas;

public class LambdaSwitchCase {
	static double calculate(String operator,double x,double y) 
	{
		return switch(operator)
				{
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" ->{
			if(y==0)
			{
				throw new IllegalArgumentException("Can't divide by zero");
			}
			yield x/y;
		}
		default -> throw new IllegalArgumentException("unknwon operator");
	};
	}

	public static void main(String[] args) {
		LambdaSwitchCase lsc = new LambdaSwitchCase();
		lsc.calculate("+", 4, 10);
		lsc.calculate("/", 4, 2);
		lsc.calculate("*", 14, 2);
		lsc.calculate("+", 4, 1);
		lsc.calculate("/", 4, 1);
	}
}