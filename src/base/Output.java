package base;


public interface Output {

	//public static final ,�ӿ��У��Զ������������η�
	public static final int Max_size = 10;
	int MAX_cache_LINE = 50;
	
	void out();
	
	void getData(String msg);
	
	//Ĭ�Ϸ��������з����壬�Զ��� public ���η���������ʵ�����ʵ��������
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}
	
	default void test() {
		System.out.println("defalut method");
	}
	
	//�෽�������з����壬Ĭ��public���η�
	static String staticTest() {
		return "static method";
	}
	
	
}
