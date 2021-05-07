package ArrayListEx;

import java.util.ArrayList;

public class rangemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<range> list = new ArrayList<range>();
		list.add(new range(100,135));
		list.add(new range(1,35));
		list.add(new range(15,45));
		list.add(new range(70,105));
		for (int i = 0; i <list.size(); i++) 
		{
			for (int j = 0; j <list.size(); j++)
			{
				range iwo=list.get(i);
				range jwo=list.get(j);
				if(i!=j && iwo.start<jwo.start&&iwo.end>=jwo.start)
				{
					if(jwo.end>iwo.end)
						iwo.end=jwo.end;
					list.remove(j);
					i--;
					break;
				}
			}
		}
		for (int i = 0; i <list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		

	}

}
