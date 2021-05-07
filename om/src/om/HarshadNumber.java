package om;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for (int i = 0; i <13; i++) 
       {
		for (int j = 0; j <17; j++) 
		{
			if(i+j>=3&&j-i>=-4&&j-i<=13&&i+j<=20)
			{
				if(i+j<11&&j-i>=6)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	   }
		

	}

}
