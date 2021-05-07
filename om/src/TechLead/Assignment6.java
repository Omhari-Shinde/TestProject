package TechLead;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,7,8,3,9,2,6};
		int min1=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min1)
			{
				min1=a[i];
			}
		}
		int min2=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min2&&a[i]!=min1)
			{
				min2=a[i];
			}
		}
		int min3=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min3&&a[i]!=min2&&a[i]!=min1)
			{
				min3=a[i];
			}
		}
		System.out.println(min3);
		

	}

}
