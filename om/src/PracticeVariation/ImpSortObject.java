package PracticeVariation;

public class ImpSortObject {
	
	int rn;
	int marks;
	String name;
	

	public ImpSortObject(int rn, int marks, String name) {
		super();
		this.rn = rn;
		this.marks = marks;
		this.name = name;
	}
public static void main(String[] args) {
		
	ImpSortObject s1=new ImpSortObject(1,40,"abcd"); 
	ImpSortObject s2=new ImpSortObject(4,41,"pqrst"); 
	ImpSortObject s3=new ImpSortObject(4,42,"pqts"); 
	ImpSortObject s4=new ImpSortObject(4,41,"xyz"); 
	ImpSortObject s5=new ImpSortObject(2,40,"abcd"); 
	
	ImpSortObject a[]= {s1,s2,s3,s4,s5};
	for (int i = 0; i < a.length; i++) 
	{
		for (int j =i+1; j < a.length; j++) 
		{
			if(a[i].marks>a[j].marks)
			{
				ImpSortObject m =a[i];
				a[i]=a[j];
				a[j]=m;
			}
			else if(a[i].marks==a[j].marks)
			{
				if(a[i].name.charAt(1)>a[j].name.charAt(1))
				{
					ImpSortObject m =a[i];
					a[i]=a[j];
					a[j]=m;
				}
				else if(a[i].name.charAt(1)==a[j].name.charAt(1))
				{
					if(a[i].name.charAt(2)>a[j].name.charAt(2))
					{
						ImpSortObject m =a[i];
						a[i]=a[j];
						a[j]=m;	
					}
					else if(a[i].name.charAt(2)==a[j].name.charAt(2))
					{
						 if(a[i].marks<a[j].marks)
						 {
							 ImpSortObject m =a[i];
								a[i]=a[j];
								a[j]=m;	 
						 }
					}
				}
				
			}
			
		}
	}
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println(a[i]);
	} 
	
	}
@Override
public String toString() {
	return "ImpSortObject [rn=" + rn + ", marks=" + marks + ", name=" + name + "]";
}


}
