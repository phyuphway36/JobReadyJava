package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodAndDuration {

	static void classPeriod() {
		LocalDate startClassDate = LocalDate.of(2022, Month.JULY, 24);
		LocalDate endClassDate = LocalDate.of(2023, Month.JANUARY, 14);
		
		Period classPeriod = Period.between(startClassDate, endClassDate);
		System.out.println(classPeriod);
		System.out.println(classPeriod.getDays());
		System.out.println(classPeriod.getMonths());

		System.out.println(classPeriod.getYears());
		System.out.println(classPeriod.toTotalMonths());


	}
	static void classDuration() {
		LocalTime now = LocalTime.now();
		
		Duration twoHr = Duration.ofHours(2);
		
		LocalTime after2Hr = now.plus(twoHr);
		
		Duration classDuration = Duration.between(now, after2Hr);
		System.out.println(classDuration);
		System.out.println(classDuration.toHours());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classPeriod();
		classDuration();

	}

}
