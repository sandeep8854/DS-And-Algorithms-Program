package sandeep.algoExpert.com;
public class SinglyLinkedListDeleteFirst
{
	private ListNode head;
	
	static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode deleteFisrt()
	{
		if(head==null)
		{
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	private void insertEnd(int value)
	{
		ListNode newNode=new ListNode(value);
		if(head==null)
		{
			head=newNode;
			return;
		}
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;	
	}
	
	private void display() 
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
		SinglyLinkedListDeleteFirst slle=new SinglyLinkedListDeleteFirst();
		slle.insertEnd(11);
		slle.insertEnd(8);
		slle.insertEnd(1);
		slle.insertEnd(6);
		slle.display();	
		System.out.println();
		System.out.print(slle.deleteFisrt().data);
		System.out.println();
		slle.display();	
	}	
}
