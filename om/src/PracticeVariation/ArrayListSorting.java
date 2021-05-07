package PracticeVariation;

import java.util.ArrayList;

public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(60);
		list.add(60);
		list.add(10);
		list.add(40);
		for (int i = 0; i < list.size(); i++) 
		{
			for (int j =i+1; j <list.size(); j++) 
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		System.out.println(list);
	}

}
