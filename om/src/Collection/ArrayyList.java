package Collection;

import java.util.ArrayList;
import java.util.Arrays;
//Name:Shinde Omhari Uttam
public class ArrayyList {
	int a[]=new int[10];
	int index=0;
	void add(int p) 
	{
		if(index<a.length)
		{
		a[index++]=p;
		}
		else
		{
			int b[]=new int[(int)(1.5*a.length)];
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
				
			}
			b[index]=p;
			index++;
			a=b;
		}
	}
	
	void print()
	{
		for (int i = 0; i <index; i++) 
		{
			System.out.println(a[i]);
		}
	}
	
	
	
}
