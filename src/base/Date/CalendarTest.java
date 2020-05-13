package base.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		// get()
		System.out.println(calendar.get(calendar.YEAR));  // 2020
		System.out.println(calendar.get(Calendar.MONTH)); // 4
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));  // 12
		System.out.println(calendar.get(calendar.DAY_OF_YEAR));   // 133
		System.out.println(calendar.get(Calendar.DATE));          // 12
		System.out.println(calendar.get(Calendar.JANUARY));       // 1
		
		
		// add()
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, -1);
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		
		
		
		//
		Calendar bir = Calendar.getInstance();
		bir.set(2018, 05, 31);
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
