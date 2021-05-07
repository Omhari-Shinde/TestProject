package Multithreading;

public class MyThread2 extends Thread {
	
	 public void run()
	  {
		  for (int i = 0; i <20; i++) 
		  {
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			  {
				e.printStackTrace();
			   }
			System.out.println("hello mySecond Thread");
		  }
	  }

}
