package java_basics;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Compound Assignment Operator
		//+= -= *= /= %= ++ = -- =
		
		//int x =5;
		//x= x+5;
		//x+=5;
//		x -= 5;
//		x *= 5;
//		x /= 5;
//		x %= 5;
		
//		x=x+1;
//		++x; x++;
		//System.out.println(x);
		
		//Logical or Conditional
		
		
		int x =10;
		int y = 20;
		int z = 30;
//		boolean flag = true;
//		
//		boolean result = x >y || x<z;//false true = true
//		
//		boolean inverseResult = !(x <y /*true*/);
//		System.out.println(flag);
//		System.out.println(result);
//		System.out.println(inverseResult);
//		
		
		//short circuit
		//statemen, expressions
		//cimpiler order left right
		boolean result1 = x < y && ++x == 10 && ++y ==21 && z < 50 && ++z ==31;//true true
		/*
		 * result(result) is assigned
		 * x -> 10 is less than 20 
		 * true && 11 equal to 11
		 * true && true && 21 ET 21
		 * true && true && true 31 ET 31
		 * -> true && true && true && true
		 * true && true&& true
		 * true && true = true
		 */
		//condition 1 - x>y false 
		//condition 2 - x%2 = 0
		System.out.println(x);
		System.out.println(y);
	    System.out.println(z);
		System.out.println(result1);
		
		
		
		
		
		
		//Arithmetic operators
		
		//Expressional operator
	    //true or false
		
		//Equality operator Referance Variable
		
//		int op1 =100;
//		int op2 =200;
//		
//		boolean b1 = true;
//		boolean b2 = false;
//		System.out.println(b1==b2);	
//		System.out.println(b1!=b2);
//
//
//		
//		System.out.println(op1==op2);
//		System.out.println(op1!=op2);


		
		int op1 = 100;
		int op2 = 200;
		boolean result = op2>op1;
		System.out.println(10>20);
		System.out.println(10<20);
		System.out.println(10>=20);
		System.out.println(10<=20);
		System.out.println(10>=10);
		System.out.println("result"+result);
//


//		int negative = -100;
//		System.out.println(negative);
		
		//int x = 10;
		//Pre ++x = 11
		//Post x++ =10   11
//		int operand1 =100;
//		int operand2 = 200;
		//System.out.println(++x);//11
		//System.out.println(x++);//10   +1 = 11

//		
//		int resultAdd = 100-200;
//		System.out.println(resultAdd);
//
//		
//		System.out.println(10+20);
//		System.out.println(40-20);
//		System.out.println(10*20);
//		System.out.println(40/2);
//		System.out.println(20%7);
		
		


		
		

	}

}
