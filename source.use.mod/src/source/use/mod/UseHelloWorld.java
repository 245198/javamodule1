package source.use.mod;
import source.mod.HelloWorld;


public class UseHelloWorld {
	public static void main(String[] args) {
		
		var x = "anil";
		var y = 23.75;
		var z = 'c';
		/*
		 * var a; a =20;
		 */
		var a =20;
		System.out.println(x.length());
		try {
			HelloWorld world = new HelloWorld();
			world.message();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
