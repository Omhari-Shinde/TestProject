package PracticeVariation;

public class TransposeOfMatrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		int r1=0;
		int r2=2;
		for (int i = 0; i < a[0].length; i++) 
		{
			int a1=a[r1][i];
			int a2=a[r2][i];
			a[r1][i]=a2;
			a[r2][i]=a1;
			
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
