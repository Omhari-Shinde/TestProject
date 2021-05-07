package Dedlock;

public class ArrayEx {

	public static void main(String[] args) {
    int k=3;
   int n=2;
   
   int arraysize=1;
   int arraycount=0;
   int cnt=1;
   int sum=0;
   while(true)
   {
	   if(isPrime(n))
	   {
		   arraycount++;
		   if(arraysize==k)
			   sum=sum+n;
		  if(arraycount==arraysize)
		  {
			  arraysize++;
			  if(arraysize>k)
				  break;
			  arraycount=0;
		  }
		  cnt++;
	   }
	   n++;
   }
System.out.println(sum);
	}

	private static boolean isPrime(int n) 
	{
		for (int i = 2; i < n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
