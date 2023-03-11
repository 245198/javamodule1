
public class CarFactory {

	public static void main(String[] args)
	{
		Car jack = new Car();
		jack.color = "blue";
		jack.price = 450000;
		jack.brand = "Audi";
		jack.model = "xp23d";
		System.out.println(jack.color);
		System.out.println(jack.price);
		System.out.println(jack.brand);
		System.out.println(jack.model);
		
		Car bmw =new Car();
		bmw.color="red";
		bmw.price=2500000;
		bmw.brand="bmwx";
		bmw.model="suv";
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		
	}

}
