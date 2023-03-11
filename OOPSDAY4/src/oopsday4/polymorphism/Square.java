package oopsday4.polymorphism;

public class Square extends Shape{
	public Square() {
		// TODO Auto-generated constructor stub
	}

	int s=5;

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public Square(int s) {
		super();
		this.s = s;
	}
	public double area()
	{
		return this.s*this.s;
	}
}
