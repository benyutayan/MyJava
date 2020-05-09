package base;

public class OutputFactory {

	public Output getOutput() {
		return new Printer();
	}
	
	public static void main(String[] args) {
		OutputFactory of = new OutputFactory();
		Computer computer = new Computer(of.getOutput());
		computer.keyIn("1");
		computer.keyIn("2");
		computer.print();
	}
}
