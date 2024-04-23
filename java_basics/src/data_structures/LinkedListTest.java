package data_structures;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> scores =  new LinkedList<>();
		scores.add(200);//head
		scores.add(300);
		scores.add(150);
		scores.add(250);
		scores.add(400);
		scores.add(360);//tail
		
//		System.out.println(scores);
//		System.out.println(scores.get(3));
//		System.out.println(scores.getFirst());
//		System.out.println(scores.getLast());

//		System.out.println(scores.removeFirst());
//		System.out.println(scores.removeLast());
//		System.out.println(scores.removeFirstOccurrence(300));
//		Integer intObj = 150;
//		System.out.println(scores.removeLastOccurrence(300));
//		System.out.println(scores.remove(intObj));

		scores.push(900);//FIFO
		scores.push(500);
		scores.push(400);
		scores.pop();
		System.out.println(scores);


		

	}

}
