package strings;

public class TestStrings {

	public static void main(String[] args) 
	{
		byte [] bytes = {76,79,86,69};
		String str = new String(bytes);
		/*
		 * System.out.println(str); str = "Welcome to UST Global"; bytes =
		 * str.getBytes(); for(byte b:bytes) { System.out.println(b); }
		 * 
		 * char chars[]= {'U','S','T',' ','G'}; str = new String(chars);
		 * 
		 * 
		 * str.getChars(0,chars.length -1,chars, 0); //Integer i = new Integer('9');
		 */		
		str = new String("She sells sea .shells, in .sea shore.");
		byte [] bArr = str.getBytes();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char si = str.charAt(i);
			if(si =='s' || si =='S')
			{
				count++;
			}
		}
		System.out.println("No of 'S':"+count);
		
		String words[] = str.split("[.]");
		System.out.println(words.length);
		for(String s1:words)
		{
			System.out.println(s1);
		}
		str = new String("Cartoon");
		System.out.println(str.startsWith("Car"));
		System.out.println(str.endsWith("oni"));
		
		
		int apps = str.indexOf("a");
		int tpos = str.indexOf("t");
		System.out.println(apps);
		
		String str2 = str.substring(apps,tpos+1);
		System.out.println(str2);
		
		str2 = str.substring(tpos);
		System.out.println(str2);
		
		str = new String("madamdam");
		int dpos = str.lastIndexOf('d');
		System.out.println(dpos);
		str2 = str.substring(tpos);	
		System.out.println(str2);
		
		
		String mailId = new String("aneeta.roy@ust.com");
		int start = mailId.lastIndexOf(".com");
		String str4 = mailId.substring(0, start);
		
		System.out.println(str4);
		String s1 = new String("weLcome");
		String s2 = new String("WELCOME");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//int val = s1.compareTo(s2);
		int val = s2.compareTo(s1);
		System.out.println(val);
		
		String str7= "Hello";
		System.out.println(str7.toLowerCase());
		System.out.println(str7);
		
		
	}
	

}