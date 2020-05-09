package base;

public class Fruit {
	
	public double weight;
	protected void info() {
		System.out.println("我是一个水果，重" + weight + "g !");
	}
	
	protected double getWeight() {
		return this.weight;
	}
}
