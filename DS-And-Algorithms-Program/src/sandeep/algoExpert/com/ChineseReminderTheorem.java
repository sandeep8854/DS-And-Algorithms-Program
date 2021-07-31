package sandeep.algoExpert.com;
import java.util.Scanner;
public class ChineseReminderTheorem
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length Also Called as Number Length ?    ?   ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Same As A Array length (Reminder Also called as  )");
		int remLength=sc.nextInt();
		int remin[]=new int[remLength];
		for(int ii=0;ii<remin.length;ii++)
		{
			remin[ii]=sc.nextInt();
		}	
		int result=XsmallestNumber(arr,remin);
		System.out.println(result);
	}
	private static int XsmallestNumber(int[] arr, int[] remin) 
	{
		int k=arr.length;  //its' length of Number And Reminder Length Both are same;
		int x=1;
		while(true)
		{
			int i;
			for(i=0;i<k;i++) 
			{
				if(x%arr[i]!=remin[i]) 
				{
					break;
				}
			}
			//when find the break statement then terminate for and if ,both loop;
			if(i==k)
				return x;
			else
				x++;
		}	
	}
}

/*
 Enter Array Length Also Called as Number Length ?    ?   
3
3
4
5
Enter Same As A Array length (Reminder Also called as Prime or Coprime Number )
3
2
3
1
11


Explanations:=
Every pair is Coprime (gcd for every pair is 1) 
We need to find minimum positive Number X such That

X % num[0]=reminder[0];
X % num[1]=reminder[1];
.
.
.
.
X% num[k-1]=reminder[k-1];

Example;=
num[]={5,7} , reminder[]={1,3};
Output:= 31

Why =:
Point Number 1-
         - 31 is smallest number such that,
   (i)-
      When we divide it by num[i] or 5 we get reminder 1
      5)31(6
        30
       -----
         1---reminder;
       ------
       
       1 reminder is same as actual reminder value like as reminder[]=1;
       
    (ii)-  When we divide it by num[i] or 7 we get reminder 3
          7)31(4
            28
           -----
             3 - - reminder;
           -----  
        3 reminder is same as actual reminder value like as reminder[]=3;
        
        Like As So On all Operation will be proceed;
 */






