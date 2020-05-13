package base.exception;

public class exceptionTest {

	public static void main(String[] args) throws Exception {
		
		try {
			Integer a = 1;
			Integer b = 0;
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			 System.out.println("child Exception :" + e.toString());
		} catch (Exception e) {
			System.out.println("Exception :" + e.toString());
		} finally {
			System.out.println("no exception");
		}
	}
}
