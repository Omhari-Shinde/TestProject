package PracticeVariation;

public class StackUsingLinkedListMethod {
	StackUsingLinked head;
	public void Add(int data) 
	{
		if(head==null)
		{
			head=new StackUsingLinked(data);
		}
		else
		{
			StackUsingLinked p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=new StackUsingLinked(data);
			
		}
	}
}
