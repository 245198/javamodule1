package enumm;

public enum DayofWeek {
	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THRUSDAY("Thrusday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday"),
	SUNDAY("Sunday");
	
private final String name;
public String getName()
{
	return name;
}
	
DayofWeek(String name) {
	this.name = name;

}
}



