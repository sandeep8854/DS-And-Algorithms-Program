//f the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters 
//used in total.
//If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
//
package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_17_Number_Letters_Count
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any number between 1 to 1000  ?   ? ");
//		int number=sc.nextInt();
//		int res=numberletter(number);
//		System.out.println(res);
		int one=36;
		int ten=70;
		int fiveLetterTenth=50+one;
		int sixLetterTenth=60+one;
		int sevenLetterTenth=70+one;
		int sum=0;
		int ninetyNine=0;
		
		for(int i=0;i<1000;i+=10)
		{
			if(i<10) 
			{
				sum=sum+one;
			}
			else if(i<20)
			{
				sum=sum+ten;
			}
			else if(i<30)
			{
				sum=sum+sixLetterTenth;
			}
			else if(i<40)
			{
				sum=sum+sixLetterTenth;
			}
			else if(i<50)
			{
				sum=sum+fiveLetterTenth;
			}
			else if(i<60)
			{
				sum=sum+fiveLetterTenth;
			}
			else if(i<70)
			{
				sum=sum+fiveLetterTenth;
			}
			else if(i<80)
			{
				sum=sum+sevenLetterTenth;
			}
			else if (i < 90)  
			{
                sum += sixLetterTenth;
			}
			else if (i < 100)               
            {                              
                sum += sixLetterTenth;
                ninetyNine = sum;           
                i += 90;                   
            }                               
            else if (i < 200)
            {
                sum += 10 + (99 * 13) + ninetyNine;     
                i += 90;
            }
            else if (i < 300)                           
            {
                sum += 10 + (99 * 13) + ninetyNine;
                i += 90;
            }
            else if (i < 400)                          
            {
                sum += 12 + (99 * 15) + ninetyNine;
                i += 90;
            }
            else if (i < 500)                          
            {
                sum += 11 + (99 * 14) + ninetyNine;
                i += 90;
            }
            else if (i < 600)                           
            {
                sum += 11 + (99 * 14) + ninetyNine;
                i += 90;
            }
            else if (i < 700)                           
            {
                sum += 10 + (99 * 13) + ninetyNine;
                i += 90;
            }
            else if (i < 800)                           
            {
                sum += 12 + (99 * 15) + ninetyNine;
                i += 90;
            }
            else if (i < 900)                           
            {
                sum += 12 + (99 * 15) + ninetyNine;
                i += 90;
            }   
            else if (i < 1000) 
            {
                sum += 11 + (99 * 14) + ninetyNine;
            }

            else 
            	{
            	sum += 11;  
            	}	
		}
		System.out.println(sum+ ":= letters will would be used");
	}	
}

/*
21113:= letters will would be used
*/
