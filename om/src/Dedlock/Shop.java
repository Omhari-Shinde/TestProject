package Dedlock;

public class Shop {

  synchronized void abcd(Shop s)
  {

     try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	  s.print();
  }
     
 synchronized void print()
  {
	  System.out.println("hii");
  }
	

}
