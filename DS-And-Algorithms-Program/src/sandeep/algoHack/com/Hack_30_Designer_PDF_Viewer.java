package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_30_Designer_PDF_Viewer
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The all Number Like 245689....");
	
		int arr[]=new int[26];
		for(int i=0;i<26;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter any word (maximum length of 10)");
		String word=sc.next();
		viewer(arr,word);
	}
	private static void viewer(int[] arr, String word)
	{
		int max=0;
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(arr[ch-97]>max)
			{
				max=arr[ch-97];
			}		
		}
		System.out.println(word.length()*max);
	}
}
/*
Enter The all Number Like 245689....
1
3
1
3
1
4
1
3
2
5
5
5
5
5
5
5
5
5
5
5
5
5
5
5
5
5
Enter any word (maximum length of 10)
abc
9
*/
/*
Enter The all Number Like 245689....
1
3
1
3
1
4
1
3
2
5
5
5
5
5
5
5
5
5
5
5
5
5
5
5
5
7
Enter any word (maximum length of 10)
zabc
28
*/