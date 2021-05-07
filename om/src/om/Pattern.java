package om;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		for (int i = 0; i <9; i++) 
//		{
//			for (int j = 0; j <5; j++) 
//			{
//				if(i+j>=4 && j-i>=-4)
//				{
//				System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
		for (int i = 0; i <=4; i++) 
		{
			for (int j = 0; j <=2 ; j++) 
			{
				if (j-i<=0 && i+j<=4) 
				{
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		System.out.println();
		
		for (int i = 0; i <=4; i++) 
		{
			for (int j = 0; j <=2 ; j++) 
			{
				if (j-i<=-2 || i+j<=2) 
				{
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		

	}

}
