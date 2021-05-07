package PracticeVariation;

public class ComparableEx implements Comparable<ComparableEx> {
	
	int rn;
	String name;
	int marks;
	public ComparableEx(int rn, String name, int marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "ComparableEx [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(ComparableEx s) {
		if(marks>s.marks)
			return 1;
		else if(marks<s.marks)
			return -1;
		else
		return 0;
	}


}
