package ArrayPractice;

import java.util.Arrays;

public class   ObjectEx {
	
	int rno;
	int marks;
	String name;

	public ObjectEx(int rno, int marks, String name) {
		super();
		this.rno = rno;
		this.marks = marks;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectEx s1=new ObjectEx(5,80 ,"OMhari");
		ObjectEx s2=new ObjectEx(8,45 ,"abc" );
		ObjectEx s3=new ObjectEx(3,85 ,"bca");
		ObjectEx s4=new ObjectEx(2,90 ,"pqr");
		ObjectEx s5=new ObjectEx(9,85 ,"ama" );
		ObjectEx s6=new ObjectEx(2,33 ,"hari");
		ObjectEx s7=new ObjectEx(1,87, "xyz");
		ObjectEx s8=new ObjectEx(7,85 ,"abad");
		ObjectEx s[]= {s1,s2,s3,s4,s5,s6,s7,s8};
		for (int i = 0; i < s.length; i++) 
		{
			for (int j =i+1; j < s.length; j++) 
			{
				if(s[i].marks>s[j].marks)
				{
					ObjectEx c=s[i];
					s[i]=s[j];
					s[j]=c;
					
				}
				else if(s[i].marks==s[j].marks)
				{
					if(s[i].name.charAt(0)>s[j].name.charAt(0))
					{
						ObjectEx c=s[i];
						s[i]=s[j];
						s[j]=c;
					}
					else if(s[i].name.charAt(0)==s[j].name.charAt(0))
					{
						if(s[i].name.charAt(2)>s[j].name.charAt(2))
						{
							ObjectEx c=s[i];
							s[i]=s[j];
							s[j]=c;
						}
						else if(s[i].name.charAt(2)==s[j].name.charAt(2))
						{
							if(s[i].rno>s[j].rno)
							{
								ObjectEx c=s[i];
								s[i]=s[j];
								s[j]=c;
							}
						}
					}
				}
			}
		}
		
		
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].rno+" "+s[i].marks+" "+s[i].name);
		}
		
		
	}

}
