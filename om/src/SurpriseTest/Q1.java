package SurpriseTest;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,5,6,1,8,6,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int min=0;
		int max=a.length-1;
		int mid=0;
		int n=5;
		while(min<=max)
		{
			mid=(min+max)/2;
			if(a[mid]==n)
			{
				System.out.println("index of="+mid+" "+"value="+n);
				break;
			}
			else if(n>a[mid])
			{
				min=mid+1;
			}
			else
			{
				max=mid-1;
			}
		}

	}

}
