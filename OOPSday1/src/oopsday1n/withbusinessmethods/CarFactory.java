package oopsday1n.withbusinessmethods;

public class CarFactory {
	public static void main(String[] args)
	{
		
		Car jag = new Car("pink",22900,"toyota","suv");
		
		jag.start();
		jag.changeGear(1);
		jag.stop();

		
		Car bmw =new Car("Orange",89900,"Benz","suv");
		bmw.start();
		bmw.changeGear(2);
		bmw.stop();
		
		
			
	}


}
