package module1ExamDemo;

public class MyThread extends Thread 
{ 
   String msg = "default"; 

public MyThread(String s) 
   { 
      msg = s; 
   } 
   public void run() 
   { 
      System.out.println(msg); 
   } 
   public static void main(String args[]) 
   { 
      new MyThread("String1").run(); 
      new MyThread("String2").run(); 
      System.out.println("end"); 
   } 
} 