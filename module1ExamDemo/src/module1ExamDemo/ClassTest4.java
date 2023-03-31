package module1ExamDemo;

public class ClassTest4
{
   public static void main(String[] args) throws Exception
   {
      int[] a = null;
      int i = a [ m1() ];
   }
   public static int m1() throws Exception
   {
      //throw new Exception("Some Exception");
	   return 1;
   }
}
//no null pointer exception
//if return an integer :it will throw nullpointer exception : a[0] is not initilaized




/*
 * Which of the following statements are true?
 * 
 * To provide threading behavior a class must extend Thread class To provide
 * threading behavior a class must explicitly implement Runnable interface
 * Threads created by user are always non-daemon threads Thread created ======>correct option
 * (can be converted to daemon threads by invoking setDaemon(true) before run())
 * internally by the JVM are always daemon threads None of the above are correct
 */