package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_35_Circular_Array_Rotation
{
	/*
	 Circular array rotation means rotating the elements in the array 
	 where one rotation operation moves the last element of the array 
	 to the first position and shifts all remaining elements to the right.
    For example, consider the following 
    array = [4, 5, 6], 
    number of rotations = 2, 
    indexes to be checked = [0,1,2]

   Initial array   [4, 5, 6]
   After one rotation   [6, 4, 5]
   After two rotations   [5, 6, 4]
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n(number of array length ? ");
		int n=sc.nextInt();
		
		System.out.println("Enter k (number of rotation ) ? ");
		int k=sc.nextInt();
		
		System.out.println("Enter q (how many index yo want to print ) ?  ? ");
		int q=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<q;j++)
		{
			System.out.println("Enter index which you want to print ? ? ");
			int m=sc.nextInt();
			int c=k%n;
			m=m-c;
			if(m<0)
			{
				m=m+arr.length;
			}
			System.out.println(arr[m]);
		}	
	}
}

/*
Enter n(number of array length ? 
3
Enter k (number of rotation ) ? 
2
Enter q (how many index yo want to print ) ?  ? 
2
3
4
5
Enter index which you want to print ? ? 
0
4
Enter index which you want to print ? ? 
1
5
*/
