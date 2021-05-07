 package om;

public class Student implements Comparable<Student>  {
	int rollno;
	String name;
	int marks;
	

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "\n rollno=" + rollno + ", name=" + name + ", marks=" + marks ;
	}


	@Override
	public int compareTo(Student a) {
   if(this.rollno>a.rollno)
	   return 1;
   else if(this.rollno<a.rollno)
	   return -1;
   else
		return 0;
	}





	

}
