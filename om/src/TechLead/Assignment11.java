package TechLead;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abhfdefgiomhusevqw";
		int vowel=0;
		int consonant=0;
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowel++;
			}
			else
			{
				consonant++;
				
			}
		}
		System.out.println(vowel);
		System.out.println(consonant);

	}

}
