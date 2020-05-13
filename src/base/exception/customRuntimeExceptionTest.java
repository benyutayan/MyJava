package base.exception;

public class customRuntimeExceptionTest extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public customRuntimeExceptionTest() {
		super();
	}
	
	public customRuntimeExceptionTest(String str) {
		super(str);
	}
	
	
	// 继承自RuntimeException的自定义异常，不需要抛出
	public static void main(String[] args)  {
		
		try {
			Integer a = 1;
			Integer b = 0;
			System.out.println(a/b);
		} catch (Exception e) {
			
			throw new customRuntimeExceptionTest("custom exception");
			
			
		} finally {
			System.out.println("no exception");
		}
	}
}
