package sandeep.algoExpert.com;
import java.util.Scanner;
public class TernaryBalanced 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Decimal Number  ?   ?   ");
		int num=sc.nextInt();
		String strRes=ternary(num);
		System.out.println(strRes);
	}
	private static String ternary(int num)
	{
		String result="";
		while(num>0)
		{
			int reminder=num%3;
			num=num/3;
			if(reminder==2)
			{
				reminder=-1;
				num++;
			}
			result=(reminder==0 ? '0' :(reminder==1)? '1':'Z')+result;
		}
		return result;
	}
}

/*
Enter Any Decimal Number  ?   ?   
238
100Z11

Decimal to Ternary
let's N=101;

  3|101| 2  ^
  --------- ^
  3|33|  0  ^
  --------- ^
  3|11|  2  ^
  --------- ^
  3|3 |  0  ^ 
  -------- ^
   |1 |   ^
        ^
      ----------  
        (10202)
               3
      ----------  
Conversion of Decimal to Balanced Ternary system 
The conversion from Decimal to balanced ternary is done in two steps: 
 

Convert decimal to the ternary number system.
Convert ternary to the balanced ternary system, using the below steps: 
traverse the ternary number, right to left by leaving 0 and 1 as it is
when encounter 2, change it to Z and add +1 to the next digit in iteration.
Some digits may become +3, then replace +3 with 0 and add +1 to next digit in iteration.
complete this process until you convert all the digits

Example: convert 23810 to balanced ternary and vice-versa
 

First convert 23810 to ternary number system. 
23810 = 222113 
Second convert ternary to balanced ternary number system : 
 

By starting iteration from left to right, two 1’s are skipped as it remains same in balanced ternary.
Now convert first encountered 2 with z increasing it’s next digit in iteration by +1. So we get 23Z11.
Convert 3 to 0 with increment +1 in it’s next digit in iteration. So we get 30Z11.
Convert 3 to 0 with increment +1 in it’s next digit in iteration. So we get 100Z11. 
(Here assume 0 is present before most significant digit)
The final result is 100Z11.
*/

