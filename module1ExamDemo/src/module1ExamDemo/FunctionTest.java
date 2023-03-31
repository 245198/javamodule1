package module1ExamDemo;
import java.util.function.*;
public class FunctionTest {

	public static void main(String[] args) {

		Function<String,String> f1 = (str1)->
		{
			return str1.toUpperCase();
		};
		System.out.println(f1.apply("aneeta"));
	}

}
