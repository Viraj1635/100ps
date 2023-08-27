// WAP to find whether string is palindrome or not.

import java.util.*;
public class P2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String st=sc.next();
		/*int st_length = st.length();
		String strev = "";
		for(int i = st_length - 1 ; i >= 0 ; i--)
		{
			strev += st.charAt(i);
		}

		if(st.equalsIgnoreCase(strev))
		{
			System.out.println("Given String is palidrome");
		}
		else
			System.out.println("Given String is not palidrome");
			*/
		boolean flag = true;
		for(int i = 0 ; i < st.length() ; i++)
		{
			if(st.charAt(i)!=st.charAt(st.length()-i-1))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Given String is palidrome");
		}
		else
			System.out.println("Given String is not palidrome");
	}
}