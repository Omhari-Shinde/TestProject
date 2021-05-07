package MindStickExam;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b=a[a.length-1];
		for (int i =a.length-1; i>0; i--) 
		{
			a[i]=a[i-1];
					
		}
		a[0]=b;
		System.out.println(Arrays.toString(a));
		
		

	}

}
