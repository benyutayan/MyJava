package base;

import java.util.Arrays;

public class FinalVariableTest {

	final int a = 6;
	final String s1;
	final int c;
	final static double d;
	
	{
		s1 = "kasi";
		c = 8;
	}
	
	static {
		d = 1.23;
	}
	
	public static void main(String[] args) {
		FinalVariableTest fv1 = new FinalVariableTest();
		System.out.println(); 
		
		final int e = 123;
		
		final int[] iArr = {5, 6, 17, 9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);                         //引用变量，地址不变
		System.out.println(Arrays.toString(iArr));
		
		final Dog dog = new Dog();
		dog.age = 12;
		
		
	}

}
