package om;

public class LargestAndSmallestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc aa abcd abcde dsa bc";
		String[] s1=s.split(" ");
		
		
		for (int i = 0; i < s1.length; i++) 
		{
			System.out.println(s1[i]);
		}
		
		for (int i = 0; i < s1.length; i++) 
		{
			for (int j =i+1; j < s1.length; j++) 
			{
				if(s1[i].length()>(s1[j].length()))
				{
					String c=s1[i];
					s1[i]=s1[j];
					s1[j]=c;
					
				}
			}
			System.out.print(s1[i]+" ");
		}
		
		

	}

}
