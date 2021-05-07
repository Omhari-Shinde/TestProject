package om;

public class Sell extends Thread{
	synchronized void sell()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i);
		}
	}
	 public void run()
	 {
		sell() ;
	 }

}
