package oopsday1n.setgetconstructors;

public class CarFactory {
	public static void main(String[] args)
	{
		
		Car jack = new Car("pink",22900,"toyota","suv");
		System.out.println(jack);
		jack.setBrand("Volvo");
		jack.setColor("green");
		jack.setPrice(128900);
		jack.setModel("suv");
		
		Car bmw =new Car("Orange",89900,"Benz","suv");
		System.out.println(bmw.hashCode());
		System.out.println(Integer.toHexString(bmw.hashCode()));
		System.out.println(Integer.toHexString(jack.hashCode()));
		
		bmw.setBrand("BMW23");
		bmw.setColor("yellow");
		bmw.setModel("Suv luxury");
		bmw.setPrice(8900000);
		
		System.out.println(bmw);
			
	}


}
