package ArrayPractice;

public class Assignment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int k1=3;
	          int a[]= {3,7,90,20,5,50,40};
	        int index=0;
	          int avg1=Integer.MAX_VALUE;
	          for (int i = 0; i < a.length-k1+1; i++) 
	          {  
				for (int j = i+1; j < a.length-1; j++)
				{  
					for (int k =j+1; k < a.length; k++) 
					{
					   	int sum=a[i]+a[j]+a[k];
					 int avg=sum/k1;
					   	if(avg<avg1)
					   	{
					   		avg1=avg;
					   		index=i;
					   	}break;
					}
					break;
				}
			  }
	   System.out.println("index="+index);
	   System.out.println("average="+avg1);


	}

}
