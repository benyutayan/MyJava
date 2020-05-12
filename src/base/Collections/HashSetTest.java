package base.Collections;

import java.util.HashSet;

public class HashSetTest {

//	 特点：
//	无序
//	基于hashmap底层实现
//	重复判断：equal() and hashcode()
	
	public static void main(String[] args) {
		HashSet<String> hashset1 = new HashSet<String>();
		
		//add
		hashset1.add("1");
		hashset1.add("2");
		hashset1.add("3");
		hashset1.add("4");
		
		
		//contains() -> boolean
		System.out.println(hashset1.contains("5")); //false
			
		
		//toArray()
		String[] strarr = (String[])hashset1.toArray(new String[0]);
		System.out.println(strarr);
		for (String x : strarr) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
