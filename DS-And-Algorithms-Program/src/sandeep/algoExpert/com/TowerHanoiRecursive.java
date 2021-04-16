package sandeep.algoExpert.com;
import java.util.Scanner;
public class TowerHanoiRecursive 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number Of Disks ?   ?   ? ");
		int n=sc.nextInt();
		
		towHanRec(n,'A','C','B');
	}
	private static void towHanRec(int n, char from_rod, char to_rod, char aux_rod)
	{
		 if (n == 1)
		    {
		        System.out.println("Move disk 1 from rod "+
		                           from_rod+" to rod "+to_rod);
		        return;
		    }
		 towHanRec(n - 1, from_rod, aux_rod, to_rod);
		    System.out.println("Move disk "+ n + " from rod " +
		                       from_rod +" to rod " + to_rod );
		    towHanRec(n - 1, aux_rod, to_rod, from_rod);
		}	
	}
/*
 Enter Any Number Of Disks ?   ?   ? 
2
Move disk 1 from rod A to rod B
Move disk 2 from rod A to rod C
Move disk 1 from rod B to rod C
 */
/*
 Enter Any Number Of Disks ?   ?   ? 
3
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
	
 */
/*
Enter Any Number Of Disks ?   ?   ? 
5
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
Move disk 4 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 2 from rod C to rod A
Move disk 1 from rod B to rod A
Move disk 3 from rod C to rod B
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 5 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
Move disk 3 from rod B to rod A
Move disk 1 from rod C to rod B
Move disk 2 from rod C to rod A
Move disk 1 from rod B to rod A
Move disk 4 from rod B to rod C
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
*/