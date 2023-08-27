import java.util.*;

public class p1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number index : ");
		int n = sc.nextInt();
		int a[] = new int [n];
		int sum = 0 ; 
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Enter array element "+(i+1)+" : ");
			a[i] = sc.nextInt();

			if(a[i] % 2 == 0 )
			{
				sum += a[i];
			}

		}
		System.out.println("Sum is "+sum);

	}
}