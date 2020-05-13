package base.exception;

public class customExceptionTest extends Exception{

	public customExceptionTest() {
		super();
	}
	
	public customExceptionTest(String str) {
		super(str);
	}
	
	
	// �̳���Exception���Զ����쳣����Ҫ�׳�
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
