package sandeep.algoExpert.com;
public class SinglyLinkedListInsertEnd
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
	
	public void insertEnd(int value)
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
		SinglyLinkedListInsertEnd slle=new SinglyLinkedListInsertEnd();
		slle.insertEnd(11);
		slle.insertEnd(8);
		slle.insertEnd(1);
		slle.insertEnd(6);
		slle.display();	
	}
}

/*
If in list any list are not there then   head---->null;
like as   head
            |
          null  
 ListNode newNode=new ListNode(value);
 
  writing one line code look like as
              null
         -------|--
         | 11 |   |
         --|-------
         newNode    
 
 Next step and go ahead
 
 if(head==null)
 
 Actually head is null
 then newNode Become head;
 Like as
  head=newNode;
    head null
  ---|----|---
  | 11 |   |
  ----------
   Then put the value of one more
   like as 8
   then create a newNode like as
       head  null             null
     ---|-----|          ------|---
     | 11  |   |        | 8 |   |
     ---------          --|-------
                        newNode
   
   And Go Ahead and check condition true are not but condition become false
   Taking a variable;
   ListNode current=head;
  
   then check the condition in while loop
   while(current.next!=null)
   but now this situation is condition is false
    come out the the while loop
    
    and linked the newNode to current.next
    like as 
    current.next=newNode;
    
       head                  null
     ---|------          ------|---
     | 11  |   |------->| 8 |   |
     ---------          ---------
                        
    like that continue all operation..
------------------------------------------    
  OutPut-:
  11 8 1 6 
--------------------------------------
*/