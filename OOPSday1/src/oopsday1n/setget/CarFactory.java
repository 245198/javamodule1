package oopsday1n.setget;

public class CarFactory {
	public static void main(String[] args)
	{
		Car jack = new Car();
		jack.setBrand("Volvo");
		jack.setColor("green");
		jack.setPrice(128900);
		jack.setModel("suv");
		
		System.out.println(jack.getBrand());
		System.out.println(jack.getColor());
		System.out.println(jack.getPrice());
		System.out.println(jack.getModel()+"\n");
		
		Car bmw =new Car();
		bmw.setBrand("BMW23");
		bmw.setColor("yellow");
		bmw.setModel("Suv luxury");
		bmw.setPrice(8900000);
		
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getColor());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getModel());
	
	}
}
