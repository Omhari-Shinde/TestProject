package ArrayPractice;

public class RemoveAbove4Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,1,1,1,2,4,6,4,5,3,3,3,3,3,3};
		int k=0;
		for (int i = 0; i < a.length; i++) 
		{    int cnt=0;
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{  
					
					cnt++;
					
				}
			}
			if(cnt==0||cnt<4)
			{
				System.out.println(a[i]);
			}
		}

	}

}
