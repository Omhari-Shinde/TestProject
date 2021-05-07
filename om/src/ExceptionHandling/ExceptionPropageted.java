package ExceptionHandling;

public class ExceptionPropageted {

	public static void main(String[] args) {
		System.out.println("line 1");
		abc();
		System.out.println("line 8");
		

	}

	private static void abc() 
	{
		System.out.println("line 2");
		xyz();
		System.out.println("line 7");
		
	}

	private static void xyz() 
	{
		System.out.println("line 3");
		pqr();
		System.out.println("line 6");
		
	}

	private static void pqr() {
		System.out.println("line 4");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("line 5");
		
	}

}
