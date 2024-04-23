package oop_part2.enumeration;

public class EnumTest {
	
	private DayOfWeek day;
	
	public EnumTest(DayOfWeek day) {
		super();
		this.day = day;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumTest enumTest = new EnumTest(DayOfWeek.SUNDAY);
		
		switch (enumTest.getDay()) {
		case MONDAY:
			System.out.println("Active Monday");
			break;
		case TUESDAY:
			System.out.println("Normal Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Normal Wedensday");
			break;
		case THURSDAY:
			System.out.println("Boring Thursday");
			break;
		case FRIDAY:
			System.out.println("Happy Friday");
			break;
		case SATURDAY:
			System.out.println("Drinking staurday");
			break;
		case SUNDAY:
			System.out.println("Super Sunday");
			break;

		default:
			System.out.println("Null");
			break;
		}

	}

	public DayOfWeek getDay() {
		return day;
	}
	

}
