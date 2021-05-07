package TechLead;

import java.util.Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,8,9,5,2,3,6,7};
        for (int i =0; i < a.length; i++) 
        {
		   for (int j =i+1; j < a.length; j++) 
		   {
			 if(a[i]>a[j])
			 {
				 int c=a[i];
				 a[i]=a[j];
				 a[j]=c;
			 }
			 
		   }
		 }
        System.out.println("Ascending order"+Arrays.toString(a));
        for (int i =0; i < a.length; i++) 
        {
		   for (int j =i+1; j < a.length; j++) 
			   
		   {
			 if(a[i]<a[j])
			 {
				 int c=a[i];
				 a[i]=a[j];
				 a[j]=c;
			 }
			 
		   }
		 }
        System.out.println("Decending order"+Arrays.toString(a));

	}

}
