package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId myanmar = ZoneId.of("Asia/Rangoon");
		ZoneId japan =ZoneId.of("Asia/Tokyo");

		LocalDateTime today = LocalDateTime.now(japan);
		System.out.println("Asia/Japan: "+today);
		ZonedDateTime japanZonedDateTime = today.atZone(japan);
		System.out.println("Asia/Japan: "+japanZonedDateTime);
		
		ZoneId uk = ZoneId.of("Europe/London");
		ZonedDateTime london = ZonedDateTime.now(uk);
		System.out.println("London TimeZone : "+london);
		
		ZonedDateTime myanmarTimeZone = ZonedDateTime.now(myanmar);
		System.out.println("Myanmar TimeZone : "+myanmarTimeZone);
		
		System.out.println(myanmarTimeZone.getZone());
		
		ZonedDateTime japanCustom = ZonedDateTime.of(2014, 7, 22, 13, 22, 16, 27362762, japan);
		System.out.println("Japan Custom Datetime: "+japanCustom);
	}

}
