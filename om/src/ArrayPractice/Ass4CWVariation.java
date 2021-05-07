package ArrayPractice;

import java.util.Arrays;

public class Ass4CWVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,-2,3,-4,5,6,-7,8};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}

System.out.println(Arrays.toString(a));
for (int i = 0; i < a.length; i++) 
{
	for (int j = i+1; j < a.length; j++) 
	{
		if(a[i]<0)
		{
			int c=a[i];
			a[i]=a[j];
			a[j]=c;
		}
	}
}
System.out.println(Arrays.toString(a));


	}

}
