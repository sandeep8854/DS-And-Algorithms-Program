package sandeep.algoExpert.com;
import java.util.Scanner;
public class Shell_Sort_Advanced_Sort
{
	//Shell sort is mainly a variation of Insertion Sort. In insertion sort, we move elements
	//only one position ahead. When an element has to be moved far ahead, many movements 
	//are involved. The idea of shellSort is to allow exchange of far items
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?    ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res[]=shellSort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " " );
		}	
	}
	private static int[] shellSort(int[] array)
	{
		    int h = 1;
	        while (h < array.length)
	        {
	        	h = 3*h + 1;
	        }
	        while (h > 0)
	        {
	            h = h/3;
	            for (int k = 0; k < h; k++)
	            {
	                for (int i = h+k; i < array.length; i+=h)
	                {
	                    int key = array[i];
	                    int j = i-h;
	                    while (j>=0 && array[j] > key)
	                    {
	                        array[j+h] = array[j];
	                        j=j-h;
	                    }
	                    array[j+h] = key;
	                    //-> invariant: array[0,h,2*h..j] is sorted
	                }
	            }
	            //->invariant: each h-sub-array is sorted
	        }
	        return array;
	}
}

/*
 Enter Any Array Length  ?    ?  
8
9
8
3
7
5
6
4
1
1 3 4 5 6 7 8 9 
Enter Any Array Length  ?    ?  
9
23
29
15
19
31
7
9
5
2
2 5 7 9 15 19 23 29 31 
Enter Any Array Length  ?    ?  
15
12
14
12
02
35
512
14
12
1
2
4
5
6
14
1556
1 2 2 4 5 6 12 12 12 14 14 14 35 512 1556 
 */


