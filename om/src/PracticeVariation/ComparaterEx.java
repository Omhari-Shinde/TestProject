package PracticeVariation;

import java.util.Comparator;

public class ComparaterEx implements Comparator<Student> 
{

	@Override
	public int compare(Student s1, Student s2) 
	{
		if(s1.marks>s2.marks)
			return 1;
		else if(s1.marks<s2.marks)
			return -1;
		else
		{
		   if(s1.name.charAt(0)>s2.name.charAt(0))
				return 1;
				else if(s1.name.charAt(0)<s2.name.charAt(0))
				return -1;
				else
					return 0;
		}
	}

}
