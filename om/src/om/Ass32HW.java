package om;

public class Ass32HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to Java World";
		char s1=s.charAt(5);
		System.out.println(s1);
		String s2="Welcome";
		int a=s.compareToIgnoreCase(s2);
		System.out.println(a);
		String s3="Let us learn ";
		String s4=s3.concat(s);
		System.out.println(s4);

		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='a')
			{
				index=i;
				break;
			}
		}
		
		System.out.println("a="+index);
		
		System.out.println(" a="+index);
		String s5=s.replace('a' ,'e');
		System.out.println(s5);
		
		for (int i = 4; i <10; i++) 
		{
			System.out.print(s.charAt(i));
			 
		}


		
		
		

	}

}
