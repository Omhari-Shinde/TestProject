package GsLab;

public class CountNuberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="madam";
		String s2="";
		int cn=0;
		

		for (int i = 0; s1.charAt(i)!='\0'; i++) 
		{
			s2=s2+s1.charAt(i);
		}
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)!=s2.charAt(i)) {
				System.out.println("not ");
				
				cn++;
				break;
			}
			
			}
		if (cn==0) {
			System.out.println("pal");
		}
		}
		
//		if(s1.equals(s2))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//		
		
	}
