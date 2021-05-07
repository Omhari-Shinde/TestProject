package SurpriseTest;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,3,4,5,6,7,8,9,10};
		    int sum=0;
		    for (int i = 0; i < a.length; i++) 
		    {
				sum=sum+a[i];
			}
//		     System.out.println(sum);
		     int n=a[a.length-1];
		     System.out.println(n);
		     int sum2=0;
		     for (int i = 1; i <=n; i++) 
		     {
				sum2=sum2+i;
			}
		     System.out.println(sum2+" "+sum+" "+(sum2-sum));

	}

}
