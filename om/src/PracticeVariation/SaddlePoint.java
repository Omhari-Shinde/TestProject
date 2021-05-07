package PracticeVariation;

public class SaddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{2,3,4},
				{9,7,8},
				{1,2,3}
		};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				int rcount=0;
				for (int k = 0; k < a.length; k++) 
				{
					if(a[i][k]<a[i][j])
					{
						rcount++;
					}
				}
				int ccount=0;
				for (int k = 0; k < a.length; k++) 
				{
					if(a[k][j]>a[i][j])
					{
						ccount++;
					}
				}
				if(rcount==0&&ccount==0)
				{
					System.out.println(a[i][j]);
				}
			}
			
		}

	}

}
