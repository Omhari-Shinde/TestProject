package om; 
import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arg=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter Data");
		for (int i = 0; i < arg.length; i++) {
			arg[i]=sc.nextInt();
		}
		for (int i = 0; i < arg.length; i++) {
			System.out.print(arg[i]+" ");
		}

	}

}
