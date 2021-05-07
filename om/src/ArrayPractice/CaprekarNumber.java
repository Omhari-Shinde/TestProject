package ArrayPractice;

public class CaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=a*a;
		int c=b;
		System.out.println(b);
		int nd=0;
		while(c>0)
		{
			nd++;
			c=c/10;
		}
		if(nd%2!=0)
			nd++;
		nd=nd/2;
		int div=(int)Math.pow(10, nd);
		System.out.println(div);
		int fpart=b/div;
		int spart=b%div;
		System.out.println(fpart+" "+spart);
		if(fpart+spart==a)
			System.out.println("yes,its kaprekar no");
		else
			System.out.println("sorry ,its not");
		

	}

}
