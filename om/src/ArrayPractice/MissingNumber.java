package ArrayPractice;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,5,7,9};
		
		for (int i = 1; i < a[a.length-1]; i++) 
		{      int cnt=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(i==a[j])
				{
				  cnt++;
				}
				
			}
			if(cnt==0)
			{
				System.out.println(i);
			}
		}
	

	}

}
