package base;

interface Product{
	int getProduceTime();
}
public class Printer implements Output, Product{

	private String[] printDataStrings = new String[MAX_cache_LINE];
	
	private int dataNum = 0;
	
	public void out() {
		
	}
	
	public void getData(String msg) {
		
	}
	
	public int getProduceTime() {
		return 45;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
