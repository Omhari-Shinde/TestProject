package ArrayPractice;

import java.util.Scanner;

public class MultiplicationOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("enter row * col matrics");
	       int row=sc.nextInt();
	       int col=sc.nextInt();
	       int a[][]=new int [row][col];
	       int b[][]=new int [row][col];
	       int c[][]=new int [row][col];
	       System.out.println("enter"+(row*col)+"element");
	       for (int i = 0; i < a.length; i++) 
	       {
			for (int j = 0; j < a.length; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		   }
	       for (int i = 0; i < a.length; i++) 
	       {
			for (int j = 0; j < a.length; j++) 
			{
				System.out.println(a[i][j]);
			}
		   }
	       System.out.println("enter"+(row*col)+"element");
	       for (int i = 0; i < a.length; i++) 
	       {
			for (int j = 0; j < a.length; j++) 
			{
				b[i][j]=sc.nextInt();
			}
		   }
	       for (int i = 0; i < a.length; i++) 
	       {
			for (int j = 0; j < a.length; j++) 
			{
				System.out.println(b[i][j]);
			}
		   }
	       
	       for (int i = 0; i < c.length; i++) 
	       {
			for (int j = 0; j < c.length; j++) 
			{
				for (int k = 0; k < c.length; k++) 
				{
					c[i][j]+=a[i][k]*a[k][j];
			    }
				
			}
		   }
	       
	     for (int i = 0; i < c.length; i++) 
	     {
		     for (int j = 0; j < c.length; j++) 
		     {
				System.out.print(c[i][j]);
			 }
		     System.out.println();
	     }


	}

}
