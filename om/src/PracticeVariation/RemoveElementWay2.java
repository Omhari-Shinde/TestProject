package PracticeVariation;

import java.util.Arrays;

public class RemoveElementWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove element from an array without using array
		//multipal occure then remove all
		int a[]= {1,4,2,3,4,5,4};
		int ele=4;
		int count=findCount(a,ele,0);
		System.out.println(count);
		int b[]=new int[a.length-count];
		if(count==0)
		{
			b=a;
		}
		else
		{
			addAinB(a,b,0,0,ele);
		}
		
         System.out.println(Arrays.toString(b));
	}

	private static void addAinB(int[] a, int[] b, int i, int j, int ele) {
		if(i<a.length && j<b.length && a[i]!=ele)
		{
			b[j++]=a[i++];
			addAinB(a, b, i, j, ele);
		}
		else if(i<a.length && j<b.length)
		{
			addAinB(a, b, ++i, j,ele);
		}
		
	}

	static int  cnt=0; 
	private static int findCount(int[] a, int ele, int i) {
		if(i<a.length)
		{
			if(a[i]==ele)
			{
				cnt++;
				findCount(a, ele, ++i);
			}
			else
			{
				findCount(a, ele, ++i);
			}
		}
		return cnt;
	}

}
