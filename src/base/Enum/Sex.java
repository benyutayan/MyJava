package base.Enum;

public enum Sex {

	Male("male"),
	Female("female");
	
	private final String sex;
	private Sex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public static void main(String[] args) {
		System.out.println(Sex.Female);
		
		for (Sex x : Sex.values())
			System.out.println(x);
		
		System.out.println(Sex.class);
	}
}


