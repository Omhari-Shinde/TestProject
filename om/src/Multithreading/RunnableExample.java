package Multithreading;

public class RunnableExample {

	public static void main(String[] args) throws InterruptedException 
	{

		RunnableImplement ri=new RunnableImplement();
		Thread th=new Thread(ri);
		th.start();
		for (int i = 0; i < 10; i++) 
		{
			Thread.sleep(1000);
			System.out.println("main thread");
		}

	}

}
