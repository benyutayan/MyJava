package base.Date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println(date.getTime());
		
		Date birDate = new Date(2018, 05, 31);
		System.out.println(birDate.getTime());
		
		System.out.println(date.getTime() - birDate.getTime());
	}
}
