package module1ExamDemo;

class NewException extends Exception {}

class AnotherException extends Exception {}

public class ExcceptionTest
{
   public static void main(String [] args) throws Exception
   {
      try
      {
         m2();
      }
		/*
		 * catch(Exception e) { System.out.println(e); }
		 */
      finally{ m3(); }
    }
    public static void m2() throws NewException{  throw new NewException();  }
    public static void m3() throws AnotherException{  throw new AnotherException();  }
}

//only another exception which is invoke by finally
//the exception thrown by try() is not handled by any catch block