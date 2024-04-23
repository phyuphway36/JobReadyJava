package data_structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashSet<String> countryList = new HashSet<>(); 		HashSet<String> countryList = new HashSet<>(); 
//		LinkedHashSet<String> countryList = new LinkedHashSet<>(); 
		TreeSet<String> countryList = new TreeSet<>();
		
		countryList.add("Myanmar");
		countryList.add("Japan");
		countryList.add("Japan");
		countryList.add("Japan");
		countryList.add("Myanmar");
		countryList.add("Myanmar");
		countryList.add("Thailand");
		countryList.add("Korea");
		countryList.add("UK");
		System.out.println(countryList);
		Iterator<String> iterator = countryList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		Iterator<String> iterator = countryList.iterator();
//		if(iterator.hasNext())
//		System.out.println(iterator.next());
//		if(iterator.hasNext())
//		System.out.println(iterator.next());
//		if(iterator.hasNext())
//		System.out.println(iterator.next());
//		if(iterator.hasNext())
//		System.out.println(iterator.next());
//		if(iterator.hasNext())
//		System.out.println(iterator.next());
//		if(iterator.hasNext())
//		System.out.println(iterator.next());
//		if(iterator.hasNext())
//		System.out.println(iterator.next());

	}

}
