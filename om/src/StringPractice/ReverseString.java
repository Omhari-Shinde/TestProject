package StringPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am in Hefshine";
		int ei=s.length()-1;
		for (int i =s.length()-1; i>=0; i--) 
		{
			if(s.charAt(i)==' ')
			{
				for (int j =i+1; j <=ei; j++) 
				{
					System.out.print(s.charAt(j));
				}
				ei=i-1;
				System.out.print(' ');
			}
			else if(i==0)
			{
				for (int j =i; j <=ei; j++) 
				{
					System.out.println(s.charAt(j));
				}
			}
		}
	//	logic two
	   String sa[] =s.split(" ");
		for (int i =sa.length-1; i>=0; i--) 
		{
			System.out.print(sa[i]+" ");
		}

	}

}
