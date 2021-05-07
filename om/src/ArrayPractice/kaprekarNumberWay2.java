package ArrayPractice;

public class kaprekarNumberWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=99;
		int b=n;
		int s=n*n;
		int cnt=0;
		while(n>0)
		{
			n=n/10;
			cnt++;
		}
		int d=(int) Math.pow(10, cnt);
		int partone=s/d;
		int parttwo=s%d;
		if(partone+parttwo==b)
		{
			System.out.println("kaprekar no");
		}
		else
		{
			System.out.println("not caprekar");
		}
		

	}

}
