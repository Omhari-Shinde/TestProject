
package Collection;
//Omhari Uttam Shinde
public class LinkeddList {
	Node head;
   void add(int a)
   {
	  if(head==null)
	  {
		head=new Node(a);  
	  }
	  else
	  {
		  Node p=head;
		  while(p.next!=null)
		  {
			  p=p.next;
		  }
		  p.next=new Node(a);
	  }
   }
   
   void print()
   {
	   Node p=head;
	   while(p!=null)
	   {
		  System.out.println(p.data+" "); 
		  p=p.next;
	   }
	   System.out.println();
   }
   
   
   void  delete(int a)
   {
	   Node p=head;
	   if(p!=null&&p.data==a)
	   {
		   head=p.next;
	   }
	   else
	   {
		   Node q=p.next;
		   while(q!=null)
		   {
			   if(q.data==a)
			   {
				   p.next=q.next;
				   break;
			   }
			   p=p.next;
			   q=q.next;
		   }
	   }
   }
   
   int find(int a)
   {
	   int index=-1;
	   int n=0;
	   Node p=head;
	   while(p!=null)
	   {
		   if(p.data==a)
		   {
			   index=n;
			   break;
		   }
		   p=p.next;
		   n++;
	   }
	   return index;
   }

}
