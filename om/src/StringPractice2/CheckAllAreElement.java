package StringPractice2;

public class CheckAllAreElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="12345";
	        char ca[]=s.toCharArray();
	        int cnt=0;
	        
	        
	          for (int i = 0; i < ca.length; i++) 
	          {
				if(ca[i]>='0'&&ca[i]<='9')
				{
					cnt++;
				}
			  }
	          if(cnt==s.length())
	          {
	        	  System.out.println("all are element");
	          }
	          else
	          {
	        	  System.out.println("not");
	          }
			

	}

}
