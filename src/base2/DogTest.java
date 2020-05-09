package base2;

import base.Dog;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		dog1.run();
		System.out.println(Dog.count);               //0
		Dog.count = 3;
		System.out.println(Dog.count);               //3

	}

}
