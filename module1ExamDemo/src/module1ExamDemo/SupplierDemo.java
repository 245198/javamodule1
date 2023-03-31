package module1ExamDemo;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Integer> supplier2 = () -> 7;    
	      System.out.println(supplier2.get());
	}

}
