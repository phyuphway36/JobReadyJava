package functiontr;

import java.util.function.Function;

public class SimpleFunctionTest {
	public static void main(String[] args) {
		Function<Integer,Double> oneFourthFunc = number -> number/4.0;
		
		System.out.println(oneFourthFunc.apply(100));
		
		System.out.println("Number->oneFourth andthen tri"
		+oneFourthFunc.andThen(number -> number*3).apply(100));
		
		Function<Integer,Integer > tri = number -> number *3;
		
		System.out.println("Number ->oneFourth->triResult :"+oneFourthFunc.compose(tri).apply(100));
		
		Function<Double, Double> identityFunc = Function.identity();
		System.out.println("Identity:"+identityFunc.apply(1000.0));
}
}