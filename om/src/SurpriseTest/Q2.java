package SurpriseTest;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {1,2,3,4,5,6,7};
		int c[]= new int[a.length+b.length];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			c[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			c[index++]=b[i];
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}

	}

}
