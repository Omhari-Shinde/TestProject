package ArrayPractice;

import java.util.Arrays;

public class TwoDimentionalArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
	    		  {2,5,6},
	    		  {1,3,4},
	    		  {7,4,2,9}
	      };
	      int cnt=0;
	      for (int i = 0; i < a.length; i++) 
	      {
			for (int j = 0; j <a[i].length; j++) 
			{
				cnt++;
			}
		  }
	      System.out.println(cnt);
	      
	      int b[]=new int[cnt];
	      int index=0;
	      for (int i = 0; i < a.length; i++) 
	      {
			for (int j = 0; j < a[i].length; j++) 
			{
				b[index++]=a[i][j];
			}
		  }
	      
	      for (int i = 0; i < b.length; i++) 
	      {
			for (int j =i+1; j < b.length; j++) 
			{
				if(b[i]>b[j])
				{
					int c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
		  }
	      
	      System.out.println(Arrays.toString(b));
	      int index2=0;
	      for (int i = 0; i < a.length; i++) 
	      {
			for (int j = 0; j < a.length; j++)
			{
				a[i][j]=b[index2++];
			}
		  }
	      
	      for (int i = 0; i < a.length; i++) 
	      {
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		  }


	}

}
