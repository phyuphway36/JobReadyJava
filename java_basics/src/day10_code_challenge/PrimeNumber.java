package day10_code_challenge;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public class Main
//		{
//			public static void main(String[] args) {
//				
//				for(int i=1;i<=100;i++){
//				    if(checkPrime(i)){
//				        System.out.print(i+" " );
//				    }
//				}
//			}
//			public static boolean checkPrime(int num){
//			    
//			   // 0, 1 and negative numbers are not prime
//			    if(num<2){
//			        return false;
//			    }
//			    else{
//			        // no need to run loop till num-1 as for any number x the numbers in
//		    // the range(num/2 + 1, num) won't be divisible anyways. 
//		    // Example 36 wont be divisible by anything b/w 19-35
//			        int x= num/2;
//			        for(int i=2;i<x;i++){
//			            if(num%i==0){
//			                return false;
//			            }
//			        }
//			    }
//			    // the number would be prime if we reach here
//			    return true;
//			}
//		}
		for(int i=500;i<=1000;i++) {
			
		
			if(i%2!=0)
				System.out.println(i +" is prime number");
			
			
		}

			
		}

	}

	

