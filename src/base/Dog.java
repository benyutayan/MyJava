package base;


public class Dog {
	
	int age = 9;
	
	
	public static int count;
	private int number;
	protected String name;               //×ÓÀà¿É·Ã£¬
	
	
	public void jump() {
		System.out.println("jumping");
	}
	
	public void run() {
		jump();
		System.out.println("running");
	}
	
	public static void sleepPeriod(String... periods) {
		for(String period : periods) {
			System.out.println(period);
		}
	}
	
	public static void main(String[] args) {
		sleepPeriod("morning", "afteroon", "night");
		
		Dog.count = 2;
		Dog.count += 3;
		System.out.println(Dog.count);
		
		Dog dog = new Dog();
		System.out.println(dog.age);
	}
}
