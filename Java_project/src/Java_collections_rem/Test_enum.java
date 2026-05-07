package Java_collections_rem;
enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Test_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day d= Day.FRIDAY;
		System.out.println(d);
		
		switch(d) {
		case MONDAY:System.out.println("Monday");
		break;
		case SUNDAY:System.out.println("Sunday");
		break;
		case THURSDAY:System.out.println("Thursday");
		break;
		case SATURDAY:System.out.println("Saturday");
		break;
		case WEDNESDAY:System.out.println("Wednesday");
		break;
		case FRIDAY:System.out.println("Friday");
		break;
		case TUESDAY:System.out.println("Tuesday");
		break;
		
		
		}
		

	}

}
