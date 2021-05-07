

package PracticeVariation;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[]= {2,5,7,8,4,6,3};
           for (int i = 1; i < a.length; i++) 
           {
			for (int j = i; j >0; j--) 
			{
				if(a[j]<a[j-1])
				{
					int c=a[j];
					a[j]=a[j-1];
					a[j-1]=c;
				}
				
			}
		   }
           System.out.println(Arrays.toString(a));
	}

}
