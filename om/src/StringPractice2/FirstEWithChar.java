package StringPractice2;

public class FirstEWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1="omhari";
         String s2="omp";
         
         if(s2.length()<s1.length())
         {

              int i=0;
              int j=0;
              int cnt=0;
              while(cnt<s2.length())
              {
            	  if(s1.charAt(i)!=s2.charAt(j))
            	  {
            		  System.out.println("false");
            		  break;
            	  }
            	  i++;
            	  j++;
            	  cnt++;
              }
         if(cnt==s2.length()) 
         {
        	 System.out.println("true");
         }
		 
         }
         else
         {
        	 System.out.println("false");
         }


	}

}
