package module1ExamDemo;


public class B extends A1{
	   int i =   Math.round(3.5f);
	   public static void main(String[] args)  {
	      A1 a = new B();
	      a.print();
	   }
	  public  void print() { 
		   System.out.println(i); 
		   }
	}

