package TechLead;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
		           {1,2,3},
		           {4,5,6},
		           {9,8,9}
		             };
		int mul1=1;
		int mul2=1;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(j-i==0)
				{
					mul1=mul1*a[i][j];
				}
				if(i+j==2)
				{
				    mul2=mul2*a[i][j];	
				}
			}
		}
		System.out.println("Multiplication of first digonal="+mul1);
		System.out.println("Multiplication of second digonal="+mul2);
		int sum=mul1+mul2;
		System.out.println("Sum of both digonal="+sum);
		

	}

}
