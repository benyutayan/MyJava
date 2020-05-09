package base;

import java.util.Arrays;

public class DBOperation {

	public static void main(String[] args) {

		  int a2 = 0b1111;
		  int a8 = 013;
		  int a16 = 0x16;
		  
		  boolean b1 = false;
		  
		  String str = true + "";
		  
		  System.out.println(a2);
		  System.out.println(a8);
		  System.out.println(a16);
		  System.out.print("12"); 
		  System.out.println("Hello World");
		  System.out.print(str);
		  

		//Auto Conversion
		/*
		 * char --->------------> int 
		 * byte ---> short   ---> int ---> long ---> float --->  double
		 * 
		 */
		
		  
//		Narrow conversion
		
		int value = 233;
		
		byte bvalue  = (byte)value;
		System.out.println(bvalue);       // -23
		
		double dvalue = 3.99;
		int tol = (int)dvalue;
		System.out.println(tol);          // 3
		
			
		//基本类型包装类
		/*
		 * boolean --- Boolean 
		 * byte    --- Byte 
		 * short   --- Short 
		 * int     --- Integer 
		 * long    --- Long 
		 * char    --- Character 
		 * float   --- Float 
		 * double  --- Double
		 */
		
		String a = "45";
		int iValue = Integer.parseInt(a);
		System.out.println(iValue);                // 45
		
		
		
		//
		short  sValue = 5;
		sValue = (short)(sValue - 2);        //右边表达式自动提升为int
		
		
		
		// 
		int val = 3;
		int intResult = 23/val;
		double dValue = 23/val;
		System.out.println(intResult);       // 7
		System.out.println(dValue);          // 7.0
		
		 
		//位运算符，&,|,~,^,<<,>>,>>>
		int ab = -5;
		byte bb = (byte)ab;
		
		//break, break outer
		//continue, continue outer
		//return
		
		String[] books = {"a","b","c"};
		for (String book : books) {
			System.out.println(book);
		}
		
		//Arrays
		int[] a1 = new int[] {3,4,5,6};
		int[] a3 = new int[] {3,4,5,6};
		System.out.println("a1 = a3 : " + Arrays.equals(a1, a3));
		
		int[] b = Arrays.copyOf(a3, 6);                      //a1 = a3 : true
		System.out.println("b : " + Arrays.toString(b) );    //b : [3, 4, 5, 6, 0, 0]
		 
        Arrays.sort(b);
        System.out.println("sort(b) : " + Arrays.toString(b));  //sort(b) : [0, 0, 3, 4, 5, 6]
	}

}
