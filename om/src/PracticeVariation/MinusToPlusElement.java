package PracticeVariation;

import java.util.Arrays;

public class MinusToPlusElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,2,3,-5,-8,-2};
         for (int i = 0; i < a.length; i++) 
         {
			if(a[i]<0)
			{
				a[i]=a[i]*-1;
			}
		  }
         System.out.println(Arrays.toString(a));

	}

}
