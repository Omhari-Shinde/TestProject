
package ArrayPractice;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,6,4,8,9,2,4,4,4,4};
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{   cnt=0;
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
                 cnt++;
                 break;

				}
				
			}
			if(cnt==0)
			{
				System.out.print(a[i]+" ");
				
			}
			
		}

	}

}
