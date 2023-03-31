package factoryMethod;

public class XCross implements Vehicle {

	@Override
	public void start()
	{
		System.out.println("started......"+getClass());
	}
	
	@Override
	public void stop()
	{
		System.out.println("stopped......."+getClass());
	}
	
	@Override
	public void honk()
	{
		System.out.println("Palm palm......"+getClass());
	}
	
	@Override
	public void moove()
	{
		System.out.println("its moving......"+getClass());
	}
	

}
