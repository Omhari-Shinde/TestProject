package ArrayPractice;

import java.util.Arrays;

public class PositiveNegativeVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,-2,-3,4,5,5,-6};

        for (int i = 0; i < a.length; i++) 
        {
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
				
			}
		 }
        for (int i = 0; i < a.length; i++) 
        {
			for (int j =i+1; j < a.length; j++) 
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
