package ArrayPractice;

public class SubMulMatrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2},
				{3,4}
				};
		int b[][]= {
				{5,6},
				{7,8}
				};
		int c[][]=new int[2][2];
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
				int sum=0;
				for (int k = 0; k < c.length; k++) 
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
				if(sum%2==0)
				{
					sum=sum/2;
				}
				else if(prime(sum))
				{
					sum=sum*3;
				}
				else
				{
					sum=sum/2;
				}
			}
			
		}
          
   for (int i = 0; i < c.length; i++) 
   {
	for (int j = 0; j < c.length; j++) 
	{
		System.out.print(c[i][j]);
	}
	System.out.println();
   }
			
	}
     
	private static boolean prime(int sum) 
	{ 
		boolean  flag=true;
         for (int i = 2; i <sum; i++) 
         {
        	 if(sum%i==0)
        	 {
			  flag=false;
        	 }
		 }
		return flag;
	}

}
