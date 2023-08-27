// 9 WAP to find whether a number is Odd or Even without using a % operator. 


import java.util.*;

public class p9{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter no:");
        n=sc.nextInt();
        int i=n/2;  
        int j=n-(i*2);
        // while (j>2) {
        //     j=j/2;
        // }
        if (j==0) {
            System.out.println("given number is Even");
        }
        else{
            System.out.println("given number is odd");
        }
    }
    
}