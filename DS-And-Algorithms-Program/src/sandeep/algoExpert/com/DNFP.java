package sandeep.algoExpert.com;
import java.util.Scanner;
public class DNFP 
{
	/*
	Dutch National Flag Problem(DNF) - It is a programming problem proposed by Edsger Dijkstra.
	The flag of the Netherlands consists of three colors: white, red, and blue.
	The task is to randomly arrange balls of white, red, and blue in such a way 
	that balls of the same color are placed together. For DNF (Dutch National Flag),
	we sort an array of 0, 1, and 2's in linear time that does not consume any extra space.
	We have to keep in mind that this algorithm can be implemented only on an array that
	has three unique elements.

	ALGORITHM -
	Take three-pointers, namely - low, mid, high.
	We use low and mid pointers at the start, and the high pointer will point at the end of the given array.
	CASES :
	If array [mid] = 0, then swap array [mid] with array [low] and increment both pointers once.
	If array [mid] = 1, then no swapping is required. Increment mid pointer once.
	If array [mid] = 2, then we swap array [mid] with array [high] and decrement the high pointer once.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res[]=dutch_National_Flag_Problem(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}	
	}
	private static int[] dutch_National_Flag_Problem(int[] arr)
	{
		int L=arr.length;
		int low=0;
		int high=L-1;
		int mid=0;
		int temp=0;   //for swaping
		
		while( mid <= high)
		{
			switch(arr[mid])
			{
			case 0 :
			{
				//swap(arr[low],arr[mid]);
				temp=arr[low];
				arr[low] =arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			}
			case 1 :
			{
				mid++;
				break;
			}
			case 2 :
			{
			//	swap(arr[mid],arr[high]);
				temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				break;
			}
			
			}
		}
		return arr;
	}
}
/*
Enter Any Array Length ?   ?  
8
0
1
0
1
2
0
1
2
0 0 0 1 1 1 2 2 

*/