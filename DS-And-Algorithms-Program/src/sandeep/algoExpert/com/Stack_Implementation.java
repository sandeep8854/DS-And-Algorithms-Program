package sandeep.algoExpert.com;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Stack_Implementation
{
	protected int arrSandeep[];
	protected int top,size,length;
	
	//constructor for stack_implementation
	Stack_Implementation(int n)
	{
		size=n;
		length=0;
		arrSandeep=new int[size];
		top=-1;
	}
	
	//method to check if stack is empty
	public boolean isEmpty()
	{
		return top==-1;
	}
	//method to check , stack is full
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	//	method to get the size of the stack */
	public int getSize()
	{
		return length;
	}
	
	//method to check top element of the stack
	
	public int peek()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow Execption..");
		return arrSandeep[top];
	}
	
//	method to add an element to the stack
	public void push(int i)
	{
		if( top + 1 >= size)
			 throw new IndexOutOfBoundsException("Overflow Exception");
		if(top+1<size)
			arrSandeep[++top]=i;
		length++;
	}
	
	//method to delete an element from the stack
	public int pop()
	{
		if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
		length--;
		return arrSandeep[top--];
	}
	
	//method to display status of the stack
	public void display()
	{
		System.out.print("\nStack= ");
		if(length==0)
		{
			System.out.print("Empty\n ");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.print(arrSandeep[i] + " ");
		}
		System.out.println();	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Stack Test\n");
		System.out.println("Enter Size Of Integer Stack ? ? ");
		int n=sc.nextInt();
		
		Stack_Implementation stemp=new Stack_Implementation(n);
		
		
		//perform stack operation
		char ch  ;
		do 
		{
			System.out.println("\nStack Operation ");
			System.out.println("1. Push ");
			System.out.println("2. Pop ");
			System.out.println("3. Peek ");
			System.out.println("4. Check Empty ");
			System.out.println("5. Check Full ");
			System.out.println("6. Size ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println("Enter Integer Element To Push");
				try
				{
					stemp.push(sc.nextInt());
				}
				catch(Exception e)
				{
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 2 :
				try
				{
	                    System.out.println("Popped Element = " + stemp.pop());
				}
				catch(Exception e)
				{
					System.out.println("Error : " +e.getMessage() );
				}
				break;
			case 3 :         
                try
                {
                    System.out.println("Peek Element = " + stemp.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = " + stemp.isEmpty());
                break;                
            case 5 :
                System.out.println("Full status = " + stemp.isFull());
                break;                 
            case 6 : 
                System.out.println("Size = " + stemp.getSize());
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
			}
			//Display Stack
			stemp.display();
			System.out.println("\nDo You Want To Continue (Type Y or N)");
			ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');		
	}
}


/*
Stack Test

Enter Size Of Integer Stack ? ? 
5

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
1
Enter Integer Element To Push
24

Stack= 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
1
Enter Integer Element To Push
6

Stack= 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
1
Enter Integer Element To Push
162

Stack= 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
1
Enter Integer Element To Push
19

Stack= 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
1
Enter Integer Element To Push
94

Stack= 94 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
1
Enter Integer Element To Push
32
Error : Overflow Exception

Stack= 94 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
3
Peek Element = 94

Stack= 94 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
4
Empty status = false

Stack= 94 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
5
Full status = true

Stack= 94 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
6
Size = 5

Stack= 94 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
2
Popped Element = 94

Stack= 19 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
2
Popped Element = 19

Stack= 162 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
2
Popped Element = 162

Stack= 6 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
2
Popped Element = 6

Stack= 24 

Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
2
Popped Element = 24

Stack= Empty
 
Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
2
Error : Underflow Exception

Stack= Empty
 
Do You Want To Continue (Type Y or N)
y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
6
Size = 0

Stack= Empty
 
Do You Want To Continue (Type Y or N)

y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
3
Error : Underflow Execption..

Stack= Empty
 
Do You Want To Continue (Type Y or N)

y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
5
Full status = false

Stack= Empty
 
Do You Want To Continue (Type Y or N)

y

Stack Operation 
1. Push 
2. Pop 
3. Peek 
4. Check Empty 
5. Check Full 
6. Size 
6
Size = 0

Stack= Empty
 
Do You Want To Continue (Type Y or N)
n

 */

















