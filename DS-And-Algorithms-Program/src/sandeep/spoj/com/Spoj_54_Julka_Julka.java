package sandeep.spoj.com;
import java.util.Scanner;
public class Spoj_54_Julka_Julka 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number of Apples   ?   ?    ");
		int apples=sc.nextInt();
		jula_julka(apples);
	}
	private static void jula_julka(int apples)
	{
		int divide=apples/2;
		int klaudia=divide+1;
		int natalia=divide-1;
	//	System.out.println("Klaudia have " + klaudia+ " Apples ");
	//	System.out.println("Natalia have "+ natalia+ " Apples");
		System.out.printf("Klaudia have Apples: %s\nNatalia have Apples: %s",klaudia, natalia);
	}
}

/*
Enter Any Number of Apples   ?   ?    
10
Klaudia have Apples: 6
Natalia have Apples: 4

100000000
Klaudia have Apples: 50000001
Natalia have Apples: 49999999

*/