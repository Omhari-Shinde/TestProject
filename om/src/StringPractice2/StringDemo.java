package StringPractice2;

public class StringDemo {

	public static void main(String[] args) {
     String s="   abc    def     ghi   ";
     int si=0;
     int ei=s.length()-1;;
     String s2="";
       for (int i = 0; i <s.length(); i++) 
       {
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			si=i;
			break;
		}
	   }
       System.out.println(s.charAt(si));
       System.out.println();
       for (int i =s.length()-1; i>=0; i--) 
       {
		if(s.charAt(i)!=' ')
		{
			ei=i;
			break;
		}
	   }
       
		System.out.println(s.charAt(ei));
	s2="";
	 for (int i = si; i <=ei; i++)
	 {
		s2=s2+s.charAt(i);
	}
System.out.println(s2);
 String s3="";
for (int i = 0; i <= s2.length()-1; i++) 
{
	if(s2.charAt(i)==' '&& s2.charAt(i+1)==' ')
	{
		
	}
	else
	{
		s3=s3+s2.charAt(i);
	}
}
System.out.println(s3);
	}

}
