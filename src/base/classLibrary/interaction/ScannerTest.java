package base.classLibrary.interaction;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		

		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		
		scanner.close();
		
		while (scanner.hasNextFloat()) {
			System.out.println(scanner.next());
		}
		scanner.close();
		
		
	}

}
