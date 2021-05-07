package ArrayPractice;

import java.util.Arrays;

public class Today {

 public static void main(String[] args) 
 {

    int a[]= {1,2,3,4,5,6,7};

       for (int i = 0; i < a.length/2; i++) 
       {
		    for (int j =a.length-1; j>=0; j--) 
		    {
		    	if(a[i]%2!=0&&a[j]%2==0)
			    {
			    	int c=a[i];
			    	a[i]=a[j];
			    	a[j]=c;
			    	break;
			    }	
			}
	   }
       System.out.println(Arrays.toString(a));
 }
		
	
		
}
