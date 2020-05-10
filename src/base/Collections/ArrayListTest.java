package base.Collections;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// add
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		// get
		System.out.println(list.get(3));
		
		// set
		list.set(1, "set");
		
		// contains
		System.out.println(list.contains("3"));  // true
		
		// remove
		list.remove("4");
		
		// toArray
		String[] strarray = (String[])list.toArray(new String[0]);
		for (String str : strarray) {
			System.out.println(str);
		}
		
		// loop
		System.out.println("loop start :");
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println(list.size());
	}
}
