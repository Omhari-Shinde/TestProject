
package ArrayPractice;

public class PreeQRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,4};
		int a[]= {1,1,1,1,1,2,2,3,4};
		for (int i = 0; i < n.length; i++) 
		{ 
			int myele=n[i];
			int cnt=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[j]==myele)
				  cnt++;
			}
			if(cnt==1)
			{
				int index=0;
				int []b=new int [a.length-1];
				for (int j = 0; j < a.length; j++) 
				{
					if(a[j]!=myele)
					{
						b[index++]=a[j];
						
					}
				}
			}
		}

	}

}
