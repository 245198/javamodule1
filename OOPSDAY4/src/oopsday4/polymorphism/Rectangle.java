package oopsday4.polymorphism;

public class Rectangle extends Shape{
	private int length=5;
	private int breadth=4;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area()
	{
		return this.length * this.breadth;
	}

}
