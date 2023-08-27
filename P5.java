// WAP to find a summation of a digit of a given number. (Iterative and recursive) 

import java.util.*;

public class P5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0, r;
		while(n > 0)
		{
			r = n % 10;
			sum += r;
			n = n / 10;
		}
		System.out.print("Sum is "+sum);

	}

} 

