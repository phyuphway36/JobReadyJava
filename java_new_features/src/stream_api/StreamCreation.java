package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		Stream<String> arrayStream = Stream.of("MgMg","AungAung","MgKyaw","MgAung");
		
		arrayStream.forEach(System.out::println);
		
		//avoid NullPointer
		Stream<Integer> emptyStream = Stream.empty();
		System.out.println(emptyStream);
		
		List<String> fruitsList = Arrays.asList("Mango","Apple","Banana","Papaya");
		Stream<String> listStream = fruitsList.stream();
		listStream.forEach(System.out::println);
		
		String[] countryArray = {  "Myanmar","Japan","Thailand","Korea","Singapore"};
		
		Stream<String> countryStream = Arrays.stream(countryArray);
		countryStream.forEach(System.out::println);
		
		Stream<String> countryPartialStream = Arrays.stream(countryArray,1,4);
		countryPartialStream.forEach(System.out::println);
	}

}
