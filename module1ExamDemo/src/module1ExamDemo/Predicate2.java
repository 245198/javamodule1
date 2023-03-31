package module1ExamDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Predicate2 {
	public void checkLength(List<String> ls,Predicate p)
	{
		for(String str:ls)
		{
			System.out.println(p.test(str));
		}
		
	}
	
	public static void main(String[] args) {
		
	List<String> list = Arrays.asList("aneeta","raniya","Emmushine");
	Predicate <String> p = (str)->
	{
		
	return str.length()>6;
	};
	
	Predicate2 p1 = new Predicate2();
	p1.checkLength(list,p);
	
	

}
}
