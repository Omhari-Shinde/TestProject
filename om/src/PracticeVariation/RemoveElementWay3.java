package PracticeVariation;

public class RemoveElementWay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//element occurs multiple then remove number count-1
		 String s="abcdabcabc";
		 char a[]=s.toCharArray();
		 int countArray[]=new int[128];
		 for (int i = 0; i < a.length; i++) 
		{
			char c=a[i];
			countArray[i]=countArray[c]++;
		}
		for (int i = 0; i < countArray.length; i++) 
		{
			if(countArray[i]>0)
			{
			System.out.println((char)i+" "+countArray[i]);
			}
		}
		String s2="";
		for (int i = 0; i < countArray.length; i++) 
		{
			if(countArray[i]>1)
			{
				countArray[i]--;
			}
				
		}
		
		for (int i = 0; i < a.length; i++) 
		{
		   	char ch=a[i];
		   	if(countArray[ch]!=0)
		   	{
		   		s2=s2+(char)a[i];
		   		countArray[ch]--;
		   	}
		}
		System.out.println(s2);

	}

}
