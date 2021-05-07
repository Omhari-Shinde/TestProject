package PracticeVariation;

import java.util.Arrays;

public class HefshineSecondSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,7,8,4,6,3};
		int start=0;
		int end=a.length-1;
		int minindex=0;
		int maxindex=0;
		while(end>start)
		{
		 minindex=start;
		 maxindex=end;
		 for (int i =start; i <=end; i++) 
		 {
			if(a[i]<a[minindex])
			{
				minindex=i;
			}
			if(a[i]>a[maxindex])
			{
				maxindex=i;
			}
		 }
		 
		int temp=a[end];
		 a[end]=a[maxindex];
		 a[maxindex]=temp;
		 temp=a[start];
		 a[start]=a[minindex];
		 a[minindex]=temp;
		 start++;end--;
		}
		System.out.println(Arrays.toString(a));

	}

}
