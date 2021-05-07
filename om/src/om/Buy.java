package om;

public class Buy extends Thread {
	synchronized void buy()
	{
		for (int i = 0; i <10; i++) 
		{
			System.out.println(i);
		}
	}
	public void run()
	{
		buy();
	}

}
