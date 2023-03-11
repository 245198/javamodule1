package strings;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("16-11-477/6/A/3 @Hyderabad 500036");
		int d=0,a=0,others=0,w=0;
		for(int i=0;i<str.length();i++)
		{
			Character c = str.charAt(i);
			if(Character.isDigit(c))
			{
				d++;
			}
			else if(c.isAlphabetic(c))
			{
				a++;
			}
			else if(c.isWhitespace(c))
			{
				w++;
			}
			else
			{
				others++;
			}
		}
		System.out.println("Count of numbers: "+d);
		System.out.println("Count of Alphabets: "+a);
		System.out.println("Whitespace:"+w);
		System.out.println(others);
		

	}

}
