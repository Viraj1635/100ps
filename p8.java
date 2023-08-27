// 8 WAP to find a total odd and total even digit of a given number. 


import java.util.*;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        int odd=0,even=0;
        while (a>0) {
            int n=a%10;
            a=a/10;
            if (n%2==0) {
                even++;
            } 
            else {
                odd++;
            }
        }
        System.out.println("Count of Odd number is:"+odd);
        System.out.println("Count of Odd number is:"+even);
    }
}
