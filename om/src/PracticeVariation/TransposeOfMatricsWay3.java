package PracticeVariation;

public class TransposeOfMatricsWay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// transpose matrics but digonal element donot swap
		
		 int a[][]= {
				  {1,2,3,4},
				  {5,6,7,8},
				  {9,1,2,3},
				  {4,5,6,7}
		  };
		 int c[][]=new int[4][4];
		   for (int i = 0; i < a.length; i++) 
		   {
			for (int j = 0; j < a.length; j++) 
			{
				if(j-i==0||i+j==3)
					c[i][j]=a[i][j];
				else
				c[i][j]=a[j][i];
			}
		   }
		   
		   for (int i = 0; i < c.length; i++) 
		   {
			 for (int j = 0; j < c.length; j++) 
			 {
				System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		   }

	}

}
