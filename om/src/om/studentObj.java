package om;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class studentObj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "om", 80);
		Student s2=new Student(5, "om", 82);
		Student s3=new Student(4, "om", 87);
		Student s4=new Student(1, "om", 80);
		Student s5=new Student(1, "om", 85);
		Student s6=new Student(2, "om", 80);
		Student s7=new Student(1, "om", 80);
		Student s8=new Student(3, "om", 86);
	     ArrayList al1=new ArrayList<>();
	     al1.add(s1);
	     al1.add(s2);
	     al1.add(s3);
	     al1.add(s4);
	     al1.add(s5);
	     al1.add(s6);
	     al1.add(s7);
	     al1.add(s8);
	     

	    Collections.sort(al1);
	     System.out.println(al1);
	     

	}

}
