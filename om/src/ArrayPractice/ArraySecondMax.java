package ArrayPractice;

public class ArraySecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,0,2,3,4};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("first max="+max);
		int max2=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max2&&a[i]!=max)
			{
				max2=a[i];
			}
		}
		System.out.println("second max="+max2);
		
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("first min="+min);
		
		int min2=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min2&&a[i]!=min)
			{
				min2=a[i];
			}
		}
		System.out.println("second min="+min2);
		

	}

}
