package PracticeVariation;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ComparableEx> list=new ArrayList<ComparableEx>();
		list.add(new ComparableEx(1, "abcd", 40));
		list.add(new ComparableEx(1, "abcd", 41));
		list.add(new ComparableEx(1, "abcd", 40));
		list.add(new ComparableEx(1, "abcd", 42));
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}

}
