package datetime;

import java.util.Date;

public class OldDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date today = new Date();//milliSeconds
		System.out.println(today);
		
		long currentTime = System.currentTimeMillis();
		
		Date currentDateTime = new Date(currentTime);
		System.out.println(currentDateTime);
		//System.out.println(today.getHours());
		//System.out.println(today.getYear());
		System.out.println(today.getSeconds());
	}

}
