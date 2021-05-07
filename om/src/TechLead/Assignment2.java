package TechLead;

import java.util.Arrays;

import StringPractice.ReverseString;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="reverse string";
		String reversed = ReverseString(str);
		System.out.println(reversed);
	}

	private static String ReverseString(String str) 
	{
		if(str.isEmpty())
			return str;
		return
		ReverseString(str.substring(1))+(str.charAt(0));
	}

}
