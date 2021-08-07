package sandeep.algoExpert.com;
public class SinglyLinkedList
{
	private ListNode head;
	private static class ListNode
	{
		private int data;    //Generics Type;
		private ListNode next;
		
		public ListNode(int data) 
		{
			this.data = data;
			this.next = null;
		}	
	}
	public void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
	}
	public static void main(String[] args)
	{
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		
		//Now we will connect them together to from a chain
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		sll.display();
	}
}
/*
head is instance variable
so look like as  head----->null;
----------------------------------------
head=new ListNode(10);
look like as

   head
 ---|-----
 | 10 |   |
 -------|--
       null
-----------------------------------------
ListNode second=new ListNode(1);
look like as:-

 second
 ---|-----
 | 1 |   |
 -------|--
       null
-----------------------------------------
ListNode third=new ListNode(8);

  third 
 ---|-----
 | 8 |   |
 -------|--
       null
-----------------------------------------
ListNode fourth=new ListNode(11);

  fourth 
 ---|-----
 | 11 |   |
 -------|--
       null      
---------------------------------------
 //Now we will connect them together to from a chain
  
  head.next=second;
   head          second
 ---|-----      ----|-----
 | 10 |   |----->| 1 |   |
 ---------      ----------
-------------------------------------------------
second.next=third;
   second          third
 ---|-----      ----|-----
 | 1  |   |----->| 8 |   |
 ---------      ----------
 ------------------------------------------------
 third.next=fourth;
  third          fourth
 ---|-----      ----|-----
 | 8  |   |----->| 11 |   |
 ---------      ---------- 
 -----------------------------------------------
 Summation of Every Node.
 
   head          second        third          fourth
 ---|-----      ----|-----     ---|------      ---|-------
 | 10 |   |----->| 1 |   |---->| 8 |   |------>| 11 |  |---->null.
 ---------      ----------     ---------      ----------
 ------------------------------------------------------------------
 
 	public void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
	}
	
   head          second        third          fourth
 ---|-----      ----|-----     ---|------      ---|-------
 | 10 |   |----->| 1 |   |---->| 8 |   |------>| 11 |  |---->null.
 ---|------      ---|-------    -|--------      --|--------   |
  current(1)      current(1)    current(1)     current(1)   current
  
  next operation going to pass but condition will be failed;
 ------------------------------------------------------------------
 Output :-  10 1 8 11        
*/