package SurpriseTest;

import java.util.Arrays;

public class Q4 {

	static int a[]=new int [5];
	static int index=0;
	public static void push(int i) 
	{
		a[index++]=i;
	}
	public static void pop() 
	{
		a[--index]=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			push(10);
			push(20);
			push(30);
			
			pop();
			


			
			System.out.println(Arrays.toString(a));

	}

}
