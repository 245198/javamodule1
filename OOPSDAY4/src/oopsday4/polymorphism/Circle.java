package oopsday4.polymorphism;

public class Circle extends Shape{
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	int r=5;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}
	
	public double area()
	{
		return Math.PI*this.r*this.r;
	}

}
