package thread;

public class Task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method1();
	}
	private void method1() {
		for(int i =1 ; i<=10;i++) {
			System.out.println(Thread.currentThread()+"do process "+i);
		}
	}


}
