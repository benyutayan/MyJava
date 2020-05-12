package base.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapTest {
/*
 * ����
 * HashMap ��Ҫ���ڴ洢��(key)ֵ(value)�ԣ����ݼ��õ�ֵ����˼��������ظ�,������ֵ�ظ���
   HashMap ��һ����õ�Map,�����ݼ���HashCodeֵ�洢����,���ݼ�����ֱ�ӻ�ȡ����ֵ�����кܿ�ķ����ٶȡ�
   HashMap ���ֻ����һ����¼�ļ�ΪNull;���������¼��ֵΪ Null;
   HashMap ��֧���̵߳�ͬ��������һʱ�̿����ж���߳�ͬʱдHashMap;���ܻᵼ�����ݵĲ�һ�¡������Ҫͬ���������� Collections��synchronizedMap����ʹHashMap����ͬ����������
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
