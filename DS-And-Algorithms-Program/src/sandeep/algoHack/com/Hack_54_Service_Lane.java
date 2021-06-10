package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_54_Service_Lane 
{
	public static void main(String[] args) 
	{
		    Scanner sc=new Scanner(System.in);
			System.out.println("Enter Any Array Length ? ?  ");
			int len=sc.nextInt();
			System.out.println("Enter Any Test Cases ? ?  ");
			int t=sc.nextInt();
			int arr[]=new int[len];
			for(int ii=0;ii<arr.length;ii++)
			{
				arr[ii]=sc.nextInt();
			}
		//	System.out.println("Enter Any Test Cases ? ?  "); (for running purpose)
	//		int t=sc.nextInt();
			for(int ii=0;ii<t;ii++)
			{
			System.out.println("Enter any entry level number   ?  ?    ");
			int entry=sc.nextInt();
			System.out.println("Enter Any exit level number ?  ? ");
			int exit=sc.nextInt();
			int result=service(arr,entry,exit);
			System.out.println(result);
			}	
	}
	private static int service(int[] arr, int entry, int exit) 
	{
		int minNumber=arr[entry];
        for(int i=entry+1;i<=exit;i++)
        {
            if(minNumber>arr[i])
            {
                minNumber=arr[i];
            }
        }
        return minNumber;
	}
}
/*
 Enter Any Array Length ? ?  
8
2
3
1
2
3
2
3
3
Enter Any Test Cases ? ?  
5
Enter any entry level number   ?  ?    
0
Enter Any exit level number ?  ? 
3
1
Enter any entry level number   ?  ?    
4
Enter Any exit level number ?  ? 
6
2
Enter any entry level number   ?  ?    
6
Enter Any exit level number ?  ? 
7
3
Enter any entry level number   ?  ?    
3
Enter Any exit level number ?  ? 
5
2
Enter any entry level number   ?  ?    
0
Enter Any exit level number ?  ? 
7
1

 */

