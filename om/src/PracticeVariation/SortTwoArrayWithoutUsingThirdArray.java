package PracticeVariation;

import java.util.Arrays;

public class SortTwoArrayWithoutUsingThirdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,6,3,5};
        int b[]= {2,7,9,8,0};
        
        for (int i = 0; i <a.length+b.length; i++) 
        {
			for (int j = 0; j <a.length+b.length; j++) 
			{
				if(i<a.length&&j<a.length&&a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else if(i>=a.length&&j>=b.length&&b[i-a.length]>b[j-a.length])
				{
					int temp=b[i-a.length];
					b[i-a.length]=b[j-a.length];
					a[j-a.length]=temp;
				}
				else if(i<=a.length&&j>=a.length&&a[i]>b[j-a.length])
				{
					int temp=a[i];
					a[i]=b[j-a.length];
					b[j-a.length]=temp;
					
				}
				if(i>=a.length&&j>=a.length&&b[i-a.length]>a[j])
				{
					int temp=b[j-a.length];
					b[i-a.length]=a[j];
					a[j]=temp;
				}
				
			}
		}
        
        
      System.out.println(Arrays.toString(a)); 
      System.out.println(Arrays.toString(b));

	}

}
