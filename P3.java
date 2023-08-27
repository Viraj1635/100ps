//WAP to find a Factor of a given number (iterative and recursive) 

import java.util.*;
public  class P3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i < n ; i++)
		{
			if(n%i==0)
				System.out.print(i+"\t");		
		}
	}
	
}