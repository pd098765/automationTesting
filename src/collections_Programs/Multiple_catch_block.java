package collections_Programs;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_catch_block {

	public static void main(String[] args) {

			//[3,5,8,1,0]	
		try
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the size of your Array:");
			int [] rollno=new int[s1.nextInt()];
			
			for(int i=0;i<3;i++)
			{
				System.out.println("Enter the value of Array at the index position->"+ i);
				rollno[i]=s1.nextInt();
			}

			System.out.print("The Final Array is :");
			System.out.println(Arrays.toString(rollno));	
		}
		catch(InputMismatchException p1)
		{
					System.out.println("Exception hanlded 1");
		}
		catch(NegativeArraySizeException p2)
		{
					System.out.println("Exception hanlded 2");
		}
		catch(ArrayIndexOutOfBoundsException p3)
		{
			
					System.out.println("Exception hanlded 3");		
		}		
			
			}			
	}


