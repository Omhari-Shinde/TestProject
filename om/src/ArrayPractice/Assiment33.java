package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;
   
public class Assiment33
{  
    private static boolean[] prime;

	public static void main(String args[])
    {     int n=10;
    int a[]=new int[n];
    int index=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 10 value");
      for (int i = 0; i <n; i++) 
      {
		 a[index++]= sc.nextInt();
		
	  }
      for (int i = 0; i < a.length; i++) 
      {
    	  if(a[i]>=0)
  		{
  			System.out.println("positive"+a[i]);
  		}
    	  if(a[i]<0)
  		{
  			System.out.println("negative"+a[i]);
  		}
    	  if(a[i]%2==0)
  		{
  			System.out.println("even"+a[i]);
  		}
    	  if(a[i]%2!=0)
  		{
  			System.out.println("odd"+a[i]);
  		}
    	  if(prime(a[i]))
  		{
    		  if(a[i]>0)
  			System.out.println("prime"+a[i]);
  		}
	  }
      
    }

	private static boolean prime(int i) 
	{
		boolean flag=true;
		// TODO Auto-generated method stub
		for (int j =2; j <i; j++) 
		{
			if(i%j==0)
			{
			flag=false;
			}
		}
		return flag;
	}
}