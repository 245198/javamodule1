package kbademo.com;

public class ComparableDemo implements Comparable<ComparableDemo> {
	int id;
	String name;
	public ComparableDemo(int id,String name) {
		this.name=name;
		this.id=id;
	}

	@Override
	public int compareTo(ComparableDemo o) {
		int o1 = this.id;
		int o2=o.id;
		if(o1<o2)
		{
			return -1;
		}
		else if(o2<o1)
		{
			return 1;
		}
		else
			return 0;
	}



}
