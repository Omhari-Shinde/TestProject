package PracticeVariation;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p=1000000;
		double r=0.11;
		int t=3;
		int n=4;
		
		double si=(p*r*t)/100;
		System.out.println(si);
		double a=(1+r/n);
		double b=n*t;
		double ci=p*Math.pow(a, b);
		System.out.println(ci);

	}

}
