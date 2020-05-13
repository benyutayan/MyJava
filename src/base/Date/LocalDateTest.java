package base.Date;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate today  = LocalDate.now();
		System.out.println(today);          //2020-05-12
		
		LocalDate beforeDate = LocalDate.of(2018, 05, 31);
		
		System.out.println(today.minusYears(2));   //2018-05-12
		System.out.println(today.minusMonths(2));  //2020-03-12
		System.out.println(today.minusDays(2));    //2020-05-10
		
	}
	
}
