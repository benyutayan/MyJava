package base;


public class Cow {

	private double weight;
	private String prop = "1";
	
	public Cow() {}
	
	public Cow(double weight) {
		this.weight = weight;
	}
	
	
	//Define a inner class
	private class CowLeg {
		private double length;
		private String color;
		private String prop = "2";
		
		public CowLeg() {}
		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}
		
		public void info() {
			String prop = "3";
			System.out.println("��ǰţ����ɫʹ��" + color + ", �ߣ�" + length);
			System.out.println("��ţ��������ţ��:" + weight);
			System.out.println("3:" + prop);
			System.out.println("2:" + this.prop);
			System.out.println("1:" + Cow.this.prop);
		}
	}
	
	public void test() {
		CowLeg c1 = new CowLeg(1.12, "�ڰ����");
		c1.info();
	}
	
	
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
