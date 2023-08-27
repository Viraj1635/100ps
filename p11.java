// pa11 WAP to find weather given number is Armstrong number is not. 

import java.util.*;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a =sc.nextInt();
        int sum=0,n=a,b;
        while (n>0) {
            b=n%10;
            sum=sum+b*b*b;
            n=n/10;

        }
        if (a==sum) {
            System.out.println("number is armstorng");
        } 
        else {
            System.out.println("number is not armstorng");
        }
    }
}