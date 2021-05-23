package sandeep.algoHack.com;

import java.util.Scanner;

public class Hack_28_Utopian_Tree
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Any array length ?   ?   ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int jj=0; jj< n; jj++){
            arr[jj] = in.nextInt();
            int sum = 1;
            for (int i = 0; i < arr[jj]; i++) {
                sum = i % 2 == 0 ? sum * 2 : sum + 1;
            }
            System.out.println(sum);
        }
		
	}

}
