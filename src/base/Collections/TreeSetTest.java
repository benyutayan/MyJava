package base.Collections;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		// ¹¹ÔìÆ÷
		TreeSet<String> treeSet1 = new TreeSet<String>();
		treeSet1.add("1");
		treeSet1.add("2");
		treeSet1.add("3");
		treeSet1.add("4");
		treeSet1.add("5");
		treeSet1.add("6");
		
		TreeSet<String> treeSet2 = new TreeSet<String>(treeSet1);
		
		
		// first()
		System.out.println(treeSet1.first());
		
		// last()
		System.out.println(treeSet1.last());
		
		//subset()
		System.out.println(treeSet1.subSet("1", "6"));
		
		//headSet()
		
		//tailSet()
		
		
	}
}
