package oopsday2.shapes;

public class Triangle implements Shape {
	
	private int length;
	private   int breadth;
	
	public Triangle(int length, int bredth) {
		super();
		this.length = length;
		this.breadth = bredth;
	}

	public int getBredth() {
		return breadth;
	}

	public void setBredth(int bredth) {
		this.breadth = bredth;
	}

	

	@Override
	public void area() 
	{
		double areaTriangle = 0.5*(length*breadth);
		System.out.println(areaTriangle);

	}

	public static void main(String[] args) {
		
		Shape s = new Triangle(4,5);
		s.area();
		// TODO Auto-generated method stub

	}

}
