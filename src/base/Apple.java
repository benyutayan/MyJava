package base;

public class Apple extends Fruit {
	
	public void info(String name) {
		System.out.println("����һ��ƻ�� :" + name + "�� :" + weight + "g !");
	}
	
	public void info() {
		super.info();
		System.out.println("����һ��ƻ�� : �� :" + weight + "g !");
	}
	
	protected double getWeight() {
		return this.weight;
	}
	
	public static void main(String[] args) {
		Apple a = new Apple();
		a.weight = 180;
		a.info();
		a.info("xiaoli");
		System.out.println("weight : " + a.getWeight());
		
		Fruit fruit = new Apple();
		fruit.info();
		
	}

}
