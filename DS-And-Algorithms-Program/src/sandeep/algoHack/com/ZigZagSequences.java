package sandeep.algoHack.com;
import java.util.Arrays;
import java.util.Scanner;
public class ZigZagSequences 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?  ? ");
		int length=sc.nextInt();
		int sandeepArray[]=new int[length];
		for(int i=0;i<sandeepArray.length;i++)
		{
			sandeepArray[i]=sc.nextInt();
		}
		int result[]=zigzagSequence(sandeepArray);	
		for(int i=0;i<sandeepArray.length;i++)
		{
			System.out.print(sandeepArray[i]+ " ");
		}
	}
	private static int[] zigzagSequence(int[] sandeepArray) 
	{
		Arrays.sort(sandeepArray);
		int n=sandeepArray.length;
		int mid = ((n + 1)/2) - 1;
        int temp = sandeepArray[mid];
        sandeepArray[mid] = sandeepArray[n - 1];
        sandeepArray[n - 1] = temp;
        
        int st = mid + 1;
        int ed = n - 2;
        
        while(st <= ed)
        {
            temp = sandeepArray[st];
            sandeepArray[st] = sandeepArray[ed];
            sandeepArray[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        return sandeepArray;
	}
}

/*
Enter Array Length ?  ? 
7
1
2
3
4
5
6
7
1 2 3 7 6 5 4 
*/
