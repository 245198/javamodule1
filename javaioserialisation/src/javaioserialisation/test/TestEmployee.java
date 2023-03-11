package javaioserialisation.test;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
public class TestEmployee {
public static void main(String[] args) throws IOException {


	Employee emp = new Employee(101,"John Doe",4000,"aneeta9900");
	FileOutputStream fos = new FileOutputStream("emp.dat");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(emp);	
}	
}
