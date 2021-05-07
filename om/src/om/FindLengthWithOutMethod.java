package om;

public class FindLengthWithOutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdefg";
		int i=0;
		int cnt=0;
		try {
		while(true)
		{
			s.charAt(i);
			cnt++;
			i++;
		}
		}
		catch (Exception e) 
		{

		}
		
		System.out.println(cnt);

	}

}
