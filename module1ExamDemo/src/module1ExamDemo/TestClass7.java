package module1ExamDemo;

import java.util.Objects;

public class TestClass7
{

  static String str = "Hello World";
  String str4="Aneeta";
  @Override
public int hashCode() {
	return Objects.hash(str4);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TestClass7 other = (TestClass7) obj;
	return Objects.equals(str4, other.str4);
}
public static void changeIt(String s)
  {
    s = "Good bye world";
  }
  public static void main(String[] args)
  {
    changeIt(str);
    System.out.println(str);
    String str1 = "true";
    String str2 = "two";
    System.out.println( str1.equals(true) );

  }
}

//pass by value