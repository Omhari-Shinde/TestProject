package om;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class TreeapExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ls=new LinkedList();
		ls.add("om");
		ls.add("hari");
		ls.add("omhari");
		System.out.println(ls);
		Iterator i=ls.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}

	}

}
