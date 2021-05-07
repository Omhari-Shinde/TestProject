package PracticeVariation;

import java.util.Arrays;

public class RemoveElementWay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove element from an array without using array
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length-1];
		int index=3;
		addAinB(a,b,0,0,index);
		System.out.println(Arrays.toString(b));
		
		

	}

	private static void addAinB(int[] a, int[] b, int i, int j, int index) {
		// TODO Auto-generated method stub
		
		if(i<a.length && j<b.length && i!=index)
		{
			b[j++]=a[i++];
			addAinB(a, b, i, j, index);
		}
		else if(i<a.length && j<b.length)
		{
			addAinB(a, b, ++i, j, index);
		}
	}

}
