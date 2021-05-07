package PracticeVariation;

public class ThreeDArrayFirstEvenOddSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][][]= {
				{
					{1,2,3},
				    {4,5,6},
				    {9,8,7}
				},
				{
					{9,8,7},
					{6,5,4},
					{8,6,5}
				},
				{
					
				{9,8,7},
				{6,5,4},
				{8,6,5}
				}
			   };
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				for (int k = 0; k < a.length; k++) 
				{
					for (int p = 0; p < a.length; p++) 
					{
						for (int q = 0; q < a.length; q++) 
						{
							for (int r = 0; r < a.length; r++) 
							{
								if(a[i][j][k]%2==0&&a[p][q][r]%2!=0)
								{
									int c=a[i][j][k];
									a[i][j][k]=a[p][q][r];
									a[p][q][r]=c;
								}
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				for (int k = 0; k < a.length; k++) 
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
		

	}

}
