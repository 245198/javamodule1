package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>(); //only strings
		//colors.add(new Object()); 
		//colors.add(new Double("10.10"));
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		System.out.println(colors.size());
		
		System.out.println(colors);
	}

}
