package StringPractice2;

public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		char ch='d';
		int index=-1;
		boolean flag=false;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==ch)
			{
				flag=true;
				index=i;
			}
		}
		System.out.println(flag);
		System.out.println(index);


	}

}
