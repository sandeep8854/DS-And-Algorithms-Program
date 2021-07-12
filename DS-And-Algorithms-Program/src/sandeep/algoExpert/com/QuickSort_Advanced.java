package sandeep.algoExpert.com;
import java.util.Scanner;
public class QuickSort_Advanced 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?  ?   ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		QuickSort_Advanced ob=new QuickSort_Advanced();
		ob.sort(arr,0,len-1);
		System.out.println("Sorted Array ");
		printArray(arr);	
	}
	private static void printArray(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	private void sort(int[] arr, int low , int high)
	{
		//low is starting index;
		//high is ending element;
		if(low<high)
		{
			int pivot=partiting(arr,low,high);
		    sort(arr,low,pivot-1);
		    sort(arr,pivot+1,high);
		}
	}
	private int partiting(int[] arr, int low, int high)
	{
		int pivot=arr[high];
		int i=(low-1); //index of smaller element;
		for(int j=low;j<high;j++)
		{
			//if current element is smaller than or equal to pivot
			if(arr[j]<=pivot)
			{
				i++;
				//swap arr[i],arr[j]
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		// swap arr[i+1] and arr[high] (or pivot) 
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
}

/*
Enter Any Array Length  ?  ?   
6
10
7
8
9
1
5
Sorted Array 
1 5 7 8 9 10 
                                                pivot
             ------------------------------------|----------
             | 50  | 23   | 9    | 18   | 61 |  32 |;
             --|--------------------------------|---------------
             low                               high
                               |                 
                                               pivot
              -----------------------------------|----------           if(arr[low]>arr[pivot])
             | 50  | 23   | 9    | 18   | 61 |  32 |;                    swap(arr[low],arr[pivot]
             --|--------------------------------|---------------          low++;
             low                               high                      else
                                                                           continue;
              pivot                                                            
              --|----------------------------------|----------
             | 32 | 23 | 9 | 18 | 61 | 50 |;
             --------|-----------------|---------|---------------
                    low              high              
              
                   pivot                                                          
              -------|---------------------------------
             | 23 | 32 | 9 | 18 | 61 | 50 |;
             -----------|--------------|---------------
                        low            high               
                        
                                                                                     
                       pivot                                                          
              -----------|-----------------------------
             | 23 | 9 | 32 | 18 | 61 | 50 |;
             ----------------|---------|---------------
                            low          high                                                                            
                                                                                       
                            pivot                                                          
              ---------------|-------------------------
             | 23 | 9 | 18 | 32 | 61 | 50 |;
             ---------------------|----|---------------
                                 low  high            
         =========================================================                        
       |                    pivot                               |                           
       |       ---------------|-------------------------        |
       |      | 23 | 9 | 18 | 32 | 61 | 50 |;                   |
       |      -----------------|--------|---------------         |
       |                       |       high                      | 
       |                       |       low                        |
         ======================|=======================\================                        
                   /            |                       \
    QuickSort     /           Number                    \    QuickSort
      left Side   /             (4)                      \    Right Side
                 /  pivot                                pivot
       |--------------|-----                         ------|-------------
       |  23  | 9 |  18|                            | 61 | 50|
       ----|----------|-----                         --|----|------------------ 
          low        high                             low  high
                                 
                                         ============================================
         pivot                                           pivot
       |--|------------|-----                         ------|-------------
       |  18  | 9 |  23|                            | 50 | 61|
       --------|-----|-----                         --|----|------------------ 
              low    high                                 high
                                                          low
                                 =============================================================
                                                  
       |-------------------                      -----      ------
       |  9  | 18 |  23|                         | 50|      | 61|
       -------------|-----                       -----      ------
                   high                                 
                   low                                      
                                                         
                           After Finishing All Operation-
                   -------------------------------   
                   |9 |18  |23 |32 | 50| 61|
                   -------------------------------           
                                 
*/

