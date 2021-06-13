package sandeep.projectEuler.com;
import java.util.Scanner;
public class ProjectEuler_7_10001st_Prime3 
{
	 public static void main(String[] args)
	 {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter number to compute the nth prime number: ");
		    int n = sc.nextInt(); 
		   int res=nthprime(n);
		   System.out.println("value of nth prime " + res);
	 }
	 private static int nthprime(int n) 
	 {
		int number=1;
		int count=0;
		int i;
		 while(count<n)
		 {
			 number=number+1;
			 for(i=2;i<=number;i++)
			 {
				 if(number%i==0) {
					 break;
				 }
			 }
			 if(i==number)  //if it is a prime
				 count=count+1;
		 }
		 return number;
	 }
}
/*
Enter number to compute the nth prime number: 
10001
value of nth prime 104743
Enter number to compute the nth prime number: 
6
value of nth prime 13
*/

