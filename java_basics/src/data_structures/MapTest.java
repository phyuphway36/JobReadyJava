package data_structures;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTest {
	public static void main(String[] args) {
//		HashMap<Integer, String> seating = new HashMap();
		LinkedHashMap<Integer, String> seating = new LinkedHashMap();

		seating.put(20002, "MgAung");
		seating.put(10023, "MgHein");
		seating.put(13456, "MgMya");
		seating.put(200123, "MgKyaw");

		seating.put(13666, "MgYe");
		seating.put(13456, "MgMya");
		seating.put(13666, "MgZaw");


		System.out.println(seating);
//		System.out.println(seating.get(200123));

		//Check
		
//		System.out.println(seating.containsKey(10023));
//		System.out.println(seating.containsValue("MgYe"));

		//System.out.println(seating.remove(13666));
//		System.out.println(seating.remove(13666, "MgMya"));
//		System.out.println(seating.replace(13666, "MgZaw"));
//		System.out.println(seating.replace(13666, "MgYe", "MgZaw"));
//		System.out.println(seating);
	}
	

}
