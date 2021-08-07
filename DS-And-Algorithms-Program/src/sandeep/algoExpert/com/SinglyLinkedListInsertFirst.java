package sandeep.algoExpert.com;
public class SinglyLinkedListInsertFirst
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
	
	public void insertFirst(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
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
		SinglyLinkedListInsertFirst slli=new SinglyLinkedListInsertFirst();
		slli.insertFirst(11);
		slli.insertFirst(1);
		slli.insertFirst(8);
		slli.display();	
	}
}
/*
8 1 11

if no element is there so linked list head point to null --- >Important point;

step 1-
     ListNode newNode=new ListNode(value);
     
                  head
                   |          ----Starting step where no element are there;
                   ^          
                  null 

after puting a element as value is  11; then create a new newNode;
called the ListNode
ListNode newNode=new ListNode(value);

Like As :- 
             null
         ------|--           head    
         | 11 |  |            |
         ---|-----            ^
          newNode            null
 ------------------------------------------------         
          step 2:-
          newNode.next=head;
                          head
          -----------       | 
          | 11 |   |-------null     
          ---|------
           newNode
-----------------------------------------------           
           step 3:-
           head=newNode;
           
           head                   
          ---|--------        
          | 11 |   |-------null     
          ---------
----------------------------------------------------

Next Step Put the Another Element:
Value is 8: 
ListNode newNode=new ListNode(value);
Step 1-
So Look Like As:-
                null           head       
          -------|----        --|-------
          | 8 |   |          | 11 |   |---------null;
          ---|------          ---------      
           newNode
  Step 2:-
  
  newNode.next=head                           
        
                              head       
          -----------        --|-------
          | 8 |   |- --- -> | 11 |   |---------null;
          ---|------          ---------      
           newNode 
 Step 3:
 head=newNode;          
   
            head       
          ---|--------        ---------
          | 8 |   |- --- -> | 11 |   |---------null;
          ---------          ---------      
            
     Further Step As A Same As;
     Continue;                         
        .
        .
        .
        .
        .   
*/




















