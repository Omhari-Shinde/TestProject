package ArrayPractice;

public class Assignment35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
	     int n=9;int m=3;
	     int min=0;
	     for (int i = 0; i < a.length; i++) 
	     {
	    	 for (int j = 0; j < a.length; j++) 
	    	 {
				if(a[i]==m && a[j]==n)
				{
					if(i<j)
					{
						min=(j-i);
					}
					else
							min=(i-j);
						
				}
			}
		 }

			System.out.println(min);

	}

}
