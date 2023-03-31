package factoryMethod;

public class UseVehicleFactory {

	public static void main(String[] args) {
		Vehicle seltos = VehicleFactory.newInstance("Seltos");
		seltos.start();
		
		Vehicle xcross = VehicleFactory.newInstance("XCross");
		xcross.moove();
		
	}
}
