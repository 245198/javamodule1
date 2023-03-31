package module1ExamDemo;

//Lambda With parameters

	interface Iface4
	{
		public int method4(int a);
	}

	public class Class3 {

		public static void main(String[] args) {
			
			Iface4 f3 = (a)->(a);
			f3.method4(22);
			
		}

	}


