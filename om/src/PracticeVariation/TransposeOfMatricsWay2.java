package PracticeVariation;

public class TransposeOfMatricsWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[][]= {
				  {1,2,3,4},
				  {5,6,7,8},
				  {9,1,2,3},
				  {4,5,6,7}
		  };
		  int temp=a[0][0];
		  a[0][0]=a[0][a[0].length-1];
		  a[0][a[0].length-1]=temp;
		  
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
