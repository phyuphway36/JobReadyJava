package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println("Today: "+today);
		
		LocalDate nextMonthFirstDate =
				today.with(TemporalAdjusters.firstDayOfNextMonth());
	    System.out.println("nextMonthFirstDate: "+nextMonthFirstDate);
	    
	    LocalDate thisMonthFirstDate =
				today.with(TemporalAdjusters.firstDayOfMonth());
	    System.out.println("thisMonthFirstDate: "+thisMonthFirstDate);
	    
	    LocalDate nextWeb = 
	    		today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
	    System.out.println("nextWeb: "+nextWeb);
	    
	    LocalDate previousMonday = 
	    		today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
	    System.out.println("previousMonday: "+previousMonday);
	}

}
