package om;

public class Item extends Thread {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sell s=new Sell();
		 Buy b=new Buy();
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		t2.start();


	}

}
