package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();//nano second
		System.out.println("Today : "+today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date Time: "+currentDateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("Formatted Date Time: "+ formattedDateTime);
		
		//Day
		System.out.println("DayOfMonth: "+currentDateTime.getDayOfMonth());
		System.out.println("DayOfWeek: "+currentDateTime.getDayOfWeek());
		System.out.println("DayOfYear: "+currentDateTime.getDayOfYear());

		//Month
		System.out.println("Month: "+ currentDateTime.getMonthValue());
		Month month =currentDateTime.getMonth();
		
		System.out.println("Month: "+month);
		
		//Year
		System.out.println("Year: "+currentDateTime.getYear());
		
		System.out.println("Hour: "+currentDateTime.getHour());
		
		System.out.println("Minute: "+currentDateTime.getMinute());
		
		System.out.println("Second: "+currentDateTime.getSecond());
		
		System.out.println("Nano Second: "+currentDateTime.getNano());

		LocalDateTime customDateTime = LocalDateTime.of(2020, 12, 25, 13, 45);
		System.out.println("Custom Date Time: "+customDateTime);


	}
		
	}
