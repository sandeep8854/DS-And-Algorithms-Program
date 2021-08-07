package sandeep.algoExpert.com;
/*   Head
 *    |
 *  -----------       ---------     ---------       -------
   |  A |     |------>| B |   |---->|  C |   |------>| D |----->Null
    --|-----|-----    ---------     ---------       -------
     Data  Next
     
     Node :- 
  -------------
  A Node is Collection of two Sub-element or part ,A data  that store the element and next part
  that store the link of next node;
|  ------------------------|
|  Data-------next--       |
| | 10 |    |pointer|      |>>>>>>>>>Node(Called As Node..)
| -------    --------      |
|--------------------------|
  
  Head:-
---------
A linked list is a linear data structure where each element is a separate object. ...
The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, 
but the reference to the first node. If the list is empty then the head is a null reference   
    
    
*/
public class LinkedList
{
	Node head;
//	This inner class is made static so that
 //   main() can access it
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	/*
	 A linked list is represented by a pointer the first Node of the linkedlist , 
	 the first node is called as head.
	 if the linked list is empty then the value of head is NULL
	 
	 each Node is a list  consist of at list two part.
	 1- data;
	 2- pointer (or reference) to the next node;
	 In java linkedlist can be represented as a class and Node as a seperate class.
	 */
	
	public static void main(String[] args)
	{
		//start with the empty list
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		 /* Three nodes have been allocated dynamically.
        We have references to these three blocks as head, 
        second and third

        llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  | null |     | 2  | null |     |  3 | null |
       +----+------+     +----+------+     +----+------+ */
		
		list.head.next=second; //list fist node with the second node
		
		/*  Now next of the first Node refers to the second.  So they
        both are linked. */
		
		second.next=third; //// Link second node with the third node
		 /*  Now next of the second Node refers to third.  So all three
        nodes are linked.

     llist.head        second              third
        |                |                  |
        |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  |  o-------->|  3 | null |
    +----+------+     +----+------+     +----+------+ */
		
		
		list.printList();
		
	}
	private void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n=n.next;
		}
	}
}
