package lsp;

public class LSPDemo {

	public void calculateShape(Shape s)
	{
		System.out.println(s.getArea());
	}
	public static void main(String[] args) {

		
		LSPDemo lsp = new LSPDemo();
		lsp.calculateShape(new Rectangle(1,4));
		lsp.calculateShape(new Square(5));
			
	}
}
