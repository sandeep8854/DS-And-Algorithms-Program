package sandeep.algoExpert.com;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Bucket_Sort_Collection
{
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
		int res[]=rearr(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] rearr(int[] arr)
	{
		int buckSize=10;
		List<Integer> bucket[]=new List[buckSize];
		for(int i=0;i<buckSize;i++)
		{
			bucket[i]=new LinkedList<>();
		}
		
		//calculate hash and assingn element to proper bucket
		for(int num:arr)
		{
			bucket[hashValue(num,buckSize)].add(num);
		}
		//iterate over bucket and Sort element
		for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
		 //gathering the bucket after sorting
		int index=0;
		for(List<Integer> buck:bucket)
		{
			for(int num:buck)
			{
				arr[index++]=num;
			}
		}
		return arr;
	}
	private static int hashValue(int num, int buckSize)
	{
		return num/buckSize;
	}
}


/*
 Enter Any Array Length ?   ?  
14
22
45
12
8
10
6
72
81
50
14
55
0
12
55
0 6 8 10 12 12 14 22 45 50 55 55 72 81

OPERATIONS:=
------------------|
0|-8--6--0        |
1|-12--10--14--12 |
2|-22             |
3|-               |
4|-45             |
5|-50--55--55     |
6|-               |
7|-72--           |
8|-81--           |
9|--              |
------------------|
SORT the List 0;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
--------------------------------------	
SORT the LIST 1;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
----------------------------------------
Sort The List 2;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
----------------------------------------
Sort the List 3;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}			
----------------------------------------
Sort the List 4;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
-----------------------------------------
Sort The List 5;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}				
-----------------------------------------
Sort the List 6;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
-------------------------------------------
Sort The List 7;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
-------------------------------------------
Sort The List 8;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
--------------------------------------------
Sort The List 9;
for(List<Integer> buc:bucket)
		{
			Collections.sort(buc);
		}
-------------------------------------------
All Process Has Been Completed....
Put the First buc list 
int array ;
put the second buc list in the Array
put thre third buc list in the Array
.
.
.
.
Until All Process will has been completed. 
 */






