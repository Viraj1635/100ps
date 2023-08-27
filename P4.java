// WAP to find a factorial of a given integer (iterative and recursive)

import java.util.*;  // Interative
public class P4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i = n ; i > 0 ; i--)
		{
			factorial *= i;
		}
		System.out.println("Factorial of "+n+" is "+factorial);
	}
} 

