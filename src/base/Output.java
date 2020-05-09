package base;


public interface Output {

	//public static final ,接口中，自动加这三个修饰符
	public static final int Max_size = 10;
	int MAX_cache_LINE = 50;
	
	void out();
	
	void getData(String msg);
	
	//默认方法必须有方法体，自动加 public 修饰符，必须由实现类的实例来调用
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}
	
	default void test() {
		System.out.println("defalut method");
	}
	
	//类方法必须有方法体，默认public修饰符
	static String staticTest() {
		return "static method";
	}
	
	
}
