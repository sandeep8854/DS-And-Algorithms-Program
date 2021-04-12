package sandeep.algoHack.com;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Non_Degenerate_Triagle 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length  ?  ? ? ");
		int len=sc.nextInt();
		Integer arrSandeep[]=new Integer[len];
		for(int i=0;i<arrSandeep.length;i++)
		{
			arrSandeep[i]=sc.nextInt();
		}
		nonDegenerateOrPossibleTringle(arrSandeep);	
	}
	private static void nonDegenerateOrPossibleTringle(Integer[] arrSandeep)
	{
		    Arrays.sort(arrSandeep,Collections.reverseOrder());
	        for (int i = 0; i < arrSandeep.length - 2; i++)
	        {
	            if (arrSandeep[i] < arrSandeep[i+1] + arrSandeep[i+2])
	            {
	                System.out.println(arrSandeep[i+2] + " " + arrSandeep[i+1] + " " + arrSandeep[i]);
	                return;
	            }
	        }
	        System.out.println(-1);	
	}
}
/*
Enter Array Length  ?  ? ? 
5
1
1
1
3
3
1 3 3
*/
/*
Enter Array Length  ?  ? ? 
6
1
1
1
2
3
5
1 1 1
*/