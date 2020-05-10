package base.Enum;

public enum Weekday {
	
	MON(1,"����һ"),
	TUE(2,"���ڶ�"),
	WED(3,"������"),
	THU(4,"������"),
	FRI(5,"������"),
	SAT(6,"������"),
	SUN(7,"������");
	
	public final int dayValue;
	private final String chinese;
	
	private Weekday(int dayValue, String chinese) {
		this.dayValue = dayValue;
		this.chinese = chinese;
	}
	
	@Override
	public String toString() {
		return this.chinese;
	}
}
