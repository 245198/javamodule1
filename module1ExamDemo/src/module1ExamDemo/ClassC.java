package module1ExamDemo;


interface Iface3
{
	public double method4(int a);
}

public class ClassC {

	public static void main(String[] args) {
		
		Iface3 f3 = (int a)->(a);
		f3.method4(4);
		
	}

}