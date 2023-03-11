package Demo2;

public class WrapperDeom {

	public static void main(String[] args) {

		int i=12321;
		/*
		 * String s = "67"; int j =Integer.parseInt(s);
		 */
		String str = i+" ";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		boolean result = str.equals(sb.toString());
		System.out.println(result);
		
		//Integr integer = new Integer
		
		//form integer to string 
		String s2 = Integer.toString(i);
		//integer = s2.intValue();
	}

}
