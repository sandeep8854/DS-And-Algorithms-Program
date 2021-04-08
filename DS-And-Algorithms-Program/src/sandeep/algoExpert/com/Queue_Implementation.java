package sandeep.algoExpert.com;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Queue_Implementation
{
	//This makes queue a First-In-First-Out (FIFO) data structure.
	protected int queueArray[];
	protected int front,rear,size,length;
	
	//constructor
	public Queue_Implementation(int n)
	{
		size=n;
		length=0;
		queueArray=new int[size];
		front=-1;
		rear=-1;
	}
	
	//method to check if queue is full
	public boolean isEmpty()
	{
		return front==-1;
	}
	
	//method to check if queue is full
	public boolean isFull()
	{
		return front==0 && rear==size-1;
	}
	
	//method to get size of the queue
	public int getSize()
	{
		return length;
	}
	
	//method to check the front element of queue   
	/*
       like as             6   80  12  94   26  59  <start with here
 	                       |                     |
	                     rear                  front
	  */
	public int peek()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow Execption! Thats Means Queue is Empty.");
		return queueArray[front];
	}
	
	//method to insert to an element to the queue
	public void insert(int i)
	{
		if(rear==-1)
		{
			front=0;
			rear=0;
			queueArray[rear]=i;
		}
		else if(rear + 1 >= size )
			throw new IndexOutOfBoundsException("OverFflow Execption Thats Means Queue is already Fulled.");
		else if(rear + 1 < size )
			queueArray[++rear]=i;
		length++;
	}
	
	//method to remove front element from the queue
	public int remove()
	{
		if(isEmpty())
			throw new IndexOutOfBoundsException("Underflow Execption Thats means Queue is Empty.");
		else 
		{
			int temporary=queueArray[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
		return temporary;
		}
	}
	
	//method to display the status of the queue
	public void display()
	{
		System.out.println("\nQueue = ");
		if(length==0)
		{
			System.out.println("Queue is Empty \n");
		//return;
		}
		for (int i = front; i <= rear; i++)
            System.out.print(queueArray[i] + " ");
        System.out.println(); 
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Queue Test\n");
	    System.out.println("Enter Size of Integer Queue ");
	    int n = sc.nextInt();
	    
	    Queue_Implementation q=new Queue_Implementation(n);
	    //perform queue operation
	    char ch;
	    do 
	    {
	    	System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            int choice = sc.nextInt();
            switch (choice)
            {
            case 1 :
            	 System.out.println("Enter integer element to insert");
                 try
                 {
                     q.insert( sc.nextInt() );
                 }
                 catch(Exception e)
                 {
                     System.out.println("Error : " +e.getMessage());
                 }                         
                 break; 
            case 2 :
            	try
                {
                    System.out.println("Removed Element = "+q.remove());
                }
                catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }
                break;  
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+q.peek());
                }
                catch(Exception e)
                {
                    System.out.println("Error : "+e.getMessage());
                }
                break;                            
            case 4 : 
                System.out.println("Empty status = "+q.isEmpty());
                break;                
            case 5 : 
                System.out.println("Full status = "+q.isFull());
                break;                          
            case 6 : 
                System.out.println("Size = "+ q.getSize());
                break;                         
            default : System.out.println("Wrong Entry \n ");
                break;
            }
	    	  /* display Queue */
            q.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0);	
	    }while(ch=='Y'||ch=='y');	
	}
}

/*
Array Queue Test

Enter Size of Integer Queue 
5

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
20

Queue = 
20 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
35

Queue = 
20 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
35

Queue = 
20 35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
3
Peek Element = 20

Queue = 
20 35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
3
Peek Element = 20

Queue = 
20 35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
4
Empty status = false

Queue = 
20 35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
5
Full status = false

Queue = 
20 35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
6
Size = 3

Queue = 
20 35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
6
Size = 3

Queue = 
20 35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
2
Removed Element = 20

Queue = 
35 35 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
45

Queue = 
35 35 45 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
65

Queue = 
35 35 45 65 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
78
Error : OverFflow Execption Thats Means Queue is already Fulled.

Queue = 
35 35 45 65 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
99
Error : OverFflow Execption Thats Means Queue is already Fulled.

Queue = 
35 35 45 65 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
4
Empty status = false

Queue = 
35 35 45 65 

Do you want to continue (Type y or n) 

y

Queue Operations
1. insert
2. remove
3. peek
4. check empty
5. check full
6. size
1
Enter integer element to insert
99
Error : OverFflow Execption Thats Means Queue is already Fulled.

Queue = 
35 35 45 65 

Do you want to continue (Type y or n) 

n
 */



