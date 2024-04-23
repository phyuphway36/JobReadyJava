package thread;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) /*throws InterruptedException */{
		
		BankAccount task1  = new BankAccount(110);
//		BankAccount task2  = new BankAccount(130);


		
		Thread user1 = new Thread(task1);
		user1.setName("User1");
		
		Thread user2 = new Thread(task1);
		user2.setName("User2");
		
		//Race Condition
		user1.start();
		
		user2.start();
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside Main");
		
//		try {
//			user1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(task1.getBalance());

//		ThreadDemo thread1 = new ThreadDemo();//Born Runnable
//		thread1.start();//Running
//		thread1.setPriority(Thread.MAX_PRIORITY);
		
//		ThreadDemo thread2 = new ThreadDemo();
//		thread2.start();
//		thread2.setPriority(8);
		
//		try {
//			Thread.sleep(3000);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}//current Thread
		
		

//		Task2 task2 = new Task2();//runnable obj
//		
//		Thread thread3 = new Thread(task2);
//		thread3.start();
//		thread3.setPriority(6);
//		
//		Thread thread4 = new Thread(task2);
//		thread4.start();
//		thread4.setPriority(Thread.MIN_PRIORITY);
//		
//		System.out.println("Inside Main Method");//Main Thread

	}
	}
