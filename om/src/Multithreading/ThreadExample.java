package Multithreading;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread1 mt=new MyThread1();
		mt.start();
		MyThread2 mt2=new MyThread2();
		mt2.start();
		
		for (int i = 0; i <20; i++) 
		{
			Thread.sleep(1000);
			System.out.println("hii main thread"+Thread.currentThread());
		}
		
	}

}
