package Dedlock;

public class T2 extends Thread {
	Shop s1;
    Shop s2;
	  
public T2(Shop s1, Shop s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run() 
	{

     s1.abcd(s2);
	}

}
