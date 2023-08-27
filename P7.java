// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive) 

import java.util.*;

public class P7
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int first_term = 0, second_term = 1;
		int third_term;
		System.out.print(first_term+" "+second_term+" ");
		for(int i = 0 ; i < n ; i++)
		{
			third_term = first_term + second_term;
			System.out.print(third_term+" ");
			first_term = second_term;
			second_term = third_term;
		}
	}
}