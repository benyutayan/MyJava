package base;

public class Fruit {
	
	public double weight;
	protected void info() {
		System.out.println("����һ��ˮ������" + weight + "g !");
	}
	
	protected double getWeight() {
		return this.weight;
	}
}
