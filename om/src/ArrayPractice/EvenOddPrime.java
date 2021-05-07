package ArrayPractice;

import java.util.Arrays;

public class EvenOddPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int a[]= {1,2,3,4,5,6,7,8,9};
		   int ecnt=0;
		   int ocnt=0;
		   int pcnt=0;
		   for (int i = 0; i < a.length; i++) 
		   {
			 if(a[i]%2==0)
			 {
				ecnt++; 
			 }
			 else
			 {
				 ocnt++;
			 }
			 if(isprime(a[i]))
			 {
				 pcnt++;
			 }
			
		   }
		   System.out.println(pcnt+" prime ");
		   System.out.println(ocnt+" odd ");
		   System.out.println(ecnt+" even ");
		   int o[]=new int[ocnt];
		   int e[]=new int[ecnt];
		   int p[]=new int[pcnt];
		   int eindex=0;
		   int oindex=0;
		   int pindex=0;
		   for (int i = 0; i < a.length; i++) 
		   {
			if(a[i]%2==0)
			{
				e[eindex++]=a[i];
			}
			else
			{
				o[oindex++]=a[i];
			}
			if(isprime(a[i]))
			{
				p[pindex++]=a[i];
			}
		   }

		   System.out.println(Arrays.toString(e));
		   System.out.println(Arrays.toString(o));
		   System.out.println(Arrays.toString(p));
		}

		private static boolean isprime(int a) 
		{
			boolean flag=true;
			for (int i = 2; i<a; i++) 
			{
				if(a%i==0)
				{
					flag=false;
					break;
				}
				
			}
			
			return flag;
		

	}

}
