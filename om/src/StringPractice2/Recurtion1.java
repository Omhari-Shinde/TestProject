package StringPractice2;

public class Recurtion1 {
	
	public static void main(String[] args) 
	{
       print(5,1);
       
       
	}

	private static void print(int n, int i) 
	{
          if(i<=10)
          {
           System.out.println(n*i);	
           print(n,++i);
          }
	}


}

