package base.Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> linkedlist1 = new LinkedList<String>();
		
		// add
		linkedlist1.add("L");
		linkedlist1.add(1, "kl");
		linkedlist1.addFirst("start");
		linkedlist1.addLast("end");
		
		//toArray
		String[] strarr = (String[]) linkedlist1.toArray(new String[0]);
		for (String x : strarr) {
			System.out.println(x);
		}
		
		// delete
		linkedlist1.remove();
		linkedlist1.remove(1);
		linkedlist1.remove("ss");
		linkedlist1.removeFirst();
		linkedlist1.removeLast();
		linkedlist1.poll();
		linkedlist1.clear();
		
		System.out.println(linkedlist1);
		
		
		//
		String[] arr = {"L", "i", "n", "K"};
		LinkedList<String> linkedlist2 = new LinkedList<String>(Arrays.asList(arr));
		System.out.println(linkedlist2);
		
	}
}
