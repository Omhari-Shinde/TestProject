package TreeWithKeyValue;

public class MyTreeMap {
	
	Node root;

    void add(int key,String value)
    {
    	if(root==null)
    	{
    		root=new Node(key, value);
    	}
    	else
    	{
    		Node p=root;
    		while(true)
    		{
    		  if(key<p.key&&p.left==null)	
    		  {
    			  p.left=new Node(key, value);
    			  break;
    		  }
    		  else if(key<p.key&&p.left!=null)
    		  {
    			  p=p.left;
    		  }
    		  else if(key>p.key&&p.right==null)
    		  {
    			  p.right=new Node(key, value);
    			  break;
    		  }
    		  else
    		  {
    			  p=p.right;
    			  
    		  }
    		}
    	}
    }
    
    String getvalue(int key)
    {
    	if(root!=null)
    	{
    		Node p=root;
    	
    		while(true)
    		{
    			if(key==p.key)
    		  {
    			 return p.value;
    		  }
    		  else if(key<p.key&&p.left==null)	
    		  {
    			  return null;
    		  }
    		  else if(key<p.key&&p.left!=null)
    		  {
    			 p=p.left;
    		  }
    		  else if(key>p.key&&p.right==null)
    		  {
    			  return null;
    		  }
    		  else
    		  {
    			  p=p.right;
    			  
    		  }
    		}
    	}
    	else
    		return null;
    }
    
    
    void print()
    {
    	if(root!=null)
    		printMyNode(root);
    }

	private void printMyNode(Node root) 
	{
		if(root.left!=null)
		printMyNode(root.left);
		System.out.println(root.key+" "+root.value);
		if(root.right!=null)
			printMyNode(root.right);
		
	}
    
    

}
