 /* Print a following pattern

1
1	2
1	2	3
1	2	3	4
*/

import java.util.*;
public class P6
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for(int i=0; i<n ; i++)
		{
			for(int j=0; j<i ;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}