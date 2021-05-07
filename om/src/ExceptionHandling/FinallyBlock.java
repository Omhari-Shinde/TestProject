package ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System .in);
	 System.out.println("enter first value");
	 int a=sc.nextInt();
	 System.out.println("enter second value");
	 int b=sc.nextInt();
	 
	 try 
	{
		System.out.println(a/b);
	} 
	 catch (Exception e) 
	 {
		System.out.println(e);
	 }
	 finally 
	 {
		sc.close();
	}
	 
	}

}
