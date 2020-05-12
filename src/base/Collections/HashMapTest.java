package base.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapTest {
/*
 * 无序
 * HashMap 主要用于存储键(key)值(value)对，根据键得到值，因此键不允许重复,但允许值重复。
   HashMap 是一个最常用的Map,它根据键的HashCode值存储数据,根据键可以直接获取它的值，具有很快的访问速度。
   HashMap 最多只允许一条记录的键为Null;允许多条记录的值为 Null;
   HashMap 不支持线程的同步，即任一时刻可以有多个线程同时写HashMap;可能会导致数据的不一致。如果需要同步，可以用 Collections的synchronizedMap方法使HashMap具有同步的能力。
 */
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap1 = new HashMap<>();
		
		//put
		hashmap1.put("A", 1);
		hashmap1.put("B", 2);
		hashmap1.put("C", 3);
		
		//get
		System.out.println(hashmap1.get("B"));  // 2
		
		//containsKey
		System.out.println(hashmap1.containsKey("C"));  // true
		System.out.println(hashmap1.containsKey("D"));  // false
		
		//containsValue
		System.out.println(hashmap1.containsValue(2));  // true
		System.out.println(hashmap1.containsValue(5));  // false
		
		// keySet
		Set<String> set = (Set<String>) hashmap1.keySet();
		for (String str : set) {
			System.out.println(str);
		}
		
		// values
		Collection<Integer> list = (Collection<Integer>) hashmap1.values();
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
