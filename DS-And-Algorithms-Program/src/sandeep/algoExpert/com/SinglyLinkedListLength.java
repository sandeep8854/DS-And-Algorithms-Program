package sandeep.algoExpert.com;
public class SinglyLinkedListLength
{
	private ListNode head;
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}	
	}
	
	public int lengthFind()
	{
		ListNode current=head;
		if(head==null)
		{
			return 0;
		}
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
		
	}
	public static void main(String[] args)
	{
		SinglyLinkedListLength sllL=new SinglyLinkedListLength();
		sllL.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		
		sllL.head.next=second;
		second.next=third;
		third.next=fourth;
		
		System.out.println("Length of Linked List : " +sllL.lengthFind());		
	}
}

/*
Length of Linked List : 4
*/