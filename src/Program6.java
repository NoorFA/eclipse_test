/*************************************************************
	 *               Name: Noor F. Al-Janabi                *        
	 *                   ID#: E01231631                     *
	 *               COSC 211-0 (Winter-2013)               *
	 *                  March 12, 2013                      *
	 * ---------------------------------------------------  *
	 *                  Lab Assignment #6                   *
	 *  The following methods are defined:                  *
	 *   1- A recursive method-                             *
	 *   forwardsEqualBackwards(int[] a, int start,int end )*
	 *   2- a void method to execute the program            *
	 *                  - execute()                         *
	 *   3- the main method followed by sample outputs.     *
	 ********************************************************/

import java.util.Scanner;
// to gihub


public class Program6 {

	/**
	 * @param args
	 */
	Scanner kb = new Scanner(System.in);
	int size;
	int[] a;
	/*Program6()
	{
		
	}*/
	boolean forwardsEqualBackwards(int[] a, int start, int end )
	{
		if (start>=end)
			return true;
		else 
		{
			if(a[start]==a[end])
				return true && forwardsEqualBackwards(a, start+1, end-1);
			else
				return false;
		}
	}
	
	public void execute()
	{
		System.out.println("enter the size of the array:");
		size=kb.nextInt();
		
		a = new int[size];
		for(int i=0; i< a.length; i++)
		{
			System.out.println("enter the array's elements: ");
			a[i]=kb.nextInt();
		}
		//forwardsEqualBackwards(a, 1, size);
		System.out.println(forwardsEqualBackwards(a, 0, size-1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program6 ob = new Program6();
		ob.execute();
	}

}
/* SAMPLE OUTPUT
 * enter the size of the array:
4
enter the array's elements: 
1
enter the array's elements: 
2
enter the array's elements: 
3
enter the array's elements: 
3
false

enter the size of the array:
4
enter the array's elements: 
1
enter the array's elements: 
2
enter the array's elements: 
2
enter the array's elements: 
1
true
*/
