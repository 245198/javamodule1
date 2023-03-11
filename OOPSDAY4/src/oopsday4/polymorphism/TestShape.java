package oopsday4.polymorphism;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s1 = new Circle();
		System.out.println(s1.area());
		Shape s2 = new Square();
		System.out.println(s2.area());

	}

}
