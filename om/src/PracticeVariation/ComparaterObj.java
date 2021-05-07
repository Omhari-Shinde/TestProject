package PracticeVariation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparaterObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1, "om", 60));
		list.add(new Student(1, "hm", 20));
		list.add(new Student(1, "om", 80));
		list.add(new Student(1, "am", 20));
		list.add(new Student(1, "om", 70));
		Collections.sort(list, new ComparaterEx());
		System.out.println(list);

	}

}
