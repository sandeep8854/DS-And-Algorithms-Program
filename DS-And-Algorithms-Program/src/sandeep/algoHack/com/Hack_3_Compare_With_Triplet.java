package sandeep.algoHack.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hack_3_Compare_With_Triplet 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length?  ? ");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array Length ?  ? ");
		int len2=sc.nextInt();
		int arr2[]=new int[len2];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		List<Integer> res=triplet(arr1,arr2);	
		for(int i=0;i<res.size();i++)
		{
			System.out.print(res.get(i) + " ");
		}
	}
	private static List<Integer> triplet(int[] a, int[] b)
	{
		int aliceTotalScore=0;
		int bobTotalScore=0;
		for(int i=0;i<3;i++)
		{
			int aliceScore=a[i];
			int bobScore=b[i];
			if(aliceScore!=bobScore) {
				int temp=aliceScore > bobScore ? aliceTotalScore++:bobTotalScore++;
			}
		}
		List<Integer> result=new ArrayList<>();
		result.add(aliceTotalScore);
		result.add(bobTotalScore);	
		return result;
	}
}
/*
Enter Array Length?  ? 
3
1
2
3
Enter Second Array Length ?  ? 
3
3
2
1
1 1 
*/