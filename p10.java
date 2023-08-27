// 10 WAP to find a prime number between range (range should be entered by user). 

import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        int count,n;
        for (int i = a; i <=b ; i++) {
            count=0;
            n=i;
            for (int j = 2; j <(i/2)+1 ; j++) {
                if (n%j==0) {                    
                    count += 1;
                }
            }
            if (count==0) {
                System.out.print(i+" ");
            }
        }

    }
}