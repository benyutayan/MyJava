package base.Collections;

import java.util.EnumSet;

import base.Enum.Sex;

public class enumSetTest {

	public static void main(String[] args) {
		EnumSet<Sex> e1 = EnumSet.allOf(Sex.class);
		System.out.println(e1);
		
		EnumSet<Sex> e2 = EnumSet.copyOf(e1);
				System.out.println(e2);
		
	}
}
