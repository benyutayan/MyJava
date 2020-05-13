package base.random;

import java.util.Random;

public class randomTest {

	/*
	 * Random
	 * 
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		//nextXXX
		System.out.println(ran.nextInt());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(100));  // between 0 and 100
		
		//����10��ʹ������ͬ���ӵ�random��������ͬ�������
		Random ran2 = new Random(10);
		Random ran3 = new Random(10);
		if (ran2.nextInt() == ran3.nextInt()) {
			System.out.println("==");                      // ==
		}
		
		
		//������ͬ�������
		Random rand1 = new Random(System.currentTimeMillis());
		
		Random rand2 = new Random(System.currentTimeMillis());
		if (ran2.nextInt() != ran3.nextInt()) {
			System.out.println("<>");                      
		}else {
			System.out.println("==");                     // ==
		}
		
		
	}
}
