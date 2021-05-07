package SurpriseTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
	
	int rollno;
	String name;
	int marks;
	

	public Demo(int rollno, String name, int marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Demo [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {

		Demo d1=new Demo(1, "om", 80);
		Demo d2=new Demo(2, "omhari", 85);
		Demo d3=new Demo(3, "om", 70);
		Demo d4=new Demo(4, "hmri", 90);
		Demo d5=new Demo(5, "om", 50);
		Demo d6=new Demo(6, "oaah", 90);
		Demo d7=new Demo(7, "ram", 60);
		Demo d8=new Demo(8, "hariom", 82);
		Demo[] li= {d1,d2,d3,d4,d5,d6,d7,d8};

        for (int i = 0; i < li.length; i++)
        {
		for (int j = 0; j < li.length; j++)
		{
			if(li[i].marks!=li[j].marks)
			{
				if(li[i].marks>li[j].marks)
				{
					Demo p=li[i];
					li[i]=li[j];
					li[j]=p;
				}
			}
			else
			{
				String s=li[i].name;
				String v=li[j].name;
				int o=s.charAt(3)-v.charAt(3);
				if(o<0)
				{
					Demo p=li[i];
					li[i]=li[j];
					li[j]=p;
				}
			}
		}	
		}
		
  for (int i = 0; i < li.length; i++) 
  {
	  System.out.println(li[i].rollno+" "+li[i].marks+" "+li[i].name);
   }

System.out.println();
       
      
     
	}

}
