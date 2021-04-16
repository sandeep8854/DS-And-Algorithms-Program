package sandeep.algoExpert.com;
import java.util.Scanner;
public class BinaryRecursiveSearch
//recursive call hahahahahaaahaaas
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?   ? ");
		int len=sc.nextInt();
		int arrSandeep[]=new int[len];
		for(int i=0;i<arrSandeep.length;i++)
		{
			arrSandeep[i]=sc.nextInt();
		}
		System.out.println("Enter the search value ?  ? ");
		int search=sc.nextInt();
		System.out.println("Enter LowerBound  ?    ?  ");
		int lowerBound=sc.nextInt();
		System.out.println("Enter UpperBound ?   ? ");
		int upperBound=sc.nextInt();
		boolean result=recFind(arrSandeep,search,lowerBound,upperBound);
		if(result==true)
		
			System.out.println(search + " item found \nCongratulation!!");
		else
			System.out.println(search + " Not Found Please Choose Correct Value..\nYour Bad Luck");
		
	}
	private static boolean recFind(int[] arrSandeep,int search_1, int lowerBound, int upperBound)
	{
		int middle=(lowerBound+upperBound)/2;
		if(arrSandeep[middle]==search_1)
			return true;
		else if(lowerBound>upperBound)
		{
			return false;
		}
			
		else
		{
			if(arrSandeep[middle]< search_1)
				return recFind(arrSandeep,search_1,middle+1,upperBound);
			else
				return recFind(arrSandeep,search_1,lowerBound,middle-1);
		}
	}
}
/*
Enter Array Length ?   ? 
6
10
30
40
60
80
90
Enter the search value ?  ? 
80
Enter LowerBound  ?    ?  
0
Enter UpperBound ?   ? 
5
80 item found 
Congratulation!!

 */
/*
Enter Array Length ?   ? 
5
10
20
30
40
50
Enter the search value ?  ? 
40
Enter LowerBound  ?    ?  
0
Enter UpperBound ?   ? 
4
40 item found 
Congratulation !!

 */
/*
Enter Array Length ?   ? 
5
1
2
3
4
5
Enter the search value ?  ? 
6
Enter LowerBound  ?    ?  
0
Enter UpperBound ?   ? 
4
6 Not Found Plese Choose Correct Value..
Your Bad Luck
*/