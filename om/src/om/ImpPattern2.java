package om;

public class ImpPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int cnt=1;
		int cnt2=n*n+1;
		int q=n-1;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(j-i>=0)
				{
					System.out.print(cnt+++" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			int p=cnt2;
			for (int j = 0; j <n; j++) 
			{
				if(i+j<=4)
				{
				System.out.print(p+++" ");	
				}

			}
			cnt2=cnt2-q;
			q--;
			System.out.println();
		}

	}

}
