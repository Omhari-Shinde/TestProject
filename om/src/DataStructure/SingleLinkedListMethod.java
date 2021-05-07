package DataStructure;

public class SingleLinkedListMethod {
	

	SingleLinkedList head;
	
	public void Add(int data) 
	{
		if(head==null)
		{
			head=new SingleLinkedList(data);
		}
		else
		{
			SingleLinkedList p=head;
			while(p.Next!=null)
			{
				p=p.Next;
			}
			p.Next=new SingleLinkedList(data);
		}
	}
	public void print() 
	{
		if(head==null)
		{
			System.out.println("Single linked is empty ");
		}
		else
		{
			SingleLinkedList p=head;
			while(p!=null)
			{
				System.out.println(p.data);
				p=p.Next;
			}
		}
	}
	
	public void delete(int index) 
	{
		SingleLinkedList p=head;
		int count=0;
		if(index==0)
		{
			head=head.Next;
		}
		else
		{
		while(p!=null)
			{
			   if(count+1==index)
			   {
				   p.Next=p.Next.Next;
				   break;
			   }
			   count++;
			   p=p.Next;
			}
		
		}

	}
}
