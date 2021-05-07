package om;

public class ShortStringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "43215";
		char ca[]=s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j =i+1; j < ca.length; j++) 
			{
				if(ca[i]>ca[j])
				{
					char c=ca[i];
					ca[i]=ca[j];
					ca[j]=c;
				}
			}
			System.out.println(ca[i]);
		}

	}

}
