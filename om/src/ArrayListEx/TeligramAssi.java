package ArrayListEx;

public class TeligramAssi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,2,1,2};
		int b[]= {1,3,4,4};
		int id[]= {1,2,3,4,5};
		int value[]= {5,4,3,2,1};
		int count[]= {0,0,0,0,0};
		for (int i = 0; i < count.length; i++) 
		{
		   int idcount=0;
		   for (int j = 0; j < a.length; j++) 
		   {
			if(id[i]==a[j])
			{
				idcount++;
			}
			if(id[i]==b[j])
			{
				idcount++;
			}
		   }
		   count[i]=idcount;
		}
		for (int i = 0; i < count.length; i++) 
		{
			for (int j =i+1; j < count.length; j++) 
			{
				if(count[i]<count[j])
				{
					int tem=count[i];
					count[i]=count[j];
					count[j]=tem;
					tem=id[i];
					id[i]=id[j];
					id[j]=tem;
				}
			}
		}
		for (int i = 0; i < count.length; i++) 
		{
			System.out.println("value="+id[i]+" "+"count"+value[i]);
		}
	}

}
