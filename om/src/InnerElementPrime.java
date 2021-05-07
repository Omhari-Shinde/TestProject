import java.util.Arrays;

public class InnerElementPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
	    		 {1,5,3},
	    		 {4,5,6},
	    		 {7,3,9}
	    		 }; 
	     int cnt=0;
	     for (int i = 0; i < a.length; i++) 
	     {
			for (int j = 0; j < a.length; j++) 
			{
				if(j-i!=0&&i+j!=2)
				{
					 cnt++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		 }
	     
	     int b[]=new int[cnt];
	     System.out.println(b.length);
	     int index=0;
	     for (int i = 0; i < a.length; i++) 
	     {
			for (int j = 0; j < a.length; j++) 
			{
				if(j-i!=0&&i+j!=2)
				{
					 b[index++]=a[i][j];
				}
				
			}
			System.out.println();
		 }
	     System.out.println(Arrays.toString(b));
	     int cnt2=0;
	     int sum=0;
	     for (int i = 0; i < b.length; i++) 
	     {      cnt2=0;
			for (int j = 2; j <b[i]; j++) 
			{
				if(b[i]%j==0)
				{
					cnt2++;
					
				}
			}
			if(cnt2==0)
			{
				sum=sum+b[i];
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
			}
			
		 }
	     System.out.println(sum);    

	}

}
