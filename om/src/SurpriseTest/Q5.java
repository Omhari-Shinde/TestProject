package SurpriseTest;

public class Q5 {

	public static void main(String[] args) {
		String s="abcdabc";
		int maxlen=0;
		int si=0;
		int ei=0;
		int fsi=0;
		int fei=0;

        for (int i = 0; i <s.length(); i++) 
        {
			si=i;
			
			for (int j =i+1; j <s.length(); j++) 
			{
				ei=j;
				boolean flag=true;
				for (int k =si; k < ei; k++) 
				{
					if(s.charAt(k)==s.charAt(j))
					{
							flag=false;
							break;
			
					}
				}
				
				if(flag==false)
					break;
				
			}
			int slen=ei-si;
			if(slen>maxlen)
			{
				maxlen=slen;
				fsi=si;
				fei=ei;
			}
		}
        System.out.println(maxlen);
        for (int i =fsi; i <fei; i++) 
        {
			System.out.print(s.charAt(i));
		}

	}

}
