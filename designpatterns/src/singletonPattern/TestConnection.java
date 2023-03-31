package singletonPattern;

public class TestConnection {

	public static void main(String[] args) {

		Connection con1 = Connection.getConnection();
		System.out.println(con1);
		Connection con2 = Connection.getConnection();
		System.out.println(con2);
		for(int i=0;i<10;i++)
		{
			Connection con3 = Connection.getConnection();
			Connection con4 = Connection.getConnection();
		}
		if(con1.hashCode()==con2.hashCode())
		{
			System.out.println("Singleton patterns");
		}
		else
		{
			System.out.println("Not Singleton");
		}
	}
}

