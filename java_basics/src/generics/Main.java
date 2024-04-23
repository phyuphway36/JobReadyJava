package generics;

import oop_part1.object_class.Student;

public class Main {
	
	static <E> void printArray(E[] array) {
		for(E e:array)
			System.out.print(e + "");
		System.out.println();
	}
	
	static <T extends Comparable<T>> T max(T t1,T t2,T t3,T t4) {
		T max = t1;
		
		if(t2.compareTo(max)>0)
			max = t2;

		if(t2.compareTo(max)>0)
			max = t3;

		if(t2.compareTo(max)>0)
			max = t2;
		
		return max;
	}
	static void doubleOrdoubleParent(Box<? super Double> box) {
		if(box.get() instanceof Double)
			System.out.println("This box is double box");
		else
			System.out.println("This box is double Parent box");

			
	}
	
	static void numberBoxIdentifier(Box<? extends Number> box) {
		System.out.println("This box is Number Box");
	}
	//Invariation
	static void boxIdentifier(Box<?> box) {
		 if(box.get().getClass().toString().contains("Integer"))
			 System.out.println("This box contian Integer Object");
		 if(box.get().getClass().toString().contains("Double"))
			 System.out.println("This box contain double Object");
		 if(box.get().getClass().toString().contains("String"))
			 System.out.println("This box contain String object");
		 if(box.get().getClass().toString().contains("Student"))
			 System.out.println("This box contain Student object");

	}

	public static void main(String[] args) {
		
		Box<Integer> integerBox = new Box<>();
		integerBox.add(200);
//		doubleOrdoubleParent(integerBox);
//		boxIdentifier(integerBox);
//		integerBox.add(30.0);//type safety
//		System.out.println(integerBox);
//		System.out.println(integerBox.get());
		
		Box<Double> doubleBox = new Box<>();
		doubleBox.add(30.77);
		doubleOrdoubleParent(doubleBox);
//		numberBoxIdentifier(doubleBox);
//		boxIdentifier(doubleBox);
//		System.out.println(doubleBox);
//		System.out.println(doubleBox.get());
		
		Box<Number> numberBox = new Box<>();
		numberBox.add(345.789);
		doubleOrdoubleParent(numberBox);
		
		Box<Object> objectBox = new Box<>();
		objectBox.add(100000);
		doubleOrdoubleParent(objectBox);
		
		Box<String> stringBox = new Box<>();
		stringBox.add("Money");
//		numberBoxIdentifier(stringBox);

//		boxIdentifier(stringBox);
//		System.out.println(stringBox);
//		System.out.println(stringBox.get());
//		
	
		Box<Student> studentBox = new Box<>();
		Student s1 = new Student(1001, "MGMg", "IT");
		studentBox.add(s1);
//		numberBoxIdentifier(studentBox);
//		boxIdentifier(studentBox);
//		System.out.println(studentBox);
//		System.out.println(studentBox.get());
		// TODO Auto-generated method stub
//		Integer[] intArray = {10,20,30,40};
//		printArray(intArray);
//		
//		Double[] doubleArray = {20.44,50.66,78.99};
//		printArray(doubleArray);
//		
//		String[] stringArray = {"Myanmar","UK", "Japan"};
//		printArray(stringArray);
//		
//		System.out.println("Max Object is" +max(200,400,150,80));
//		System.out.println("Max Object is" +max(20.9,40.6,15.78,12.7));
//		System.out.println("Max Object is" +max("Mango","Banana","PineApple","Papaya"));
//		
//		Student s1 = new Student(1001,"MgMg","IT");
//		Student s2 = new Student(1002,"MgAung","EC");
//		Student s3 = new Student(1003,"MgMya","ICT");
//		Student s4 = new Student(1004,"MgBa","CS");
//		
//		System.out.println("Max Student is"+max(s1,s2,s3,s4));
		
//		
//		NumberBox<Number> numberBox = new NumberBox<>();
//		numberBox.add(200);
//		System.out.println(numberBox);
//		System.out.println(numberBox.get());
//		
//		NumberBox<Long> LongNumberBox = new NumberBox<>();
//		LongNumberBox.add(24353465L);
//		System.out.println(LongNumberBox);
//		System.out.println(LongNumberBox.get());
//		
//		NumberBox<Float> floatBox = new NumberBox<>();
//		floatBox.add(24353465f);
//		System.out.println(floatBox);
//		System.out.println(floatBox.get());
		
//		NumberBox<String> stringBox = new NumberBox<>();
		
//		Student s1 = new Student(1001, "MGMg", "IT");
//		NumberBox<Student> stringBox = new NumberBox<>();

		
		
		
		
//		Box<Integer> integerBox = new Box<>();
//		integerBox.add(200);
////		integerBox.add(30.0);//type safety
//		System.out.println(integerBox);
//		System.out.println(integerBox.get());
//		
//		Box<Double> doubleBox = new Box<>();
//		doubleBox.add(30.77);
//		System.out.println(doubleBox);
//		System.out.println(doubleBox.get());
//		
//		Box<String> stringBox = new Box<>();
//		stringBox.add("Money");
//		System.out.println(stringBox);
//		System.out.println(stringBox.get());
//		
	
//		Box<Student> studentBox = new Box<>();
//		Student s1 = new Student(1001, "MGMg", "IT");
//		studentBox.add(s1);
//		System.out.println(studentBox);
//		System.out.println(studentBox.get());
	}

}
