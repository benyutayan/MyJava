package base.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

//	�ص㣺
//	1. �̳���HashSet
//	2. ����,������Ⱥ�˳��
	
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
