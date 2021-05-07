package Collection;

public class MyTree {
	
	Node1 s;
	
	
	void print()
	{
		if(s!=null)
		{
			printmynode(s);
		}
	}

	private void printmynode(Node1 s) 
	{
		if(s.left!=null)
			printmynode(s.left);
		System.out.println(s.data);
		if(s.right!=null)
			printmynode(s.right);	
	}
	
	void add(Node1 newnode)
	{
		if(s==null)
		{
			s=newnode;
		}
		else
		{
			Node1 p=s;
			while(true)
			{
				if(newnode.data<p.data&&p.left==null)
				{
					p.left=newnode;
					break;
				}
				else if(newnode.data<p.data&&p.left!=null)
				{
					p=p.left;
				}
				else if(newnode.data>p.data&&p.right==null)
				{
					p.right=newnode;
					break;
				}
				else
					p=p.right;
			}
		}
	}
	
	
	

}
