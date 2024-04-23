package thread;

public class BankAccount implements Runnable{

	private int balance;//mutable value
	
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}


	@Override
	public  void run() {
		// TODO Auto-generated method stub
		withdrawn(70);
	}

	public  void  withdrawn(int amount) {
//		synchronized (this) {}//synchronized block
		if(amount <= this.balance) {
			
			System.out.println(Thread.currentThread().getName()+" is about to withdraw");
			this.balance -= amount;
			System.out.println(Thread.currentThread().getName()+" withdrawns "+ amount);
		}
		else
			System.out.println("Your withdrawn amount exceeds balance!");
		
//		Thread currentThread = Thread.currentThread();
//		try {
//			currentThread.wait(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}


	public synchronized int getBalance() {
		return balance;
	}


	public synchronized void setBalance(int balance) {
		this.balance = balance;
	}
	
}
