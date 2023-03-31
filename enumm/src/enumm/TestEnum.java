package enumm;

public class TestEnum {

	public static void main(String[] args) {

		DayofWeek today = DayofWeek.SATURDAY;
		System.out.println("Today is "+ today.getName());
		
		switch(today)
		{
		case MONDAY:
			System.out.println("Work hard");
			break;
		case TUESDAY:
			System.out.println("Work little more");
			break;
		case WEDNESDAY:
			System.out.println("Work work little more");
			break;
		case THRUSDAY:
			System.out.println("Work work more, WEEKEND IS AR");
			break;
		case FRIDAY:
			System.out.println("YEAH weekend has arrived, party has");
			break;
		case SATURDAY:
			System.out.println("enjoy morning coffee, go shopping");
			break;
		case SUNDAY:
			System.out.println("do ALL CLEANING WORKS, SNOOOOZZZZ");
			break;
			
		}
		
	}

}
