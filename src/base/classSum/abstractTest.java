package base.classSum;

abstract class abstractTest {
	private String name;
	   public abstract double getPrice();
	   public abstractTest(){}
	   public abstractTest(String name)
	   {
	      this.name = name;
	   }
	   // �˴�ʡ����name��setter��getter����
	   public void setName(String name)
	   {
	      this.name = name;
	   }
	   public String getName()
	   {
	      return this.name;
	   }
	   
	   
	   //main
	   public static void main(String[] args) {
		
		   abstractTest abs = new abstractTest() {
			   public double getPrice() {
				   System.out.println(">>>>");
				return 66.5;
			   };
			   
		   };
		   
		   System.out.println(abs.getPrice());
		   
	}
}
