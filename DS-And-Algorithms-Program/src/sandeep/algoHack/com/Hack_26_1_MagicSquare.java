package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_26_1_MagicSquare 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Magic Square ?   ?  ");
		int square[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				square[i][j]=sc.nextInt();
			}
		}
		// We assume that this is a magic square until we prove it is not.
        boolean ismagic = true;
      
      //  Make sure that each number 1 through 9 is in the square exactly once.
        // Create an array to store the number of times each number appears.
        
        int freq[]=new int[10];
        
        // Set each frequency to zero initially.
        // Note: We will NOT use index 0 and we will store how many 1s we see
        //       in index 1, etc.
        
        for(int i=1;i<10;i++)
        {
        	freq[i]=0;
        }
        
        // Loop through each value in the square.
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		 // Invalid number - all values must be between 1 - 9.
        		if(square[i][j] <1 && square[i][j] >9)
        		{
        			ismagic=false;
        			break;
        		}
        		 // Increase the frequncy for this number.
                freq[square[i][j]]++;	
        	}
        }
        // If any number does not appear exactly once then the square is not magic.
        for (int i = 1; i < 10; i++)
        {
            if (freq[i] != 1)
                ismagic = false;
        }
        
        
        /*** Check the sum of the rows, columns and diagonals. ***/
        // Check each row.
        for (int i = 0; i < 3; i++)
        {
            // Find the sum of row #i.
            int sum = 0;
            for (int j = 0; j < 3; j++)
            {
                sum += square[i][j];
            }

            // If this row does not equal 15, then it is not a magic square
            if (sum != 15)
                ismagic = false;
        }
        // Check each column.
        for (int j = 0; j < 3; j++)
        {
            // Find the sum of column #j.
            int sum = 0;
            for (int i = 0; i < 3; i++)
            {
                sum += square[i][j];
            }
            // If this column does not equal 15, then it is not a magic square
            if (sum != 15)
                ismagic = false;
        }
        // Check forward diagonal.
        if (square[0][0] + square[1][1] + square[2][2] != 15)
            ismagic = false;

        // Check backward diagonal.
        if (square[0][2] + square[1][1] + square[2][0] != 15)
            ismagic = false;
        
        /*** Output the Result ***/
        if (ismagic)
            System.out.println("You have a magic square");
        else
            System.out.println("Not a magic square");	
	}
}
/*
Enter Your Magic Square ?   ?  
8
3
4
1
5
9
6
7
2
You have a magic square
*/