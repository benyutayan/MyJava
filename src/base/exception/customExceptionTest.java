package base.exception;

public class customExceptionTest extends Exception{

	public customExceptionTest() {
		super();
	}
	
	public customExceptionTest(String str) {
		super(str);
	}
	
	
	// 继承自Exception的自定义异常，需要抛出
	public static void main(String[] args) throws customExceptionTest {
		
		try {
			Integer a = 1;
			Integer b = 0;
			System.out.println(a/b);
		} catch (Exception e) {
			
			throw new customExceptionTest("custom exception");
			
			
		} finally {
			System.out.println("no exception");
		}
	}
}
