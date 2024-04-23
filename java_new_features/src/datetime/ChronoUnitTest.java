package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today =LocalDate.now();
		System.out.println("Today: "+today);
		
		LocalDate twoDayLate = today.plus(2, ChronoUnit.DAYS);
		System.out.println("TwoDayLater: "+twoDayLate);
		
		LocalDate tenMonthBefore = today.minus(10, ChronoUnit.DAYS);
		System.out.println("TenMonthBefore: "+tenMonthBefore);
		
		LocalDate year20Later = today.plus(10, ChronoUnit.YEARS);
		System.out.println("Year20Later: "+year20Later);
		
		LocalDate twoDecadeLater = today.plus(10, ChronoUnit.DECADES);
		System.out.println("TwoDecadeLater: "+twoDecadeLater);
		
		
		LocalDate twoCenturyLater = today.plus(2, ChronoUnit.CENTURIES);
		System.out.println("TwoCenturyLater: "+twoCenturyLater);

	}

}
