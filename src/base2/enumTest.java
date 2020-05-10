package base2;

import base.Enum.Weekday;

public class enumTest {

	public static void main(String[] args) {
		Weekday day = Weekday.MON;
		if (day.dayValue == 6 || day.dayValue == 7 ) {
			System.out.println("This is " + day.toString() + ". Work at office!");
		} else {
			System.out.println("This is " + day.toString() + ". Work at home !");
		}
		
		switch (day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("This is " + day.toString() + ". Work at home!");
			break;
		case SAT:
		case SUN:
			System.out.println("This is " + day.toString() + ". Work at office!");
			break;

		default:
			break;
		}
		
		
	}
}
