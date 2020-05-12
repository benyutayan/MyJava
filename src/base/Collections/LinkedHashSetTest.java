package base.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

//	特点：
//	1. 继承自HashSet
//	2. 有序,插入的先后顺序
	
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(); 
		
		set.add("abc");
		set.add("abd");
		set.add("abe");
		set.add("abf");
		set.add("abg");
		
		set.remove("abc");
		set.add("abc");
		
		for (String str : set) {
			System.out.println(str);
		}
		
	}
}
