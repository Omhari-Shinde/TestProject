package ArrayPractice;

import java.util.Arrays;

public class VishantExamQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3,4,5,6},
				{7,8,9,1,2,3},
				{4,5,6,7,8,9},
				{1,2,3,4,5,6},
				{7,8,9,1,2,3},
				{4,5,6,7,8,9}
		           };
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) 
		 {
			for (int j = 0; j < a.length; j++) 
			{
				if(i+j<5&&j-i<0)
				{
					cnt++;
				}
			}
			
		}
		
         System.out.println(cnt);
         int r []=new int [cnt];
         int l []=new int [cnt];
 		int t []=new int [cnt];
 		int b []=new int [cnt];
         int rindex=0;
         int lindex=0;
         int tindex=0;
         int bindex=0;
         for (int i = 0; i < a.length; i++) 
		 {
			for (int j = 0; j < a.length; j++) 
			{
				if(i+j<5&&j-i<0)
				{
					r[rindex++]=a[i][j];
				}
			}
			for (int j = 0; j < a.length; j++) 
			{
				if(i+j>5&&j-i>0)
				{
					l[lindex++]=a[i][j];
				}
			}
			for (int j = 0; j < a.length; j++) 
			{
				if(i+j<5&&j-i>0)
				{
					t[tindex++]=a[i][j];
				}
			}
			for (int j = 0; j < a.length; j++) 
			{
				if(i+j>5&&j-i<0)
				{
					b[bindex++]=a[i][j];
				}
			}
			
			
		}
         
        System.out.println(Arrays.toString(r)); 
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(b));
         
         
         

	}

}
