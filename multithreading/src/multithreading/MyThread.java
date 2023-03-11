package multithreading;

public class MyThread extends Thread 
{
	String name;
	
	public void run()
	{
		for(int i=1;i<600;i++)
		{
			System.out.println(name + " = "+i);
		}
	}

	public MyThread(String name) {
		super();
		this.name = name;
	}
	public MyThread() {

	}

}
