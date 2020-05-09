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
		
		//�ڲ���Ҫָ������ͷ���͡���β����ʱ����String.join()�����㣺
		String str = String.join(", ", names);
		System.out.println(str);
	}
}
