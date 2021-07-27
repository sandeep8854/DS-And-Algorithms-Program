package sandeep.algoExpert.com;
import java.util.Scanner;
public class Bucket_Sort2
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
		int res[]=bucket_sort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}	
	}
	private static int[] bucket_sort(int[] arr)
	{
		int L=arr.length;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		int sortedArr[]=new int[arr.length];
		int Bucket[]=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			Bucket[arr[i]]++;
		}
		
		int temp=0;
		for(int i=0;i<Bucket.length;i++)
		{
			for(int j=0;j<Bucket[i];j++)
			{
				sortedArr[temp++]=i;
			}
		}
		return sortedArr;
	}
}

/*
Enter Any Array Length ?   ?  
12
22
45
12
8
10
6
72
81
33
18
50
14
6 8 10 12 14 18 22 33 45 50 72 81 

We need 10 buckets to sort the array. Suppose, these 10 buckets are represented as B. After that,
 we need to find a divider that will be used to put the elements in the bucket. 
In order to determine the divider, we use the following formula:
 -----------------------------
 divider=ceil(max+1)/bucket;|
------------------------------

lets put the value above formula

divider=ceil(81+1)/10;
divider=ceil(8.2);
divider=9;
Hence, bucket = 10, divider = 9

Let's put the element arr[i] in the correct bucket, we will use the following formula

B[j]=arr[i](Where ,j=floor(arr[i)/divider)
Let's see how it works by putting elements in the buckets.
 We will start from the first index.
 
 for i=0;
 j=floor(arr[i)/divider;
 floor(22/9)= floor(2.444)=2;
 b[j]=arr[i]=>b[2]=22;
 
 We will insert the zeroth element (22) in the 2nd bucket and increment the array index (i) by 1
 
 continue last array Length;
 After compleating the process
 the create a array and perform insertion and store all value in new array
 and this new array will sorted..

 */

/*
 Rearrange An Array such That 
 arr[i] becomes 'i' if arr[i] is j
 
 arr[i] is 'j' =arr[j] becomes 'i';
 
      --------------------------
 arr=  | 1 | 4 | 0 | 3 | 2 |
      ---|---|---|---|---|------
 index=  0   1   2   3   4 
 
 point-1
 arr[0] is 1 =>arr[1] become 0;
 arr[1] is 4 =>arr[4] become 1;
 arr[2] is 0 =>arr[0] become 2;
 arr[3] is 3 =>arr[3] become 3;
 arr[4] is 2 =>arr[2] become 4;
    
         ---------------------
 temp=  | 2 | 0 | 4 | 3 | 1 | 
         -|---|---|---|---|---------
index=    0   1   2   3   1
       
        FINALLY ARRAY :===
       ---------------------------   
  arr= | 2 | 0 | 4 | 3 | 1 |
       -----------------------------        
   
for(int i=0;i<n;i++)
{
	temp[arr[i]]=i;
}
for(int i=0;i<n;i++)
{
	arr[i]=temp;
}

   
 Note=
 index=element;
 ---------------------------------------------------------|
 //OBSERVATION                                            |
  public class B                                          |
{                                                         |
	public static void main(String[] args)                |
	{                                                     |
	Scanner sc=new Scanner(System.in);                    |
	System.out.println("Enter Any Array Length ?   ?  "); |
	int len=sc.nextInt();                                 |
	int arr[]=new int[len];                               |
	for(int i=0;i<arr.length;i++)                         |
	{                                                     |
		arr[i]=sc.nextInt();                              |
	}                                                     |
	int res[]=bucket_sort(arr);                           |
	for(int i=0;i<res.length;i++)                         |
	{                                                     |
		System.out.print(res[i] + " ");                   |
	}                                                     |
	}                                                     |
	private static int[] bucket_sort(int[] arr)           |
	{                                                     |
		//Cases Number 1:=                                |
		int temp[]=new int[arr.length];                   |
		for(int i=0;i<arr.length;i++)                     |
		{                                                 |
			temp[arr[i]]=i;                               |
		}                                                 |
		return temp;                                      |
	}                                                     |
}                                                         |
Enter Any Array Length ?   ?                              |
5                                                         |
1                                                         |
4                                                         |
0                                                         |
3                                                         |
2                                                         |
2 0 4 3 1                                                 |
----------------------------------------------------------|
----------------------------------------------------------|
put the value temp to arr;                                |
public class B                                            |
{                                                         |
	public static void main(String[] args)                |
	{                                                     |
	Scanner sc=new Scanner(System.in);                    |
	System.out.println("Enter Any Array Length ?   ?  "); |
	int len=sc.nextInt();                                 |
	int arr[]=new int[len];                               |
	for(int i=0;i<arr.length;i++)                         |
	{                                                     |
		arr[i]=sc.nextInt();                              |
	}                                                     |
	int res[]=bucket_sort(arr);                           |
	for(int i=0;i<res.length;i++)                         |
	{                                                     |
		System.out.print(res[i] + " ");                   |
	}                                                     |
}                                                         |
	private static int[] bucket_sort(int[] arr)           |
	{                                                     |
		//Cases Number 1:=                                |
		int temp[]=new int[arr.length];                   |
		for(int i=0;i<arr.length;i++)                     |
		{                                                 |
			temp[arr[i]]=i;                               |
		}                                                 |
		//Cases Number 1:=                                |
		for(int i=0;i<arr.length;i++)                     |
		{                                                 |
			arr[i]=temp[i];                               |
		}                                                 |
		return arr;	                                      |
	}                                                     |
}                                                         |
/*                                                        |
Enter Any Array Length ?   ?                              |
5                                                         |
1                                                         |
4                                                         |
0                                                         |
3                                                         |
2                                                         |
2 0 4 3 1                                                 |
----------------------------------------------------------|
*/

