package module1ExamDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EveneRemove {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(7);
		list.add(100);
		/*
		 * for(int i=0;i<list.size();i++) { int g = list.get(i); System.out.println(g);
		 * if(g%2==0) { list.remove(i); } }
		 */
		/*
		 * for(Integer i:list) { if(i%2==0) { System.out.println(i); } }
		 */
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			int it = (int) itr.next();
			System.out.println(it);
			if(it%2==0)
			{
				//System.out.println(itr);
				list.remove(itr);
			}
		}
		System.out.println(list);
	}

}
