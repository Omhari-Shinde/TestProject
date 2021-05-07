package StringPractice;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           int a[]= {1,2,3,4,5,6,7};
           int n=2;
           int min=0;
           int max=a.length-1;
           int mid=0;
           while(min<max)
           {
        	   mid=(max-min);
        	   if(a[mid]==n)
        	   {
        		   System.out.println("index of="+mid+" "+n);
        		   break;
        	   }
        	   else if(a[mid]<n)
        	   {
        		   min=mid+1;
        	   }
        	   else
        	   {
        		   max=mid-1;
        	   }
           }
			
		}
	}


