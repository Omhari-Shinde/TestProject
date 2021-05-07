package ArrayPractice;

import java.util.Arrays;

public class QueueProgram {


	static int a[]=new int[5];
	static int index=0;
	static int index1=0;
	public static void rear(int i) 
	{
		a[index++]=i;
		
	}
	public static void front() 
	{
		a[index1++]=0;
		
	}
	


public static void main(String[] args) 
{
	rear(10);
	rear(20);
	rear(30);
	front();
	
	System.out.println(Arrays.toString(a));


}
}