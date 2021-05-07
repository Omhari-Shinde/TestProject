package ArrayPractice;

public class PreeQ2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,-1,4,5,6,-3,-4};
		for (int i = 0; i <a.length; i++) 
		{
			for (int j =0; j < a.length; j++) 
			{
				if(a[i]>a[j]&& i>0&& j>0)
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
