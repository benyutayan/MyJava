package base;

public class Class1 {
	
	public String name;
	public int age;
	
	public void say(String content) {
		// TODO Auto-generated method stub
		System.out.println(content);
	}
	
	
	public static void main(String[] args) {
		Class1 p = new Class1();
		p.age = 15;
		p.name = "huangrihua";
		p.say("what is your name ?");
		System.out.println(p.name);
	}
}


 
