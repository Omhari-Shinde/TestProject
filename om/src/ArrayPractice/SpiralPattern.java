
package ArrayPractice;

public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a[][]=new int[n][n];
		int mini=0;
		int maxi=a.length-1;
		int minj=0;
		int maxj=a.length-1;
		int cnt=1;
		int limit=(n+1)/2;
		for (int k = 0; k <limit; k++) 
		{
		for (int j =minj; j <=maxj; j++) 
		{
			a[mini][j]=cnt;
			cnt++;
		}
		mini++;
		for (int i =mini; i <=maxi; i++)
		{
			a[i][maxj]=cnt;
			cnt++;
		}
		maxj--;
		for (int j =maxj; j >=minj; j--) 
		{
			a[maxi][j]=cnt;
			cnt++;
		}
		maxi--;
		for (int i = maxi; i>=mini; i--)
		{
			a[i][minj]=cnt;
			cnt++;
		}
		minj++;
		
		
		}
		
		
		
		//print
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{ 
				if(a[i][j]>9)
				
				System.out.print(a[i][j]+" ");
				else
				
					System.out.print(a[i][j]+"  ");
				
				
			}
			System.out.println();
		}

	}

}
