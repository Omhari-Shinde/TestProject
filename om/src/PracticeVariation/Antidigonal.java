package PracticeVariation;

import java.util.ArrayList;

public class Antidigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[][]= {
	    		   {1,2,3,4},
	    		   {5,6,7,8},
	    		   {9,1,2,3},
	    		   {4,5,6,7}
	       };
	       ArrayList<Integer> li=new ArrayList<>();
	       for (int i = 0; i < a.length; i++) 
	       {
			  for (int j = 0; j < a.length; j++) 
			  {
				if(i+j!=3&&j-i!=0)
				{
					li.add(a[i][j]);
				}
			  }
			  System.out.println();
		   }
			
			System.out.println(li);
           

	}

}
