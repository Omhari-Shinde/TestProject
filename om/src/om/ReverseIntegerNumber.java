package om;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a=12345;
	       int rev=0;
	      int rem=0;
	       while(a>0)
	       { 

	          rem= a%10;
	          rev=rev*10+rem;
	          a=a/10;
	       }
	          System.out.println(rev);



	}

}
