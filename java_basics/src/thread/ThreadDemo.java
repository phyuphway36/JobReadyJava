package thread;

import java.util.Iterator;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Runnable Processes
		method1();
	}
	private void method1() {
		for(int i =1 ; i<=10;i++) {
			System.out.println(Thread.currentThread()+"do process "+i);
			if(i == 6 ) {
				//Thread.yield();
				System.out.println(Thread.interrupted());
				//check current thread interrupted 
				}
		}
	}
	
}
