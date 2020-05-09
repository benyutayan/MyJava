package base2;

public class StringTest {

	public static void main(String[] args) {

		String intStr = "123";
		int int1 = Integer.parseInt(intStr);
		int int2 = new Integer(intStr);
		
		String floatStr = "4.56";
		float flt1 = Float.parseFloat(floatStr);
		float flt2 = new Float(floatStr);
		
		String fltStr2 = String.valueOf(flt2);
		
		String boolString = String.valueOf(true);
		System.out.println(boolString);
	}

}
