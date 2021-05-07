package ArrayPractice;

public class CommonElementOFTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,7};
		int b[]= {2,3,5,6};
		//op-3,6
		
		int i=0;
		int j=0;
		while(true)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				i++;
				j++;
				if(i>=a.length||j>=b.length)
				{
					break;
				}
			}
			else if(a[i]<b[j])
			{
				i++;
				if(i>=a.length)
				{
					break;
				}
			}
			else if(a[i]>b[j])
			{
				j++;
				if(i>=b.length)
				{
					break;
				}
			}
		}

	}

}
