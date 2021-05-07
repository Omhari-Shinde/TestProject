package SurpriseTest;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		           };
		for (int i = 0; i < a.length; i++) 
		{
			for (int j =0; j < a.length; j++) 
			{
			   for (int k = 0; k < a.length; k++) 
			   {
				for (int k2 = 0; k2 < a.length; k2++)
				{
					if(a[i][j]<a[k][k2])
					{
						int s=a[i][j];
						a[i][j]=a[k][k2];
						a[k][k2]=s;
					}
				}
			   } 		
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
