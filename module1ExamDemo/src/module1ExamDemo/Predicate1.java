package module1ExamDemo;
import java.util.function.*;
public class Predicate1 {

	public static void main(String[] args) {

		Predicate<Integer> pr = (a)->(a>20);
		System.out.println(pr.test(34));
				
	}

}
