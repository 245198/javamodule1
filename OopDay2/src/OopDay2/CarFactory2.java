package OopDay2;

public class CarFactory2 {

	public static void main(String[] args) 
	{
			//CarIface car1 = new CarTface();
		// CarIface c; //not referring to any object
		CarIface car = new Car(5000,500,0,false);
		car.start();
		car.honk();
		car.move();
		car.stop();
		
			

	}

}
