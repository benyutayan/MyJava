package base2;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		
		String[] names = {"Bob", "Alice", "Grace"};
		StringJoiner sj = new StringJoiner(", ", "Hello ", "!");
		
		for (String name : names ) {
			sj.add(name);
		}
		
		System.out.println(sj.toString());
		
		//在不需要指定“开头”和“结尾”的时候，用String.join()更方便：
		String str = String.join(", ", names);
		System.out.println(str);
	}
}
