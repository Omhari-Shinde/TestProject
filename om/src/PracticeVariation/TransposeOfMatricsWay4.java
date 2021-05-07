package PracticeVariation;

public class TransposeOfMatricsWay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// transpose matrics but digonal element donot swap
		//without using additional array
		 int a[][]= {
				  {1,2,3,4},
				  {5,6,7,8},
				  {9,1,2,3},
				  {4,5,6,7}
		  };
		 
		 for (int i = 0; i < a.length; i++) 
		   {
			for (int j = 0; j < a.length; j++) 
			{
				if(j-i==0||i+j==3)
				{
					
				}	
				
				else
				{
				  if(j-i>=0)
				  {
					  int temp=a[i][j];
				    a[i][j]=a[j][i];
				    a[j][i]=temp;
				  } 
					
				}
			}
				
		   }
		   
		   for (int i = 0; i < a.length; i++) 
		   {
			 for (int j = 0; j < a.length; j++) 
			 {
				System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		   }

	}

}
