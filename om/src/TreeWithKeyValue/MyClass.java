package TreeWithKeyValue;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTreeMap mp=new MyTreeMap();
		mp.add(24, "Latur");
		mp.add(25, "osmanabad");
		mp.add(12, "pune");
		mp.add(28, "buldhana");
		mp.add(11, "satara");
		mp.add(49, "nagpur");
		String s=mp.getvalue(24);
		System.out.println(s);
		mp.print();

	}

}
