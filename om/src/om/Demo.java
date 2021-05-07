package om;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s1="mother in law";
		  String s2="hitler womanhj";
		  String s3="";
		  String s4="";
		  
		  for (int i = 0; i <s1.length(); i++)
		  {
			if(s1.charAt(i)!=' ')
			{
				s3=s3+s1.charAt(i);
			}
		  }
		  
		  for (int i = 0; i < s2.length(); i++) 
		  {
			if(s2.charAt(i)!=' ')
			{
				s4=s4+s2.charAt(i);
			}
		  } 
		  
		  System.out.println(s3);
		  System.out.println(s4);
		  int count=0;
		  if(s3.length()==s4.length())
		  {
			  for (int i = 0; i < s3.length(); i++) 
			  {
				for (int j = 0; j <s4.length(); j++) 
				{
					if(s3.charAt(i)==s4.charAt(j))
					{
						count++;
					}
				}
			  }
			  if(count==s4.length())
			  {
				  System.out.println("Anagram");
			  }
			  else
			  {
				  System.out.println("Not Anagram");
			  }
			  
		  }
		  else
		  {
			  System.out.println("Not Anagram");
		  }

              
          // ArrayList li=new ArrayList();   
      
	}

}
