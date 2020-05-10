package base.Collections;
import java.util.EnumMap;

import base.Enum.Sex;

public class enumMapTest {

	public static void main(String[] args) {
		EnumMap<Sex, String> map = new EnumMap<>(Sex.class);
		
		map.put(Sex.Female,"nv");
		map.put(Sex.Male,"nan");
		
		System.err.println(map.get(Sex.Female));
	}
	
}
