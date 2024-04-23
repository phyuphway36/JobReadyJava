package data_structures;

import java.util.ArrayList;
import java.util.Collections;

//import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruitList = new ArrayList<>(10);
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("PineApple");
		fruitList.add("Papaya");
		fruitList.add("Apple");
		fruitList.add("Banana");

		fruitList.add(2, "kiwi");

		
//		System.out.println(fruitList.size());
		System.out.println(fruitList);
		
		//Collections.sort(fruitList);
		Collections.reverse(fruitList);
		Collections.shuffle(fruitList);//Absenting


		System.out.println(fruitList);

//		System.out.println(fruitList.indexOf("Banana"));
//		System.out.println(fruitList.lastIndexOf("Banana"));
		
		//remove
		
//		System.out.println(fruitList.remove("Banana"));
//		System.out.println(fruitList.remove(2));
//		ArrayList<String> perishFruit = new ArrayList<>();
//		perishFruit.add("Mango");
//		perishFruit.add("Apple");
//		
//		fruitList.removeAll(perishFruit);
//		ArrayList<String> instockFruit = new ArrayList<>();
//		instockFruit.add("Banana");
//		instockFruit.add("PineApple");
//		if(fruitList.containsAll(instockFruit))
//		fruitList.retainAll(instockFruit);
//		System.out.println(fruitList);
		//searching
//		System.out.println(fruitList.get(3));
//		System.out.println(fruitList.contains("Orange"));
//		fruitList.clear();
//		System.out.println(fruitList.isEmpty());

	
		
	}

}
